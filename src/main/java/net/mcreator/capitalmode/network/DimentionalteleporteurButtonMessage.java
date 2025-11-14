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

import net.mcreator.capitalmode.procedures.TpoverworldProcedure;
import net.mcreator.capitalmode.procedures.TpnetherProcedure;
import net.mcreator.capitalmode.procedures.TpendProcedure;
import net.mcreator.capitalmode.procedures.TpDemonWorldProcedure;
import net.mcreator.capitalmode.CapitalModeMod;

@EventBusSubscriber
public record DimentionalteleporteurButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<DimentionalteleporteurButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "dimentionalteleporteur_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, DimentionalteleporteurButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, DimentionalteleporteurButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new DimentionalteleporteurButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<DimentionalteleporteurButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final DimentionalteleporteurButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TpoverworldProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			TpnetherProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			TpendProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			TpDemonWorldProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CapitalModeMod.addNetworkMessage(DimentionalteleporteurButtonMessage.TYPE, DimentionalteleporteurButtonMessage.STREAM_CODEC, DimentionalteleporteurButtonMessage::handleData);
	}
}