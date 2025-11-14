package net.mcreator.capitalmode.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.capitalmode.procedures.CapitalspearQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure;

public class CapitalspearItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3000, 10.5f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:capitalspear_repair_items")));

	public CapitalspearItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 9f, 96f));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Player entity) {
		super.onCraftedBy(itemstack, entity);
		CapitalspearQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure.execute(entity.level(), itemstack);
	}
}