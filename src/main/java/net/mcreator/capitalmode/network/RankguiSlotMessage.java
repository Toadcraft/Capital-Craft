
package net.mcreator.capitalmode.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.world.inventory.RankguiMenu;
import net.mcreator.capitalmode.procedures.NetheriteRankUnlockProcedure;
import net.mcreator.capitalmode.procedures.IronRankUnlockProcedure;
import net.mcreator.capitalmode.procedures.IridiumRankUnlockProcedure;
import net.mcreator.capitalmode.procedures.GoldRankUnlockProcedure;
import net.mcreator.capitalmode.procedures.DiamondRankUnlockProcedure;
import net.mcreator.capitalmode.procedures.CobaltRankUnlockProcedure;
import net.mcreator.capitalmode.procedures.CoalRankUnlockProcedure;
import net.mcreator.capitalmode.procedures.CapitalRankUnlockProcedure;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RankguiSlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public RankguiSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public RankguiSlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(RankguiSlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(RankguiSlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = RankguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 0 && changeType == 1) {

			CoalRankUnlockProcedure.execute(entity);
		}
		if (slot == 1 && changeType == 1) {

			IronRankUnlockProcedure.execute(entity);
		}
		if (slot == 2 && changeType == 1) {

			GoldRankUnlockProcedure.execute(entity);
		}
		if (slot == 3 && changeType == 1) {

			DiamondRankUnlockProcedure.execute(entity);
		}
		if (slot == 4 && changeType == 1) {

			NetheriteRankUnlockProcedure.execute(entity);
		}
		if (slot == 5 && changeType == 1) {

			CobaltRankUnlockProcedure.execute(entity);
		}
		if (slot == 6 && changeType == 1) {

			CapitalRankUnlockProcedure.execute(entity);
		}
		if (slot == 7 && changeType == 1) {

			IridiumRankUnlockProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CapitalModeMod.addNetworkMessage(RankguiSlotMessage.class, RankguiSlotMessage::buffer, RankguiSlotMessage::new, RankguiSlotMessage::handler);
	}
}
