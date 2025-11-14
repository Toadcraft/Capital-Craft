package net.mcreator.capitalmode.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.capitalmode.init.CapitalModeModItems;
import net.mcreator.capitalmode.init.CapitalModeModFluids;
import net.mcreator.capitalmode.init.CapitalModeModFluidTypes;
import net.mcreator.capitalmode.init.CapitalModeModBlocks;

public abstract class IridfonduFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> CapitalModeModFluidTypes.IRIDFONDU_TYPE.get(), () -> CapitalModeModFluids.IRIDFONDU.get(), () -> CapitalModeModFluids.FLOWING_IRIDFONDU.get())
			.explosionResistance(100f).bucket(() -> CapitalModeModItems.IRIDFONDU_BUCKET.get()).block(() -> (LiquidBlock) CapitalModeModBlocks.IRIDFONDU.get());

	private IridfonduFluid() {
		super(PROPERTIES);
	}

	public static class Source extends IridfonduFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends IridfonduFluid {
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