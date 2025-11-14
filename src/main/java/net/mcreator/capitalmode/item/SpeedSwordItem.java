package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SpeedSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3000, 10.5f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:speed_sword_repair_items")));

	public SpeedSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 9f, 96f).fireResistant());
	}
}