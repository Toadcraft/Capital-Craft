
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.capitalmode.init.CapitalModeModFluids;

public class IridfonduItem extends BucketItem {
	public IridfonduItem() {
		super(CapitalModeModFluids.IRIDFONDU, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
