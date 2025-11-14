package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RubiHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 9.5f, 0, 16, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:rubi_hoe_repair_items")));

	public RubiHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, -3f, properties);
	}
}