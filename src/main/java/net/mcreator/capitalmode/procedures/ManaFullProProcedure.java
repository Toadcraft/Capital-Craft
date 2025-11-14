package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class ManaFullProProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
			_vars.Mana = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Mana_max;
			_vars.markSyncDirty();
		}
	}
}