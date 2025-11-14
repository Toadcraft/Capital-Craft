package net.mcreator.capitalmode.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;
import net.mcreator.capitalmode.init.CapitalModeModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class WhenitemiscraftProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getEntity(), event.getCrafting());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (Items.IRON_PICKAXE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 10) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 20;
				_vars.markSyncDirty();
			}
		}
		if (Items.GOLDEN_PICKAXE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 15) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 20;
				_vars.markSyncDirty();
			}
		}
		if (Items.DIAMOND_PICKAXE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 30) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 200;
				_vars.markSyncDirty();
			}
		}
		if (Items.NETHERITE_INGOT == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 300;
				_vars.markSyncDirty();
			}
		}
		if (Items.NETHERITE_PICKAXE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 400;
				_vars.markSyncDirty();
			}
		}
		if (CapitalModeModItems.CAPITAL_OUTILS_PICKAXE.get() == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 300;
				_vars.markSyncDirty();
			}
		}
		if (Items.BREAD == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 5) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 20;
				_vars.markSyncDirty();
			}
		}
		if (Blocks.HAY_BLOCK.asItem() == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 5) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 50;
				_vars.markSyncDirty();
			}
		}
		if (Items.IRON_SHOVEL == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 50;
				_vars.markSyncDirty();
			}
		}
		if (Items.IRON_HOE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 50;
				_vars.markSyncDirty();
			}
		}
		if (Items.IRON_AXE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 50;
				_vars.markSyncDirty();
			}
		}
		if (Items.GOLDEN_SHOVEL == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 25) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 75;
				_vars.markSyncDirty();
			}
		}
		if (Items.GOLDEN_AXE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 25) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 75;
				_vars.markSyncDirty();
			}
		}
		if (Items.GOLDEN_HOE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 25) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 75;
				_vars.markSyncDirty();
			}
		}
		if (Items.DIAMOND_SHOVEL == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 125;
				_vars.markSyncDirty();
			}
		}
		if (Items.DIAMOND_AXE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 125;
				_vars.markSyncDirty();
			}
		}
		if (Items.DIAMOND_HOE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 125;
				_vars.markSyncDirty();
			}
		}
		if (Items.NETHERITE_SHOVEL == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 200;
				_vars.markSyncDirty();
			}
		}
		if (Items.NETHERITE_AXE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 200;
				_vars.markSyncDirty();
			}
		}
		if (Items.NETHERITE_HOE == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 200;
				_vars.markSyncDirty();
			}
		}
		if (CapitalModeModItems.RUBI_SHOVEL.get() == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 200;
				_vars.markSyncDirty();
			}
		}
		if (CapitalModeModItems.RUBI_HOE.get() == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 200;
				_vars.markSyncDirty();
			}
		}
		if (CapitalModeModItems.RUBI_AXE.get() == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 200;
				_vars.markSyncDirty();
			}
		}
		if (CapitalModeModItems.CAPITAL_OUTILS_AXE.get() == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 300;
				_vars.markSyncDirty();
			}
		}
		if (CapitalModeModItems.CAPITAL_OUTILS_SHOVEL.get() == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 300;
				_vars.markSyncDirty();
			}
		}
		if (CapitalModeModItems.CAPITAL_OUTILS_HOE.get() == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 300;
				_vars.markSyncDirty();
			}
		}
	}
}