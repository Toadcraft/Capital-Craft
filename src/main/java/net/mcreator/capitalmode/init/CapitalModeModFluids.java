/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.capitalmode.fluid.IridfonduFluid;
import net.mcreator.capitalmode.fluid.CobaltfonduFluid;
import net.mcreator.capitalmode.fluid.CapitalfonduFluid;
import net.mcreator.capitalmode.CapitalModeMod;

public class CapitalModeModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, CapitalModeMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> CAPITALFONDU = REGISTRY.register("capitalfondu", () -> new CapitalfonduFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_CAPITALFONDU = REGISTRY.register("flowing_capitalfondu", () -> new CapitalfonduFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COBALTFONDU = REGISTRY.register("cobaltfondu", () -> new CobaltfonduFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COBALTFONDU = REGISTRY.register("flowing_cobaltfondu", () -> new CobaltfonduFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> IRIDFONDU = REGISTRY.register("iridfondu", () -> new IridfonduFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_IRIDFONDU = REGISTRY.register("flowing_iridfondu", () -> new IridfonduFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CAPITALFONDU.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CAPITALFONDU.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(COBALTFONDU.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COBALTFONDU.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(IRIDFONDU.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_IRIDFONDU.get(), ChunkSectionLayer.TRANSLUCENT);
		}
	}
}