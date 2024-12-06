
package net.mcreator.capitalmode.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.procedures.CapitalFauxQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure;
import net.mcreator.capitalmode.procedures.CapitalFauxLorsqueLoutilEstDansLaMainProcedure;

public class CapitalFauxItem extends SwordItem {
	public CapitalFauxItem() {
		super(new Tier() {
			public int getUses() {
				return 3;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -3.6f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CapitalFauxQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CapitalFauxLorsqueLoutilEstDansLaMainProcedure.execute(entity);
	}
}
