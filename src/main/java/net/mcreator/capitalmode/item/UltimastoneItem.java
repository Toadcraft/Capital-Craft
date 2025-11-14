package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UltimastoneItem extends Item {
	public UltimastoneItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(16));
	}
}