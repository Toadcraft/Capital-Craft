package net.mcreator.capitalmode.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class WhenitemiscookProcedure {
	@SubscribeEvent
	public static void onItemSmelted(PlayerEvent.ItemSmeltedEvent event) {
		execute(event, event.getEntity(), event.getSmelting());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (Items.IRON_INGOT == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 10) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 10;
				_vars.markSyncDirty();
			}
		}
		if (Items.GOLD_INGOT == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 20;
				_vars.markSyncDirty();
			}
		}
		if (Items.NETHERITE_SCRAP == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 200;
				_vars.markSyncDirty();
			}
		}
		if (Items.COOKED_COD == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 30) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 75;
				_vars.markSyncDirty();
			}
		}
		if (Items.COOKED_SALMON == itemstack.getItem() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 30) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 75;
				_vars.markSyncDirty();
			}
		}
	}
}