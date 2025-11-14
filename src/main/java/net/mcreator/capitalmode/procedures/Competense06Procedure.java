package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class Competense06Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points >= 5 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_06 == 0 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_03 == 1) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points - 5;
				_vars.skill_06 = 1;
				_vars.markSyncDirty();
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("VOUS AVEZ OBTENUE \"Fan de capital\""), false);
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else {
			if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_06 == 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("VOUS AVEZ DEJA CE SKILL"), false);
				if (entity instanceof Player _player)
					_player.closeContainer();
			} else {
				if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_03 == 0) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("VOUS DEVEZ AVOIR LE SKILL \"Hyper actif\""), false);
					if (entity instanceof Player _player)
						_player.closeContainer();
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("VOUS N'AVEZ PAS ASSEZ DE POINTS"), false);
					if (entity instanceof Player _player)
						_player.closeContainer();
				}
			}
		}
	}
}