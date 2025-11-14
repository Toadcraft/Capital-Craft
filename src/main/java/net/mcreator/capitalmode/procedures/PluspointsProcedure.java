package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class PluspointsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
			_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 1;
			_vars.markSyncDirty();
		}
	}
}