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
				ItemStack _setstack0 = new ItemStack(CapitalModeModItems.RELIQUEEAU.get()).copy();
				_setstack0.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack0);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack1 = new ItemStack(CapitalModeModItems.RELIQUEBOOF.get()).copy();
				_setstack1.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack2 = new ItemStack(CapitalModeModItems.RELIQUESAC.get()).copy();
				_setstack2.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack3 = new ItemStack(CapitalModeModItems.RELIQUEFIRE.get()).copy();
				_setstack3.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack4 = new ItemStack(CapitalModeModItems.RELIQUEPVP.get()).copy();
				_setstack4.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack4);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}