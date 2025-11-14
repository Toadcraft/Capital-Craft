package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class ResetpaysanProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
			_vars.xp_paysan = 0;
			_vars.lvl_paysan = 0;
			_vars.markSyncDirty();
		}
	}
}