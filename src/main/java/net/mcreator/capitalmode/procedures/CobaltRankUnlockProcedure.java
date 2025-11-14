package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class CobaltRankUnlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Argent >= 600 && entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel _serverLevel0
				&& _plr0.getAdvancements().getOrStartProgress(_serverLevel0.getServer().getAdvancements().get(ResourceLocation.parse("capital_mode:ingenieur"))).isDone() && entity instanceof ServerPlayer _plr1
				&& _plr1.level() instanceof ServerLevel _serverLevel1 && _plr1.getAdvancements().getOrStartProgress(_serverLevel1.getServer().getAdvancements().get(ResourceLocation.parse("capital_mode:dw"))).isDone()
				&& entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank == 5) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.Rank = 6;
				_vars.markSyncDirty();
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("VOUS AVEZ OBTENUS LE RANK \"Cobalt\""), false);
		} else {
			if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank >= 6) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("VOUS AVEZ DEJA CE RANK"), false);
				if (entity instanceof Player _player)
					_player.closeContainer();
			} else {
				if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Argent < 600) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("VOUS N'AVEZ PAS ASSEZ D'ARGENT"), false);
					if (entity instanceof Player _player)
						_player.closeContainer();
				} else {
					if (!(entity instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel _serverLevel7
							&& _plr7.getAdvancements().getOrStartProgress(_serverLevel7.getServer().getAdvancements().get(ResourceLocation.parse("capital_mode:leblocdetrop"))).isDone())) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("VOUS N'AVEZ PAS LE SUCCES \"Ing\u00E9nieur\""), false);
						if (entity instanceof Player _player)
							_player.closeContainer();
					} else {
						if (!(entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel _serverLevel10
								&& _plr10.getAdvancements().getOrStartProgress(_serverLevel10.getServer().getAdvancements().get(ResourceLocation.parse("capital_mode:dw"))).isDone())) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("VOUS N'AVEZ PAS LE SUCCES \"Demon World\""), false);
							if (entity instanceof Player _player)
								_player.closeContainer();
						}
					}
				}
			}
		}
	}
}