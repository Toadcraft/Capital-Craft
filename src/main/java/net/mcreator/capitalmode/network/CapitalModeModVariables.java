package net.mcreator.capitalmode.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.ValueIOSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.TagValueOutput;
import net.minecraft.world.level.storage.TagValueInput;
import net.minecraft.world.level.saveddata.SavedDataType;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.ProblemReporter;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;

import net.mcreator.capitalmode.CapitalModeMod;

import java.util.function.Supplier;

@EventBusSubscriber
public class CapitalModeModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, CapitalModeMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CapitalModeMod.addNetworkMessage(SavedDataSyncMessage.TYPE, SavedDataSyncMessage.STREAM_CODEC, SavedDataSyncMessage::handleData);
		CapitalModeMod.addNetworkMessage(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC, PlayerVariablesSyncMessage::handleData);
	}

	@SubscribeEvent
	public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (event.getEntity() instanceof ServerPlayer player)
			PacketDistributor.sendToPlayer(player, new PlayerVariablesSyncMessage(player.getData(PLAYER_VARIABLES)));
	}

	@SubscribeEvent
	public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (event.getEntity() instanceof ServerPlayer player)
			PacketDistributor.sendToPlayer(player, new PlayerVariablesSyncMessage(player.getData(PLAYER_VARIABLES)));
	}

	@SubscribeEvent
	public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (event.getEntity() instanceof ServerPlayer player)
			PacketDistributor.sendToPlayer(player, new PlayerVariablesSyncMessage(player.getData(PLAYER_VARIABLES)));
	}

	@SubscribeEvent
	public static void onPlayerTickUpdateSyncPlayerVariables(PlayerTickEvent.Post event) {
		if (event.getEntity() instanceof ServerPlayer player && player.getData(PLAYER_VARIABLES)._syncDirty) {
			PacketDistributor.sendToPlayer(player, new PlayerVariablesSyncMessage(player.getData(PLAYER_VARIABLES)));
			player.getData(PLAYER_VARIABLES)._syncDirty = false;
		}
	}

	@SubscribeEvent
	public static void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = event.getOriginal().getData(PLAYER_VARIABLES);
		PlayerVariables clone = new PlayerVariables();
		clone.xp_mineur = original.xp_mineur;
		clone.lvl_mineur = original.lvl_mineur;
		clone.xp_paysan = original.xp_paysan;
		clone.lvl_paysan = original.lvl_paysan;
		clone.xp_guerrier = original.xp_guerrier;
		clone.lvl_guerrier = original.lvl_guerrier;
		clone.skills_points = original.skills_points;
		clone.skill_01 = original.skill_01;
		clone.skill_02 = original.skill_02;
		clone.skill_03 = original.skill_03;
		clone.skill_04 = original.skill_04;
		clone.skill_05 = original.skill_05;
		clone.skill_06 = original.skill_06;
		clone.skill_07 = original.skill_07;
		clone.skill_08 = original.skill_08;
		clone.skill_09 = original.skill_09;
		clone.skill_10 = original.skill_10;
		clone.skill_11 = original.skill_11;
		clone.Rank = original.Rank;
		clone.skill_12 = original.skill_12;
		clone.Argent = original.Argent;
		clone.Mana_max = original.Mana_max;
		if (!event.isWasDeath()) {
			clone.Mana = original.Mana;
			clone.Kill_streak = original.Kill_streak;
		}
		event.getEntity().setData(PLAYER_VARIABLES, clone);
	}

	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (event.getEntity() instanceof ServerPlayer player) {
			SavedData mapdata = MapVariables.get(event.getEntity().level());
			SavedData worlddata = WorldVariables.get(event.getEntity().level());
			if (mapdata != null)
				PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (event.getEntity() instanceof ServerPlayer player) {
			SavedData worlddata = WorldVariables.get(event.getEntity().level());
			if (worlddata != null)
				PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		if (event.getLevel() instanceof ServerLevel level) {
			WorldVariables worldVariables = WorldVariables.get(level);
			if (worldVariables._syncDirty) {
				PacketDistributor.sendToPlayersInDimension(level, new SavedDataSyncMessage(1, worldVariables));
				worldVariables._syncDirty = false;
			}
			MapVariables mapVariables = MapVariables.get(level);
			if (mapVariables._syncDirty) {
				PacketDistributor.sendToAllPlayers(new SavedDataSyncMessage(0, mapVariables));
				mapVariables._syncDirty = false;
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final SavedDataType<WorldVariables> TYPE = new SavedDataType<>("capital_mode_worldvars", ctx -> new WorldVariables(), ctx -> CompoundTag.CODEC.xmap(tag -> {
			WorldVariables instance = new WorldVariables();
			instance.read(tag, ctx.levelOrThrow().registryAccess());
			return instance;
		}, instance -> instance.save(new CompoundTag(), ctx.levelOrThrow().registryAccess())));
		boolean _syncDirty = false;

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
		}

		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			return nbt;
		}

		public void markSyncDirty() {
			this.setDirty();
			this._syncDirty = true;
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(WorldVariables.TYPE);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final SavedDataType<MapVariables> TYPE = new SavedDataType<>("capital_mode_mapvars", ctx -> new MapVariables(), ctx -> CompoundTag.CODEC.xmap(tag -> {
			MapVariables instance = new MapVariables();
			instance.read(tag, ctx.levelOrThrow().registryAccess());
			return instance;
		}, instance -> instance.save(new CompoundTag(), ctx.levelOrThrow().registryAccess())));
		boolean _syncDirty = false;
		public double lvl_spawn = 0;
		public double argent_spawn = 0;

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			lvl_spawn = nbt.getDoubleOr("lvl_spawn", 0);
			argent_spawn = nbt.getDoubleOr("argent_spawn", 0);
		}

		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			nbt.putDouble("lvl_spawn", lvl_spawn);
			nbt.putDouble("argent_spawn", argent_spawn);
			return nbt;
		}

		public void markSyncDirty() {
			this.setDirty();
			this._syncDirty = true;
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAccessor) {
				return serverLevelAccessor.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(MapVariables.TYPE);
			} else {
				return clientSide;
			}
		}
	}

	public record SavedDataSyncMessage(int dataType, SavedData data) implements CustomPacketPayload {
		public static final Type<SavedDataSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "saved_data_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, SavedDataSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SavedDataSyncMessage message) -> {
			buffer.writeInt(message.dataType);
			if (message.data instanceof MapVariables mapVariables)
				buffer.writeNbt(mapVariables.save(new CompoundTag(), buffer.registryAccess()));
			else if (message.data instanceof WorldVariables worldVariables)
				buffer.writeNbt(worldVariables.save(new CompoundTag(), buffer.registryAccess()));
		}, (RegistryFriendlyByteBuf buffer) -> {
			int dataType = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			SavedData data = null;
			if (nbt != null) {
				data = dataType == 0 ? new MapVariables() : new WorldVariables();
				if (data instanceof MapVariables mapVariables)
					mapVariables.read(nbt, buffer.registryAccess());
				else if (data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt, buffer.registryAccess());
			}
			return new SavedDataSyncMessage(dataType, data);
		});

		@Override
		public Type<SavedDataSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final SavedDataSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> {
					if (message.dataType == 0)
						MapVariables.clientSide.read(((MapVariables) message.data).save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
					else
						WorldVariables.clientSide.read(((WorldVariables) message.data).save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}

	public static class PlayerVariables implements ValueIOSerializable {
		boolean _syncDirty = false;
		public double xp_mineur = 0;
		public double lvl_mineur = 0;
		public double xp_paysan = 0;
		public double lvl_paysan = 0;
		public double xp_guerrier = 0;
		public double lvl_guerrier = 0;
		public double skills_points = 0;
		public double skill_01 = 0;
		public double skill_02 = 0;
		public double skill_03 = 0;
		public double skill_04 = 0;
		public double skill_05 = 0;
		public double skill_06 = 0;
		public double skill_07 = 0;
		public double skill_08 = 0;
		public double skill_09 = 0;
		public double skill_10 = 0;
		public double skill_11 = 0;
		public double Rank = 0;
		public double skill_12 = 0;
		public double Mana = 1000.0;
		public double Argent = 0.0;
		public double Kill_streak = 0;
		public double Mana_max = 10000.0;

		@Override
		public void serialize(ValueOutput output) {
			output.putDouble("xp_mineur", xp_mineur);
			output.putDouble("lvl_mineur", lvl_mineur);
			output.putDouble("xp_paysan", xp_paysan);
			output.putDouble("lvl_paysan", lvl_paysan);
			output.putDouble("xp_guerrier", xp_guerrier);
			output.putDouble("lvl_guerrier", lvl_guerrier);
			output.putDouble("skills_points", skills_points);
			output.putDouble("skill_01", skill_01);
			output.putDouble("skill_02", skill_02);
			output.putDouble("skill_03", skill_03);
			output.putDouble("skill_04", skill_04);
			output.putDouble("skill_05", skill_05);
			output.putDouble("skill_06", skill_06);
			output.putDouble("skill_07", skill_07);
			output.putDouble("skill_08", skill_08);
			output.putDouble("skill_09", skill_09);
			output.putDouble("skill_10", skill_10);
			output.putDouble("skill_11", skill_11);
			output.putDouble("Rank", Rank);
			output.putDouble("skill_12", skill_12);
			output.putDouble("Mana", Mana);
			output.putDouble("Argent", Argent);
			output.putDouble("Kill_streak", Kill_streak);
			output.putDouble("Mana_max", Mana_max);
		}

		@Override
		public void deserialize(ValueInput input) {
			xp_mineur = input.getDoubleOr("xp_mineur", 0);
			lvl_mineur = input.getDoubleOr("lvl_mineur", 0);
			xp_paysan = input.getDoubleOr("xp_paysan", 0);
			lvl_paysan = input.getDoubleOr("lvl_paysan", 0);
			xp_guerrier = input.getDoubleOr("xp_guerrier", 0);
			lvl_guerrier = input.getDoubleOr("lvl_guerrier", 0);
			skills_points = input.getDoubleOr("skills_points", 0);
			skill_01 = input.getDoubleOr("skill_01", 0);
			skill_02 = input.getDoubleOr("skill_02", 0);
			skill_03 = input.getDoubleOr("skill_03", 0);
			skill_04 = input.getDoubleOr("skill_04", 0);
			skill_05 = input.getDoubleOr("skill_05", 0);
			skill_06 = input.getDoubleOr("skill_06", 0);
			skill_07 = input.getDoubleOr("skill_07", 0);
			skill_08 = input.getDoubleOr("skill_08", 0);
			skill_09 = input.getDoubleOr("skill_09", 0);
			skill_10 = input.getDoubleOr("skill_10", 0);
			skill_11 = input.getDoubleOr("skill_11", 0);
			Rank = input.getDoubleOr("Rank", 0);
			skill_12 = input.getDoubleOr("skill_12", 0);
			Mana = input.getDoubleOr("Mana", 0);
			Argent = input.getDoubleOr("Argent", 0);
			Kill_streak = input.getDoubleOr("Kill_streak", 0);
			Mana_max = input.getDoubleOr("Mana_max", 0);
		}

		public void markSyncDirty() {
			_syncDirty = true;
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "player_variables_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, PlayerVariablesSyncMessage message) -> {
			TagValueOutput output = TagValueOutput.createWithoutContext(ProblemReporter.DISCARDING);
			message.data.serialize(output);
			buffer.writeNbt(output.buildResult());
		}, (RegistryFriendlyByteBuf buffer) -> {
			PlayerVariablesSyncMessage message = new PlayerVariablesSyncMessage(new PlayerVariables());
			message.data.deserialize(TagValueInput.create(ProblemReporter.DISCARDING, buffer.registryAccess(), buffer.readNbt()));
			return message;
		});

		@Override
		public Type<PlayerVariablesSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> {
					TagValueOutput output = TagValueOutput.createWithContext(ProblemReporter.DISCARDING, context.player().registryAccess());
					message.data.serialize(output);
					context.player().getData(PLAYER_VARIABLES).deserialize(TagValueInput.create(ProblemReporter.DISCARDING, context.player().registryAccess(), output.buildResult()));
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}