
package net.mcreator.capitalmode.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.world.inventory.ATMdeposeMenu;
import net.mcreator.capitalmode.procedures.Retire1eProcedure;
import net.mcreator.capitalmode.procedures.Retire10eProcedure;
import net.mcreator.capitalmode.procedures.Retire100eProcedure;
import net.mcreator.capitalmode.procedures.Retire1000eProcedure;
import net.mcreator.capitalmode.procedures.OuvrirATMProcedure;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ATMdeposeButtonMessage {
	private final int buttonID, x, y, z;

	public ATMdeposeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ATMdeposeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ATMdeposeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ATMdeposeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = ATMdeposeMenu.guistate;
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
		CapitalModeMod.addNetworkMessage(ATMdeposeButtonMessage.class, ATMdeposeButtonMessage::buffer, ATMdeposeButtonMessage::new, ATMdeposeButtonMessage::handler);
	}
}
