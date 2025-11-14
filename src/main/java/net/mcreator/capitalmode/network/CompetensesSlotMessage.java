package net.mcreator.capitalmode.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.procedures.*;
import net.mcreator.capitalmode.CapitalModeMod;

@EventBusSubscriber
public record CompetensesSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) implements CustomPacketPayload {

	public static final Type<CompetensesSlotMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "competenses_slots"));
	public static final StreamCodec<RegistryFriendlyByteBuf, CompetensesSlotMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, CompetensesSlotMessage message) -> {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}, (RegistryFriendlyByteBuf buffer) -> new CompetensesSlotMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<CompetensesSlotMessage> type() {
		return TYPE;
	}

	public static void handleData(final CompetensesSlotMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleSlotAction(context.player(), message.slotID, message.changeType, message.meta, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 0 && changeType == 1) {
			int amount = meta;

			Competense01Procedure.execute(entity);
		}
		if (slot == 1 && changeType == 1) {
			int amount = meta;

			Competense02Procedure.execute(entity);
		}
		if (slot == 2 && changeType == 1) {
			int amount = meta;

			Competense03Procedure.execute(entity);
		}
		if (slot == 3 && changeType == 1) {
			int amount = meta;

			Competense04Procedure.execute(entity);
		}
		if (slot == 4 && changeType == 1) {
			int amount = meta;

			Competense05Procedure.execute(entity);
		}
		if (slot == 5 && changeType == 1) {
			int amount = meta;

			Competense06Procedure.execute(entity);
		}
		if (slot == 6 && changeType == 1) {
			int amount = meta;

			Competense07Procedure.execute(entity);
		}
		if (slot == 7 && changeType == 1) {
			int amount = meta;

			Competense08Procedure.execute(entity);
		}
		if (slot == 8 && changeType == 1) {
			int amount = meta;

			Competense09Procedure.execute(entity);
		}
		if (slot == 9 && changeType == 1) {
			int amount = meta;

			Competense10Procedure.execute(entity);
		}
		if (slot == 10 && changeType == 1) {
			int amount = meta;

			Competense11Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CapitalModeMod.addNetworkMessage(CompetensesSlotMessage.TYPE, CompetensesSlotMessage.STREAM_CODEC, CompetensesSlotMessage::handleData);
	}
}