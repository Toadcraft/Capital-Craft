package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.init.CapitalModeModBlocks;

public class CobaltplantupProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), CapitalModeModBlocks.COBALTPLANT.get().defaultBlockState(), 3);
	}
}