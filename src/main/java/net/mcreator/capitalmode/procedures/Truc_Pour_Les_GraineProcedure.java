package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import net.mcreator.capitalmode.init.CapitalModeModItems;
import net.mcreator.capitalmode.init.CapitalModeModBlocks;

public class Truc_Pour_Les_GraineProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == CapitalModeModBlocks.DOLOMITE_FARMLAND.get().defaultBlockState() && ((world.getBlockState(BlockPos.containing(x, y + 1, z))) == Blocks.AIR.defaultBlockState()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))) == Blocks.VOID_AIR.defaultBlockState() || (world.getBlockState(BlockPos.containing(x, y + 1, z))) == Blocks.CAVE_AIR.defaultBlockState())) {
			if (getEntityGameType(entity) == GameType.CREATIVE) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CapitalModeModBlocks.CAPITALPLANT.get().defaultBlockState(), 3);
			} else {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CapitalModeModItems.CAPITALSEED.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				world.setBlock(BlockPos.containing(x, y + 1, z), CapitalModeModBlocks.CAPITALPLANT.get().defaultBlockState(), 3);
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}