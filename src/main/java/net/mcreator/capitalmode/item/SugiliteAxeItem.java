package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SugiliteAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5000, 15f, 0, 25, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:sugilite_axe_repair_items")));

	public SugiliteAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 19f, -3f, properties);
	}
}