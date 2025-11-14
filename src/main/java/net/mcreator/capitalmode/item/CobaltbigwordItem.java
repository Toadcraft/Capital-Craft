package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CobaltbigwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 9.5f, 0, 16, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:cobaltbigword_repair_items")));

	public CobaltbigwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 18f, -3.2f));
	}
}