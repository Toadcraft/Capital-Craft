/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.capitalmode.fluid.types.IridfonduFluidType;
import net.mcreator.capitalmode.fluid.types.CobaltfonduFluidType;
import net.mcreator.capitalmode.fluid.types.CapitalfonduFluidType;
import net.mcreator.capitalmode.CapitalModeMod;

public class CapitalModeModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CapitalModeMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> CAPITALFONDU_TYPE = REGISTRY.register("capitalfondu", () -> new CapitalfonduFluidType());
	public static final DeferredHolder<FluidType, FluidType> COBALTFONDU_TYPE = REGISTRY.register("cobaltfondu", () -> new CobaltfonduFluidType());
	public static final DeferredHolder<FluidType, FluidType> IRIDFONDU_TYPE = REGISTRY.register("iridfondu", () -> new IridfonduFluidType());
}