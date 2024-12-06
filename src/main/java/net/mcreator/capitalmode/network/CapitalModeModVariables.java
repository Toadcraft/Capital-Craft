package net.mcreator.capitalmode.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.capitalmode.CapitalModeMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CapitalModeModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CapitalModeMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		CapitalModeMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
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
			if (!event.isWasDeath()) {
				clone.energie_nombre = original.energie_nombre;
				clone.Kill_streak = original.Kill_streak;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					CapitalModeMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					CapitalModeMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					CapitalModeMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "capital_mode_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				CapitalModeMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "capital_mode_mapvars";
		public double lvl_spawn = 0;
		public double argent_spawn = 0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			lvl_spawn = nbt.getDouble("lvl_spawn");
			argent_spawn = nbt.getDouble("argent_spawn");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("lvl_spawn", lvl_spawn);
			nbt.putDouble("argent_spawn", argent_spawn);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				CapitalModeMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("capital_mode", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
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
		public double energie_nombre = 0;
		public double Argent = 0.0;
		public double Kill_streak = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CapitalModeMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("xp_mineur", xp_mineur);
			nbt.putDouble("lvl_mineur", lvl_mineur);
			nbt.putDouble("xp_paysan", xp_paysan);
			nbt.putDouble("lvl_paysan", lvl_paysan);
			nbt.putDouble("xp_guerrier", xp_guerrier);
			nbt.putDouble("lvl_guerrier", lvl_guerrier);
			nbt.putDouble("skills_points", skills_points);
			nbt.putDouble("skill_01", skill_01);
			nbt.putDouble("skill_02", skill_02);
			nbt.putDouble("skill_03", skill_03);
			nbt.putDouble("skill_04", skill_04);
			nbt.putDouble("skill_05", skill_05);
			nbt.putDouble("skill_06", skill_06);
			nbt.putDouble("skill_07", skill_07);
			nbt.putDouble("skill_08", skill_08);
			nbt.putDouble("skill_09", skill_09);
			nbt.putDouble("skill_10", skill_10);
			nbt.putDouble("skill_11", skill_11);
			nbt.putDouble("Rank", Rank);
			nbt.putDouble("skill_12", skill_12);
			nbt.putDouble("energie_nombre", energie_nombre);
			nbt.putDouble("Argent", Argent);
			nbt.putDouble("Kill_streak", Kill_streak);
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			xp_mineur = nbt.getDouble("xp_mineur");
			lvl_mineur = nbt.getDouble("lvl_mineur");
			xp_paysan = nbt.getDouble("xp_paysan");
			lvl_paysan = nbt.getDouble("lvl_paysan");
			xp_guerrier = nbt.getDouble("xp_guerrier");
			lvl_guerrier = nbt.getDouble("lvl_guerrier");
			skills_points = nbt.getDouble("skills_points");
			skill_01 = nbt.getDouble("skill_01");
			skill_02 = nbt.getDouble("skill_02");
			skill_03 = nbt.getDouble("skill_03");
			skill_04 = nbt.getDouble("skill_04");
			skill_05 = nbt.getDouble("skill_05");
			skill_06 = nbt.getDouble("skill_06");
			skill_07 = nbt.getDouble("skill_07");
			skill_08 = nbt.getDouble("skill_08");
			skill_09 = nbt.getDouble("skill_09");
			skill_10 = nbt.getDouble("skill_10");
			skill_11 = nbt.getDouble("skill_11");
			Rank = nbt.getDouble("Rank");
			skill_12 = nbt.getDouble("skill_12");
			energie_nombre = nbt.getDouble("energie_nombre");
			Argent = nbt.getDouble("Argent");
			Kill_streak = nbt.getDouble("Kill_streak");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.xp_mineur = message.data.xp_mineur;
					variables.lvl_mineur = message.data.lvl_mineur;
					variables.xp_paysan = message.data.xp_paysan;
					variables.lvl_paysan = message.data.lvl_paysan;
					variables.xp_guerrier = message.data.xp_guerrier;
					variables.lvl_guerrier = message.data.lvl_guerrier;
					variables.skills_points = message.data.skills_points;
					variables.skill_01 = message.data.skill_01;
					variables.skill_02 = message.data.skill_02;
					variables.skill_03 = message.data.skill_03;
					variables.skill_04 = message.data.skill_04;
					variables.skill_05 = message.data.skill_05;
					variables.skill_06 = message.data.skill_06;
					variables.skill_07 = message.data.skill_07;
					variables.skill_08 = message.data.skill_08;
					variables.skill_09 = message.data.skill_09;
					variables.skill_10 = message.data.skill_10;
					variables.skill_11 = message.data.skill_11;
					variables.Rank = message.data.Rank;
					variables.skill_12 = message.data.skill_12;
					variables.energie_nombre = message.data.energie_nombre;
					variables.Argent = message.data.Argent;
					variables.Kill_streak = message.data.Kill_streak;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
