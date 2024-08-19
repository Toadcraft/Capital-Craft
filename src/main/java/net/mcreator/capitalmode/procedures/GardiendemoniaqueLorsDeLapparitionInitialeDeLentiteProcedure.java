package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class GardiendemoniaqueLorsDeLapparitionInitialeDeLentiteProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Vous voulez tenter de me battre ? Allons-y !"), false);
	}
}
