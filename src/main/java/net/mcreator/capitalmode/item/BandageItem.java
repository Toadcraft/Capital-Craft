
package net.mcreator.capitalmode.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.capitalmode.procedures.BandageEvenementAuClicDroitDansLairProcedure;

public class BandageItem extends Item {
	public BandageItem() {
		super(new Item.Properties().durability(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BandageEvenementAuClicDroitDansLairProcedure.execute(entity);
		return ar;
	}
}
