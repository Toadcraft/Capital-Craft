package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class Competense02Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points >= 2 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_02 == 0 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_01 == 1) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points - 2;
				_vars.skill_02 = 1;
				_vars.markSyncDirty();
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("VOUS AVEZ OBTENUE \"Bourr\u00E9 de fl\u00E8ches\""), false);
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else {
			if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_02 == 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("VOUS AVEZ DEJA CE SKILL"), false);
				if (entity instanceof Player _player)
					_player.closeContainer();
			} else {
				if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_01 == 0) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("VOUS DEVEZ AVOIR LE SKILL \"Cat eyes\""), false);
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