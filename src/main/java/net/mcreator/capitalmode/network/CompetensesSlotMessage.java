
package net.mcreator.capitalmode.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.world.inventory.CompetensesMenu;
import net.mcreator.capitalmode.procedures.Competense11Procedure;
import net.mcreator.capitalmode.procedures.Competense10Procedure;
import net.mcreator.capitalmode.procedures.Competense09Procedure;
import net.mcreator.capitalmode.procedures.Competense08Procedure;
import net.mcreator.capitalmode.procedures.Competense07Procedure;
import net.mcreator.capitalmode.procedures.Competense06Procedure;
import net.mcreator.capitalmode.procedures.Competense05Procedure;
import net.mcreator.capitalmode.procedures.Competense04Procedure;
import net.mcreator.capitalmode.procedures.Competense03Procedure;
import net.mcreator.capitalmode.procedures.Competense02Procedure;
import net.mcreator.capitalmode.procedures.Competense01Procedure;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompetensesSlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public CompetensesSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public CompetensesSlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(CompetensesSlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(CompetensesSlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = CompetensesMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 0 && changeType == 1) {

			Competense01Procedure.execute(entity);
		}
		if (slot == 1 && changeType == 1) {

			Competense02Procedure.execute(entity);
		}
		if (slot == 2 && changeType == 1) {

			Competense03Procedure.execute(entity);
		}
		if (slot == 3 && changeType == 1) {

			Competense04Procedure.execute(entity);
		}
		if (slot == 4 && changeType == 1) {

			Competense05Procedure.execute(entity);
		}
		if (slot == 5 && changeType == 1) {

			Competense06Procedure.execute(entity);
		}
		if (slot == 6 && changeType == 1) {

			Competense07Procedure.execute(entity);
		}
		if (slot == 7 && changeType == 1) {

			Competense08Procedure.execute(entity);
		}
		if (slot == 8 && changeType == 1) {

			Competense09Procedure.execute(entity);
		}
		if (slot == 9 && changeType == 1) {

			Competense10Procedure.execute(entity);
		}
		if (slot == 10 && changeType == 1) {

			Competense11Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CapitalModeMod.addNetworkMessage(CompetensesSlotMessage.class, CompetensesSlotMessage::buffer, CompetensesSlotMessage::new, CompetensesSlotMessage::handler);
	}
}
