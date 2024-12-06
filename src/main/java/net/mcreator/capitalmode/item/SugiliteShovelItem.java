
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.capitalmode.init.CapitalModeModItems;

public class SugiliteShovelItem extends ShovelItem {
	public SugiliteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CapitalModeModItems.SUGILITE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
