package net.mcreator.capitalmode.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.core.component.DataComponents;

import net.mcreator.capitalmode.init.CapitalModeModItems;

@EventBusSubscriber
public class ReliqueboofItem extends Item {
	public ReliqueboofItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1).fireResistant().food((new FoodProperties.Builder()).nutrition(100).saturationModifier(100f).alwaysEdible().build()));
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		event.modify(CapitalModeModItems.RELIQUEBOOF.get(), builder -> builder.set(DataComponents.USE_REMAINDER, new UseRemainder(new ItemStack(CapitalModeModItems.RELIQUEBOOF.get()))));
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}