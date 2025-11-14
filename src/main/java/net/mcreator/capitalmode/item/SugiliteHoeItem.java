package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SugiliteHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5000, 15f, 0, 25, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:sugilite_hoe_repair_items")));

	public SugiliteHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1f, -3f, properties);
	}
}