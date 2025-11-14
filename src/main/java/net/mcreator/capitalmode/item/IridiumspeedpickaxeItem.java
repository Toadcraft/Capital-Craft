package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class IridiumspeedpickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5000, 40f, 0, 25, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:iridiumspeedpickaxe_repair_items")));

	public IridiumspeedpickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 14f, -3f));
	}
}