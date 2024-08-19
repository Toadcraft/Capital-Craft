
package net.mcreator.capitalmode.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.capitalmode.entity.GardiendemoniaqueEntity;

public class GardiendemoniaqueRenderer extends HumanoidMobRenderer<GardiendemoniaqueEntity, HumanoidModel<GardiendemoniaqueEntity>> {
	public GardiendemoniaqueRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(GardiendemoniaqueEntity entity) {
		return new ResourceLocation("capital_mode:textures/entities/demon.png");
	}
}
