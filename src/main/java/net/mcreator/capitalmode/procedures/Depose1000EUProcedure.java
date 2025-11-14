package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class Depose1000EUProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Argent >= 1000) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.Argent = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Argent - 1000;
				_vars.markSyncDirty();
			}
			CapitalModeModVariables.MapVariables.get(world).argent_spawn = CapitalModeModVariables.MapVariables.get(world).argent_spawn + 1000;
			CapitalModeModVariables.MapVariables.get(world).markSyncDirty();
		} else {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("VOUS N'AVEZ PAS ASSEZ D'ARGENT !"), false);
		}
	}
}