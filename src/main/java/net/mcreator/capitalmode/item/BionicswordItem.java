package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.capitalmode.procedures.BionicswordToolInInventoryTickProcedure;
import net.mcreator.capitalmode.procedures.BionicswordToolInInventoryTick2Procedure;

import javax.annotation.Nullable;

public class BionicswordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1000, 9.5f, 0, 16, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:bionicsword_repair_items")));

	public BionicswordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 5f, 96f));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		if (equipmentSlot == EquipmentSlot.MAINHAND)
			BionicswordToolInInventoryTickProcedure.execute(entity);
		BionicswordToolInInventoryTick2Procedure.execute(world, entity, itemstack);
	}
}