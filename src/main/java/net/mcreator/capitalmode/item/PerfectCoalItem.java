package net.mcreator.capitalmode.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PerfectCoalItem extends Item {
	public PerfectCoalItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).fireResistant());
	}
}