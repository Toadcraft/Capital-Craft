package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class VariableskillsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Vous avez " + new java.text.DecimalFormat("##.##").format((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skills_points) + " points";
	}
}
