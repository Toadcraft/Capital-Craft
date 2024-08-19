package net.mcreator.capitalmode.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.capitalmode.init.CapitalModeModItems;

public class GiverreliqueEvenementAuClicDroitDansLairnewversionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.RELIQUEEAU.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.RELIQUEBOOF.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.RELIQUESAC.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.RELIQUEFIRE.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.RELIQUEPVP.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
