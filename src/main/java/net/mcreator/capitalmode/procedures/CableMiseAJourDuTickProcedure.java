package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CableMiseAJourDuTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CableModelUpdaterMainProcedure.execute(world, x, y, z);
		CableForgeEnergyMainProcedure.execute(world, x, y, z);
	}
}