
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.capitalmode.init.CapitalModeModItems;

public class RubiHoeItem extends HoeItem {
	public RubiHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2100;
			}

			public float getSpeed() {
				return 9.5f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CapitalModeModItems.COBALT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
