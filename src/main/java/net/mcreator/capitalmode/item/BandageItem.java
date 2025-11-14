package net.mcreator.capitalmode.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.capitalmode.procedures.BandageEvenementAuClicDroitDansLairProcedure;

public class BandageItem extends Item {
	public BandageItem(Item.Properties properties) {
		super(properties.durability(1));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		BandageEvenementAuClicDroitDansLairProcedure.execute(entity);
		return ar;
	}
}