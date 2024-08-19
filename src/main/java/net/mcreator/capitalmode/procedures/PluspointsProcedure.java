package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class PluspointsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skills_points + 1;
			entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.skills_points = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
