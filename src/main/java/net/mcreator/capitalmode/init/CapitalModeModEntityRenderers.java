
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.capitalmode.client.renderer.MouetteRenderer;
import net.mcreator.capitalmode.client.renderer.GardiendemoniaqueRenderer;
import net.mcreator.capitalmode.client.renderer.DemonRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CapitalModeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CapitalModeModEntities.DEMON.get(), DemonRenderer::new);
		event.registerEntityRenderer(CapitalModeModEntities.GARDIENDEMONIAQUE.get(), GardiendemoniaqueRenderer::new);
		event.registerEntityRenderer(CapitalModeModEntities.MOUETTE.get(), MouetteRenderer::new);
	}
}
