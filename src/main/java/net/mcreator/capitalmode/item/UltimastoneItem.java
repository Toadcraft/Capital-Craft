
package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UltimastoneItem extends Item {
	public UltimastoneItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.EPIC));
	}
}
