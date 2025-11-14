package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CableForgeEnergySidesProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		double sides = 0;
		boolean east = false;
		boolean south = false;
		boolean north = false;
		boolean west = false;
		boolean up = false;
		boolean down = false;
		south = CableForgeEnergySouthProcedure.execute(world, x, y, z);
		north = CableForgeEnergyNorthProcedure.execute(world, x, y, z);
		east = CableForgeEnergyEastProcedure.execute(world, x, y, z);
		west = CableForgeEnergyWestProcedure.execute(world, x, y, z);
		up = CableForgeEnergyUpProcedure.execute(world, x, y, z);
		down = CableForgeEnergyDownProcedure.execute(world, x, y, z);
		sides = 0;
		if (south) {
			sides = sides + 1;
		}
		if (north) {
			sides = sides + 1;
		}
		if (east) {
			sides = sides + 1;
		}
		if (west) {
			sides = sides + 1;
		}
		if (up) {
			sides = sides + 1;
		}
		if (down) {
			sides = sides + 1;
		}
		return sides;
	}
}