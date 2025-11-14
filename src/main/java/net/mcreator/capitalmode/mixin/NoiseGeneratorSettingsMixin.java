package net.mcreator.capitalmode.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.capitalmode.init.CapitalModeModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements CapitalModeModBiomes.CapitalModeModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> capital_mode_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.capital_mode_dimensionTypeReference != null) {
			retval = CapitalModeModBiomes.adaptSurfaceRule(retval, this.capital_mode_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setcapital_modeDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.capital_mode_dimensionTypeReference = dimensionType;
	}
}