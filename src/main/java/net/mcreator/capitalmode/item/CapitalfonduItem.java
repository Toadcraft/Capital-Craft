package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.capitalmode.init.CapitalModeModFluids;

public class CapitalfonduItem extends BucketItem {
	public CapitalfonduItem(Item.Properties properties) {
		super(CapitalModeModFluids.CAPITALFONDU.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE));
	}
}