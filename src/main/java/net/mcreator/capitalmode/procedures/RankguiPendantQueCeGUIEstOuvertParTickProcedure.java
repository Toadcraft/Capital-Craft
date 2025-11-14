package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;
import net.mcreator.capitalmode.init.CapitalModeModMenus;
import net.mcreator.capitalmode.init.CapitalModeModItems;

public class RankguiPendantQueCeGUIEstOuvertParTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack0 = new ItemStack(CapitalModeModItems.COAL_RANK.get()).copy();
				_setstack0.setCount(1);
				_menu.getSlots().get(0).set(_setstack0);
				ItemStack _setstack1 = new ItemStack(CapitalModeModItems.IRON_RANK.get()).copy();
				_setstack1.setCount(1);
				_menu.getSlots().get(1).set(_setstack1);
				ItemStack _setstack2 = new ItemStack(CapitalModeModItems.GOLD_RANK.get()).copy();
				_setstack2.setCount(1);
				_menu.getSlots().get(2).set(_setstack2);
				ItemStack _setstack3 = new ItemStack(CapitalModeModItems.DIAMOND_RANK.get()).copy();
				_setstack3.setCount(1);
				_menu.getSlots().get(3).set(_setstack3);
				ItemStack _setstack4 = new ItemStack(CapitalModeModItems.NETHERITE_RANK.get()).copy();
				_setstack4.setCount(1);
				_menu.getSlots().get(4).set(_setstack4);
				ItemStack _setstack5 = new ItemStack(CapitalModeModItems.COBALT_RANK.get()).copy();
				_setstack5.setCount(1);
				_menu.getSlots().get(5).set(_setstack5);
				ItemStack _setstack6 = new ItemStack(CapitalModeModItems.CAPITAL_RANK.get()).copy();
				_setstack6.setCount(1);
				_menu.getSlots().get(6).set(_setstack6);
				ItemStack _setstack7 = new ItemStack(CapitalModeModItems.IRIDIUM_RANK.get()).copy();
				_setstack7.setCount(1);
				_menu.getSlots().get(7).set(_setstack7);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank == 1) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack8 = new ItemStack(Blocks.BARRIER).copy();
				_setstack8.setCount(1);
				_menu.getSlots().get(0).set(_setstack8);
				ItemStack _setstack9 = new ItemStack(CapitalModeModItems.IRON_RANK.get()).copy();
				_setstack9.setCount(1);
				_menu.getSlots().get(1).set(_setstack9);
				ItemStack _setstack10 = new ItemStack(CapitalModeModItems.GOLD_RANK.get()).copy();
				_setstack10.setCount(1);
				_menu.getSlots().get(2).set(_setstack10);
				ItemStack _setstack11 = new ItemStack(CapitalModeModItems.DIAMOND_RANK.get()).copy();
				_setstack11.setCount(1);
				_menu.getSlots().get(3).set(_setstack11);
				ItemStack _setstack12 = new ItemStack(CapitalModeModItems.NETHERITE_RANK.get()).copy();
				_setstack12.setCount(1);
				_menu.getSlots().get(4).set(_setstack12);
				ItemStack _setstack13 = new ItemStack(CapitalModeModItems.COBALT_RANK.get()).copy();
				_setstack13.setCount(1);
				_menu.getSlots().get(5).set(_setstack13);
				ItemStack _setstack14 = new ItemStack(CapitalModeModItems.CAPITAL_RANK.get()).copy();
				_setstack14.setCount(1);
				_menu.getSlots().get(6).set(_setstack14);
				ItemStack _setstack15 = new ItemStack(CapitalModeModItems.IRIDIUM_RANK.get()).copy();
				_setstack15.setCount(1);
				_menu.getSlots().get(7).set(_setstack15);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank == 2) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack16 = new ItemStack(Blocks.BARRIER).copy();
				_setstack16.setCount(1);
				_menu.getSlots().get(0).set(_setstack16);
				ItemStack _setstack17 = new ItemStack(Blocks.BARRIER).copy();
				_setstack17.setCount(1);
				_menu.getSlots().get(1).set(_setstack17);
				ItemStack _setstack18 = new ItemStack(CapitalModeModItems.GOLD_RANK.get()).copy();
				_setstack18.setCount(1);
				_menu.getSlots().get(2).set(_setstack18);
				ItemStack _setstack19 = new ItemStack(CapitalModeModItems.DIAMOND_RANK.get()).copy();
				_setstack19.setCount(1);
				_menu.getSlots().get(3).set(_setstack19);
				ItemStack _setstack20 = new ItemStack(CapitalModeModItems.NETHERITE_RANK.get()).copy();
				_setstack20.setCount(1);
				_menu.getSlots().get(4).set(_setstack20);
				ItemStack _setstack21 = new ItemStack(CapitalModeModItems.COBALT_RANK.get()).copy();
				_setstack21.setCount(1);
				_menu.getSlots().get(5).set(_setstack21);
				ItemStack _setstack22 = new ItemStack(CapitalModeModItems.CAPITAL_RANK.get()).copy();
				_setstack22.setCount(1);
				_menu.getSlots().get(6).set(_setstack22);
				ItemStack _setstack23 = new ItemStack(CapitalModeModItems.IRIDIUM_RANK.get()).copy();
				_setstack23.setCount(1);
				_menu.getSlots().get(7).set(_setstack23);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank == 3) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack24 = new ItemStack(Blocks.BARRIER).copy();
				_setstack24.setCount(1);
				_menu.getSlots().get(0).set(_setstack24);
				ItemStack _setstack25 = new ItemStack(Blocks.BARRIER).copy();
				_setstack25.setCount(1);
				_menu.getSlots().get(1).set(_setstack25);
				ItemStack _setstack26 = new ItemStack(Blocks.BARRIER).copy();
				_setstack26.setCount(1);
				_menu.getSlots().get(2).set(_setstack26);
				ItemStack _setstack27 = new ItemStack(CapitalModeModItems.DIAMOND_RANK.get()).copy();
				_setstack27.setCount(1);
				_menu.getSlots().get(3).set(_setstack27);
				ItemStack _setstack28 = new ItemStack(CapitalModeModItems.NETHERITE_RANK.get()).copy();
				_setstack28.setCount(1);
				_menu.getSlots().get(4).set(_setstack28);
				ItemStack _setstack29 = new ItemStack(CapitalModeModItems.COBALT_RANK.get()).copy();
				_setstack29.setCount(1);
				_menu.getSlots().get(5).set(_setstack29);
				ItemStack _setstack30 = new ItemStack(CapitalModeModItems.CAPITAL_RANK.get()).copy();
				_setstack30.setCount(1);
				_menu.getSlots().get(6).set(_setstack30);
				ItemStack _setstack31 = new ItemStack(CapitalModeModItems.IRIDIUM_RANK.get()).copy();
				_setstack31.setCount(1);
				_menu.getSlots().get(7).set(_setstack31);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank == 4) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack32 = new ItemStack(Blocks.BARRIER).copy();
				_setstack32.setCount(1);
				_menu.getSlots().get(0).set(_setstack32);
				ItemStack _setstack33 = new ItemStack(Blocks.BARRIER).copy();
				_setstack33.setCount(1);
				_menu.getSlots().get(1).set(_setstack33);
				ItemStack _setstack34 = new ItemStack(Blocks.BARRIER).copy();
				_setstack34.setCount(1);
				_menu.getSlots().get(2).set(_setstack34);
				ItemStack _setstack35 = new ItemStack(Blocks.BARRIER).copy();
				_setstack35.setCount(1);
				_menu.getSlots().get(3).set(_setstack35);
				ItemStack _setstack36 = new ItemStack(CapitalModeModItems.NETHERITE_RANK.get()).copy();
				_setstack36.setCount(1);
				_menu.getSlots().get(4).set(_setstack36);
				ItemStack _setstack37 = new ItemStack(CapitalModeModItems.COBALT_RANK.get()).copy();
				_setstack37.setCount(1);
				_menu.getSlots().get(5).set(_setstack37);
				ItemStack _setstack38 = new ItemStack(CapitalModeModItems.CAPITAL_RANK.get()).copy();
				_setstack38.setCount(1);
				_menu.getSlots().get(6).set(_setstack38);
				ItemStack _setstack39 = new ItemStack(CapitalModeModItems.IRIDIUM_RANK.get()).copy();
				_setstack39.setCount(1);
				_menu.getSlots().get(7).set(_setstack39);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank == 5) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack40 = new ItemStack(Blocks.BARRIER).copy();
				_setstack40.setCount(1);
				_menu.getSlots().get(0).set(_setstack40);
				ItemStack _setstack41 = new ItemStack(Blocks.BARRIER).copy();
				_setstack41.setCount(1);
				_menu.getSlots().get(1).set(_setstack41);
				ItemStack _setstack42 = new ItemStack(Blocks.BARRIER).copy();
				_setstack42.setCount(1);
				_menu.getSlots().get(2).set(_setstack42);
				ItemStack _setstack43 = new ItemStack(Blocks.BARRIER).copy();
				_setstack43.setCount(1);
				_menu.getSlots().get(3).set(_setstack43);
				ItemStack _setstack44 = new ItemStack(Blocks.BARRIER).copy();
				_setstack44.setCount(1);
				_menu.getSlots().get(4).set(_setstack44);
				ItemStack _setstack45 = new ItemStack(CapitalModeModItems.COBALT_RANK.get()).copy();
				_setstack45.setCount(1);
				_menu.getSlots().get(5).set(_setstack45);
				ItemStack _setstack46 = new ItemStack(CapitalModeModItems.CAPITAL_RANK.get()).copy();
				_setstack46.setCount(1);
				_menu.getSlots().get(6).set(_setstack46);
				ItemStack _setstack47 = new ItemStack(CapitalModeModItems.IRIDIUM_RANK.get()).copy();
				_setstack47.setCount(1);
				_menu.getSlots().get(7).set(_setstack47);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank == 6) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack48 = new ItemStack(Blocks.BARRIER).copy();
				_setstack48.setCount(1);
				_menu.getSlots().get(0).set(_setstack48);
				ItemStack _setstack49 = new ItemStack(Blocks.BARRIER).copy();
				_setstack49.setCount(1);
				_menu.getSlots().get(1).set(_setstack49);
				ItemStack _setstack50 = new ItemStack(Blocks.BARRIER).copy();
				_setstack50.setCount(1);
				_menu.getSlots().get(2).set(_setstack50);
				ItemStack _setstack51 = new ItemStack(Blocks.BARRIER).copy();
				_setstack51.setCount(1);
				_menu.getSlots().get(3).set(_setstack51);
				ItemStack _setstack52 = new ItemStack(Blocks.BARRIER).copy();
				_setstack52.setCount(1);
				_menu.getSlots().get(4).set(_setstack52);
				ItemStack _setstack53 = new ItemStack(Blocks.BARRIER).copy();
				_setstack53.setCount(1);
				_menu.getSlots().get(5).set(_setstack53);
				ItemStack _setstack54 = new ItemStack(CapitalModeModItems.CAPITAL_RANK.get()).copy();
				_setstack54.setCount(1);
				_menu.getSlots().get(6).set(_setstack54);
				ItemStack _setstack55 = new ItemStack(CapitalModeModItems.IRIDIUM_RANK.get()).copy();
				_setstack55.setCount(1);
				_menu.getSlots().get(7).set(_setstack55);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank == 7) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack56 = new ItemStack(Blocks.BARRIER).copy();
				_setstack56.setCount(1);
				_menu.getSlots().get(0).set(_setstack56);
				ItemStack _setstack57 = new ItemStack(Blocks.BARRIER).copy();
				_setstack57.setCount(1);
				_menu.getSlots().get(1).set(_setstack57);
				ItemStack _setstack58 = new ItemStack(Blocks.BARRIER).copy();
				_setstack58.setCount(1);
				_menu.getSlots().get(2).set(_setstack58);
				ItemStack _setstack59 = new ItemStack(Blocks.BARRIER).copy();
				_setstack59.setCount(1);
				_menu.getSlots().get(3).set(_setstack59);
				ItemStack _setstack60 = new ItemStack(Blocks.BARRIER).copy();
				_setstack60.setCount(1);
				_menu.getSlots().get(4).set(_setstack60);
				ItemStack _setstack61 = new ItemStack(Blocks.BARRIER).copy();
				_setstack61.setCount(1);
				_menu.getSlots().get(5).set(_setstack61);
				ItemStack _setstack62 = new ItemStack(Blocks.BARRIER).copy();
				_setstack62.setCount(1);
				_menu.getSlots().get(6).set(_setstack62);
				ItemStack _setstack63 = new ItemStack(CapitalModeModItems.IRIDIUM_RANK.get()).copy();
				_setstack63.setCount(1);
				_menu.getSlots().get(7).set(_setstack63);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Rank == 8) {
			if (entity instanceof Player _player && _player.containerMenu instanceof CapitalModeModMenus.MenuAccessor _menu) {
				ItemStack _setstack64 = new ItemStack(Blocks.BARRIER).copy();
				_setstack64.setCount(1);
				_menu.getSlots().get(0).set(_setstack64);
				ItemStack _setstack65 = new ItemStack(Blocks.BARRIER).copy();
				_setstack65.setCount(1);
				_menu.getSlots().get(1).set(_setstack65);
				ItemStack _setstack66 = new ItemStack(Blocks.BARRIER).copy();
				_setstack66.setCount(1);
				_menu.getSlots().get(2).set(_setstack66);
				ItemStack _setstack67 = new ItemStack(Blocks.BARRIER).copy();
				_setstack67.setCount(1);
				_menu.getSlots().get(3).set(_setstack67);
				ItemStack _setstack68 = new ItemStack(Blocks.BARRIER).copy();
				_setstack68.setCount(1);
				_menu.getSlots().get(4).set(_setstack68);
				ItemStack _setstack69 = new ItemStack(Blocks.BARRIER).copy();
				_setstack69.setCount(1);
				_menu.getSlots().get(5).set(_setstack69);
				ItemStack _setstack70 = new ItemStack(Blocks.BARRIER).copy();
				_setstack70.setCount(1);
				_menu.getSlots().get(6).set(_setstack70);
				ItemStack _setstack71 = new ItemStack(Blocks.BARRIER).copy();
				_setstack71.setCount(1);
				_menu.getSlots().get(7).set(_setstack71);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}