package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class Competense01Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points >= 1 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_01 == 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 999999, 1));
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points - 1;
				_vars.skill_01 = 1;
				_vars.markSyncDirty();
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("VOUS AVEZ OBTENUE \"Cat eyes\""), false);
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else {
			if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_01 == 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("VOUS AVEZ DEJA CE SKILL"), false);
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