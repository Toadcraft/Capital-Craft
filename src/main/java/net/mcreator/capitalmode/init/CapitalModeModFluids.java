
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.capitalmode.fluid.IridfonduFluid;
import net.mcreator.capitalmode.fluid.CobaltfonduFluid;
import net.mcreator.capitalmode.fluid.CapitalfonduFluid;
import net.mcreator.capitalmode.CapitalModeMod;

public class CapitalModeModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CapitalModeMod.MODID);
	public static final RegistryObject<FlowingFluid> CAPITALFONDU = REGISTRY.register("capitalfondu", () -> new CapitalfonduFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CAPITALFONDU = REGISTRY.register("flowing_capitalfondu", () -> new CapitalfonduFluid.Flowing());
	public static final RegistryObject<FlowingFluid> COBALTFONDU = REGISTRY.register("cobaltfondu", () -> new CobaltfonduFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_COBALTFONDU = REGISTRY.register("flowing_cobaltfondu", () -> new CobaltfonduFluid.Flowing());
	public static final RegistryObject<FlowingFluid> IRIDFONDU = REGISTRY.register("iridfondu", () -> new IridfonduFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_IRIDFONDU = REGISTRY.register("flowing_iridfondu", () -> new IridfonduFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CAPITALFONDU.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CAPITALFONDU.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COBALTFONDU.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COBALTFONDU.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(IRIDFONDU.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_IRIDFONDU.get(), RenderType.translucent());
		}
	}
}
