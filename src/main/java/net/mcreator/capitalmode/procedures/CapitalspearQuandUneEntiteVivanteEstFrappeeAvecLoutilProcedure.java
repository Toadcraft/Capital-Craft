package net.mcreator.capitalmode.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class CapitalspearQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.KNOCKBACK, 5);
	}
}
