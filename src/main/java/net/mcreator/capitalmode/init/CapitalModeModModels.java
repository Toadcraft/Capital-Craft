/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.capitalmode.client.model.Modellvl9;
import net.mcreator.capitalmode.client.model.Modellvl10;
import net.mcreator.capitalmode.client.model.ModelCoeur_lvl1_8;

@EventBusSubscriber(Dist.CLIENT)
public class CapitalModeModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modellvl9.LAYER_LOCATION, Modellvl9::createBodyLayer);
		event.registerLayerDefinition(Modellvl10.LAYER_LOCATION, Modellvl10::createBodyLayer);
		event.registerLayerDefinition(ModelCoeur_lvl1_8.LAYER_LOCATION, ModelCoeur_lvl1_8::createBodyLayer);
	}
}