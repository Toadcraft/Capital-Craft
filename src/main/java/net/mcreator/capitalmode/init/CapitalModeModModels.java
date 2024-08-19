
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.capitalmode.client.model.Modellvl9;
import net.mcreator.capitalmode.client.model.Modellvl10;
import net.mcreator.capitalmode.client.model.ModelCoeur_lvl1_8;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CapitalModeModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modellvl9.LAYER_LOCATION, Modellvl9::createBodyLayer);
		event.registerLayerDefinition(Modellvl10.LAYER_LOCATION, Modellvl10::createBodyLayer);
		event.registerLayerDefinition(ModelCoeur_lvl1_8.LAYER_LOCATION, ModelCoeur_lvl1_8::createBodyLayer);
	}
}
