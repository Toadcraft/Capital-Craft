package net.mcreator.capitalmode.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.capitalmode.network.CapitalModeModVariables;
import net.mcreator.capitalmode.init.CapitalModeModItems;

public class Donner100eProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (100 <= entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Argent) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.Argent = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Argent - 100;
				_vars.markSyncDirty();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.CENT_EU.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("VOUS N'AVEZ PAS ASSEZ D'ARGENT !"), false);
		}
	}
}