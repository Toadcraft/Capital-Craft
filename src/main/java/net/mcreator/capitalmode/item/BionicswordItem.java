
package net.mcreator.capitalmode.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.procedures.BionicswordToolInInventoryTickProcedure;
import net.mcreator.capitalmode.procedures.BionicswordToolInInventoryTick2Procedure;
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
				return 2f;
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

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			BionicswordToolInInventoryTickProcedure.execute(entity);
		BionicswordToolInInventoryTick2Procedure.execute(world, entity, itemstack);
	}
}
