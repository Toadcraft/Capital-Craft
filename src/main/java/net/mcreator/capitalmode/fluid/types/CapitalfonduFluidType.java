package net.mcreator.capitalmode.fluid.types;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.common.SoundActions;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.item.Rarity;
import net.minecraft.sounds.SoundEvents;

public class CapitalfonduFluidType extends FluidType {
	public CapitalfonduFluidType() {
		super(FluidType.Properties.create().canSwim(false).canDrown(false).pathType(PathType.LAVA).adjacentPathType(null).motionScale(0.035D).rarity(Rarity.RARE).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
				.sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}
}