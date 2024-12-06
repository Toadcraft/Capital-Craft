
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DeadstoneItem extends Item {
	public DeadstoneItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.EPIC));
	}
}
