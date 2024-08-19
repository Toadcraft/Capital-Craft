
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.capitalmode.fluid.types.IridfonduFluidType;
import net.mcreator.capitalmode.fluid.types.CobaltfonduFluidType;
import net.mcreator.capitalmode.fluid.types.CapitalfonduFluidType;
import net.mcreator.capitalmode.CapitalModeMod;

public class CapitalModeModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CapitalModeMod.MODID);
	public static final RegistryObject<FluidType> CAPITALFONDU_TYPE = REGISTRY.register("capitalfondu", () -> new CapitalfonduFluidType());
	public static final RegistryObject<FluidType> COBALTFONDU_TYPE = REGISTRY.register("cobaltfondu", () -> new CobaltfonduFluidType());
	public static final RegistryObject<FluidType> IRIDFONDU_TYPE = REGISTRY.register("iridfondu", () -> new IridfonduFluidType());
}
