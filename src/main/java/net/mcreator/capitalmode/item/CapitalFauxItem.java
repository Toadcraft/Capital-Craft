package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.capitalmode.procedures.CapitalFauxQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure;
import net.mcreator.capitalmode.procedures.CapitalFauxLorsqueLoutilEstDansLaMainProcedure;

import javax.annotation.Nullable;

public class CapitalFauxItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3, 4f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:capital_faux_repair_items")));

	public CapitalFauxItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, -1f, -3.6f).fireResistant());
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		CapitalFauxQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure.execute(entity);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		if (equipmentSlot == EquipmentSlot.MAINHAND)
			CapitalFauxLorsqueLoutilEstDansLaMainProcedure.execute(entity);
	}
}