
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.capitalmode.init.CapitalModeModBlocks;

public class BionicswordItem extends SwordItem {
	public BionicswordItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 9.5f;
			}

			public float getAttackDamageBonus() {
				return -3f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CapitalModeModBlocks.BATTERIE.get()));
			}
		}, 3, 96f, new Item.Properties());
	}
}
