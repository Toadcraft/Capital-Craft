package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SpeedpickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3000, 30f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:speedpickaxe_repair_items")));

	public SpeedpickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 9f, -3f));
	}
}