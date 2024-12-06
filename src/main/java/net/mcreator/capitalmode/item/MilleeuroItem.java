
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MilleeuroItem extends Item {
	public MilleeuroItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
