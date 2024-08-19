package net.mcreator.capitalmode.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class GivearrowProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_02 == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.ARROW);
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Vous avez re\u00E7u 64 fl\u00E8ches"), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Vous devez avoir le skill : \"bourr\u00E9 de fl\u00E8ches\""), false);
		}
	}
}
