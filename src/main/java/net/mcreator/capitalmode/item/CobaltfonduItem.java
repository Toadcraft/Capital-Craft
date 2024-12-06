
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.capitalmode.init.CapitalModeModFluids;

public class CobaltfonduItem extends BucketItem {
	public CobaltfonduItem() {
		super(CapitalModeModFluids.COBALTFONDU, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
