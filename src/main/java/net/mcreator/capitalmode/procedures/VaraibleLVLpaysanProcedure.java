package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class VaraibleLVLpaysanProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Vous \u00EAtes niveau " + new java.text.DecimalFormat("##.##").format(entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan);
	}
}