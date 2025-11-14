package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CentEUItem extends Item {
	public CentEUItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}