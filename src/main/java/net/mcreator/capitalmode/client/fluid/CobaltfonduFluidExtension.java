package net.mcreator.capitalmode.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.capitalmode.init.CapitalModeModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class CobaltfonduFluidExtension {
	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("capital_mode:block/cobaltfondu1");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("capital_mode:block/cobaltfondu1");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}
		}, CapitalModeModFluidTypes.COBALTFONDU_TYPE.get());
	}
}