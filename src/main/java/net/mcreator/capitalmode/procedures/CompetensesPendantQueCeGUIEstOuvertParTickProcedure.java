package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;
import net.mcreator.capitalmode.init.CapitalModeModMenus;
import net.mcreator.capitalmode.init.CapitalModeModItems;
import net.mcreator.capitalmode.init.CapitalModeModBlocks;

public class CompetensesPendantQueCeGUIEstOuvertParTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_01 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack0 = new ItemStack(CapitalModeModItems.YEUXDECHAT.get()).copy();
				_setstack0.setCount(1);
				_menu.getSlots().get(0).set(_setstack0);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack1 = new ItemStack(Blocks.BARRIER).copy();
				_setstack1.setCount(1);
				_menu.getSlots().get(0).set(_setstack1);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_02 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack2 = new ItemStack(CapitalModeModItems.BOURREDEFLECHES.get()).copy();
				_setstack2.setCount(1);
				_menu.getSlots().get(1).set(_setstack2);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack3 = new ItemStack(Blocks.BARRIER).copy();
				_setstack3.setCount(1);
				_menu.getSlots().get(1).set(_setstack3);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_03 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack4 = new ItemStack(CapitalModeModItems.HYPERACTIF_1.get()).copy();
				_setstack4.setCount(1);
				_menu.getSlots().get(2).set(_setstack4);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack5 = new ItemStack(Blocks.BARRIER).copy();
				_setstack5.setCount(1);
				_menu.getSlots().get(2).set(_setstack5);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_04 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack6 = new ItemStack(CapitalModeModItems.HYPERACTIF_2.get()).copy();
				_setstack6.setCount(1);
				_menu.getSlots().get(3).set(_setstack6);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack7 = new ItemStack(Blocks.BARRIER).copy();
				_setstack7.setCount(1);
				_menu.getSlots().get(3).set(_setstack7);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_05 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack8 = new ItemStack(CapitalModeModItems.HYPERACTIF_3.get()).copy();
				_setstack8.setCount(1);
				_menu.getSlots().get(4).set(_setstack8);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack9 = new ItemStack(Blocks.BARRIER).copy();
				_setstack9.setCount(1);
				_menu.getSlots().get(4).set(_setstack9);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_06 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack10 = new ItemStack(CapitalModeModBlocks.FANDECAPITAL.get()).copy();
				_setstack10.setCount(1);
				_menu.getSlots().get(5).set(_setstack10);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack11 = new ItemStack(Blocks.BARRIER).copy();
				_setstack11.setCount(1);
				_menu.getSlots().get(5).set(_setstack11);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_07 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack12 = new ItemStack(CapitalModeModItems.GRANDCOEUR.get()).copy();
				_setstack12.setCount(1);
				_menu.getSlots().get(6).set(_setstack12);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack13 = new ItemStack(Blocks.BARRIER).copy();
				_setstack13.setCount(1);
				_menu.getSlots().get(6).set(_setstack13);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_08 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack14 = new ItemStack(CapitalModeModItems.GRANDCOEUR_2.get()).copy();
				_setstack14.setCount(1);
				_menu.getSlots().get(7).set(_setstack14);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack15 = new ItemStack(Blocks.BARRIER).copy();
				_setstack15.setCount(1);
				_menu.getSlots().get(7).set(_setstack15);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_09 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack16 = new ItemStack(CapitalModeModItems.GRANDCOEUR_3.get()).copy();
				_setstack16.setCount(1);
				_menu.getSlots().get(8).set(_setstack16);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack17 = new ItemStack(Blocks.BARRIER).copy();
				_setstack17.setCount(1);
				_menu.getSlots().get(8).set(_setstack17);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_10 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack18 = new ItemStack(CapitalModeModItems.PETITSSOINS.get()).copy();
				_setstack18.setCount(1);
				_menu.getSlots().get(9).set(_setstack18);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack19 = new ItemStack(Blocks.BARRIER).copy();
				_setstack19.setCount(1);
				_menu.getSlots().get(9).set(_setstack19);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_11 == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack20 = new ItemStack(CapitalModeModItems.CHUTELIBRE.get()).copy();
				_setstack20.setCount(1);
				_menu.getSlots().get(10).set(_setstack20);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack21 = new ItemStack(Blocks.BARRIER).copy();
				_setstack21.setCount(1);
				_menu.getSlots().get(10).set(_setstack21);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}