package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.init.CapitalModeModBlocks;

public class CableModelUpdaterMainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE.get())) {
			CableModelUpdaterNProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLEE.get())) {
			CableModelUpdaterEProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLEI.get())) {
			CableModelUpdaterIProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLEL.get())) {
			CableModelUpdaterLProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_LC.get())) {
			CableModelUpdaterLCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_LCC.get())) {
			CableModelUpdaterLCCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_LT.get())) {
			CableModelUpdaterLTProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_LTC.get())) {
			CableModelUpdaterLTCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_T.get())) {
			CableModelUpdaterTProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_TC.get())) {
			CableModelUpdaterTCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_TX.get())) {
			CableModelUpdaterTXProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_TXC.get())) {
			CableModelUpdaterTXCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_TXCC.get())) {
			CableModelUpdaterTXCCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_X.get())) {
			CableModelUpdaterXProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_XC.get())) {
			CableModelUpdaterXCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_F.get())) {
			CableModelUpdaterFProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CABLE_S.get())) {
			CableModelUpdaterSProcedure.execute(world, x, y, z);
		}
	}
}