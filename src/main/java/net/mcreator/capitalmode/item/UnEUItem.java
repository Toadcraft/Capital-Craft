
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UnEUItem extends Item {
	public UnEUItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
