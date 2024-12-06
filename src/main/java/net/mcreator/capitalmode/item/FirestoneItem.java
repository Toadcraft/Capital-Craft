
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FirestoneItem extends Item {
	public FirestoneItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
