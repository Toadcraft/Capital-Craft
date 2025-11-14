package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class ThuneVariableProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Vous avez" + new java.text.DecimalFormat("##.##").format(entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Argent) + "\u20AC";
	}
}