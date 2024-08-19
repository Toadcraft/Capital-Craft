
package net.mcreator.capitalmode.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.capitalmode.init.CapitalModeModItems;
import net.mcreator.capitalmode.init.CapitalModeModFluids;
import net.mcreator.capitalmode.init.CapitalModeModFluidTypes;
import net.mcreator.capitalmode.init.CapitalModeModBlocks;

public abstract class CobaltfonduFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CapitalModeModFluidTypes.COBALTFONDU_TYPE.get(), () -> CapitalModeModFluids.COBALTFONDU.get(),
			() -> CapitalModeModFluids.FLOWING_COBALTFONDU.get()).explosionResistance(100f).bucket(() -> CapitalModeModItems.COBALTFONDU_BUCKET.get()).block(() -> (LiquidBlock) CapitalModeModBlocks.COBALTFONDU.get());

	private CobaltfonduFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CobaltfonduFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CobaltfonduFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
