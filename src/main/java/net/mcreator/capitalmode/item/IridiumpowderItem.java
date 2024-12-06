
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IridiumpowderItem extends Item {
	public IridiumpowderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
