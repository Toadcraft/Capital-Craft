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

import net.mcreator.capitalmode.procedures.OuvrirATMProcedure;
import net.mcreator.capitalmode.procedures.Donner1eProcedure;
import net.mcreator.capitalmode.procedures.Donner10eProcedure;
import net.mcreator.capitalmode.procedures.Donner100eProcedure;
import net.mcreator.capitalmode.procedures.Donner1000eProcedure;
import net.mcreator.capitalmode.CapitalModeMod;

@EventBusSubscriber
public record ATMretireButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<ATMretireButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "at_mretire_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ATMretireButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ATMretireButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new ATMretireButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<ATMretireButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final ATMretireButtonMessage message, final IPayloadContext context) {
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

			Donner1eProcedure.execute(entity);
		}
		if (buttonID == 1) {

			Donner10eProcedure.execute(entity);
		}
		if (buttonID == 2) {

			Donner100eProcedure.execute(entity);
		}
		if (buttonID == 3) {

			Donner1000eProcedure.execute(entity);
		}
		if (buttonID == 4) {

			OuvrirATMProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CapitalModeMod.addNetworkMessage(ATMretireButtonMessage.TYPE, ATMretireButtonMessage.STREAM_CODEC, ATMretireButtonMessage::handleData);
	}
}