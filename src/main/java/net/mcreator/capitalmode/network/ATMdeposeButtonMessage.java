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

import net.mcreator.capitalmode.procedures.Retire1eProcedure;
import net.mcreator.capitalmode.procedures.Retire10eProcedure;
import net.mcreator.capitalmode.procedures.Retire100eProcedure;
import net.mcreator.capitalmode.procedures.Retire1000eProcedure;
import net.mcreator.capitalmode.procedures.OuvrirATMProcedure;
import net.mcreator.capitalmode.CapitalModeMod;

@EventBusSubscriber
public record ATMdeposeButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<ATMdeposeButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "at_mdepose_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ATMdeposeButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ATMdeposeButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new ATMdeposeButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<ATMdeposeButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final ATMdeposeButtonMessage message, final IPayloadContext context) {
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

			Retire1eProcedure.execute(entity);
		}
		if (buttonID == 1) {

			Retire10eProcedure.execute(entity);
		}
		if (buttonID == 2) {

			Retire100eProcedure.execute(entity);
		}
		if (buttonID == 3) {

			Retire1000eProcedure.execute(entity);
		}
		if (buttonID == 4) {

			OuvrirATMProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CapitalModeMod.addNetworkMessage(ATMdeposeButtonMessage.TYPE, ATMdeposeButtonMessage.STREAM_CODEC, ATMdeposeButtonMessage::handleData);
	}
}