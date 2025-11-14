package net.mcreator.capitalmode.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.capitalmode.procedures.CapitalapplePlayerFinishesUsingItemProcedure;

public class CapitalappleItem extends Item {
	public CapitalappleItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(16).fireResistant().food((new FoodProperties.Builder()).nutrition(20).saturationModifier(20f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		CapitalapplePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}