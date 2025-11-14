package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MilleeuroItem extends Item {
	public MilleeuroItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}