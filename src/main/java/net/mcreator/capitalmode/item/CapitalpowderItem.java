
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CapitalpowderItem extends Item {
	public CapitalpowderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
