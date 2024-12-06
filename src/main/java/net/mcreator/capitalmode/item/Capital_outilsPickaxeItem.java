
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.capitalmode.init.CapitalModeModItems;

public class Capital_outilsPickaxeItem extends PickaxeItem {
	public Capital_outilsPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CapitalModeModItems.CAPITAL.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
