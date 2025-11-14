/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.capitalmode.client.renderer.MouetteRenderer;
import net.mcreator.capitalmode.client.renderer.GardiendemoniaqueRenderer;
import net.mcreator.capitalmode.client.renderer.DemonRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class CapitalModeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CapitalModeModEntities.MOUETTE.get(), MouetteRenderer::new);
		event.registerEntityRenderer(CapitalModeModEntities.DEMON.get(), DemonRenderer::new);
		event.registerEntityRenderer(CapitalModeModEntities.GARDIENDEMONIAQUE.get(), GardiendemoniaqueRenderer::new);
	}
}