package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class IridiumRankUnlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).Argent >= 10000 && entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("capital_mode:la_mort"))).isDone() && entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel
				&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("capital_mode:lvl_10"))).isDone()
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).Rank == 7) {
			{
				double _setval = 8;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Rank = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("VOUS AVEZ OBTENUS LE RANK \"Capital\""), false);
		} else {
			if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).Rank >= 8) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("VOUS AVEZ DEJA CE RANK"), false);
				if (entity instanceof Player _player)
					_player.closeContainer();
			} else {
				if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).Argent < 10000) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("VOUS N'AVEZ PAS ASSEZ D'ARGENT"), false);
					if (entity instanceof Player _player)
						_player.closeContainer();
				} else {
					if (!(entity instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel
							&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("capital_mode:la_mort"))).isDone())) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("VOUS N'AVEZ PAS LE SUCCES \"La mort\""), false);
						if (entity instanceof Player _player)
							_player.closeContainer();
					} else {
						if (!(entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel
								&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("capital_mode:lvl_10"))).isDone())) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("VOUS N'AVEZ PAS LE SUCCES \"Surpuissance\""), false);
							if (entity instanceof Player _player)
								_player.closeContainer();
						}
					}
				}
			}
		}
	}
}
