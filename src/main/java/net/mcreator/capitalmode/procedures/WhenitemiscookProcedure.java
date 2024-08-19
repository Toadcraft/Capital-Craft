package net.mcreator.capitalmode.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
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
		if (Items.IRON_INGOT == itemstack.getItem() && (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 10) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 10;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (Items.GOLD_INGOT == itemstack.getItem() && (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 20) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 20;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (Items.NETHERITE_SCRAP == itemstack.getItem() && (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 35) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 200;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (Items.COOKED_COD == itemstack.getItem() && (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_paysan >= 30) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_paysan + 75;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_paysan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (Items.COOKED_SALMON == itemstack.getItem() && (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_paysan >= 30) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_paysan + 75;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_paysan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
