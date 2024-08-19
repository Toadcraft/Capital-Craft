package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;
import net.mcreator.capitalmode.init.CapitalModeModItems;
import net.mcreator.capitalmode.init.CapitalModeModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class CompetensesPendantQueCeGUIEstOuvertParTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_01 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.YEUXDECHAT.get());
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_02 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.BOURREDEFLECHES.get());
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_03 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.HYPERACTIF_1.get());
				_setstack.setCount(1);
				((Slot) _slots.get(2)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(2)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_04 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.HYPERACTIF_2.get());
				_setstack.setCount(1);
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_05 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.HYPERACTIF_3.get());
				_setstack.setCount(1);
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_06 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModBlocks.FANDECAPITAL.get());
				_setstack.setCount(1);
				((Slot) _slots.get(5)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(5)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_07 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.GRANDCOEUR.get());
				_setstack.setCount(1);
				((Slot) _slots.get(6)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(6)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_08 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.GRANDCOEUR_2.get());
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_09 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.GRANDCOEUR_3.get());
				_setstack.setCount(1);
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_10 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.PETITSSOINS.get());
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_11 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.CHUTELIBRE.get());
				_setstack.setCount(1);
				((Slot) _slots.get(10)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BARRIER);
				_setstack.setCount(1);
				((Slot) _slots.get(10)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
