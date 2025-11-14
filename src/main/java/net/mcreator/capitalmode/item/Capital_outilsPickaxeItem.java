package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class Capital_outilsPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3000, 15f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:capital_outils_pickaxe_repair_items")));

	public Capital_outilsPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 9f, -3f));
	}
}