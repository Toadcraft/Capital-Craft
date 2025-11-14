package net.mcreator.capitalmode.potion;

import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientMobEffectExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.capitalmode.init.CapitalModeModMobEffects;
import net.mcreator.capitalmode.CapitalModeMod;

@EventBusSubscriber
public class InfectedpotionMobEffect extends MobEffect {
	public InfectedpotionMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "effect.infectedpotion_0"), -2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "effect.infectedpotion_1"), -1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE, ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "effect.infectedpotion_2"), -1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ENTITY_INTERACTION_RANGE, ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "effect.infectedpotion_3"), -1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "effect.infectedpotion_4"), -1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(NeoForgeMod.SWIM_SPEED, ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "effect.infectedpotion_5"), -1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MINING_EFFICIENCY, ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "effect.infectedpotion_6"), -5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "effect.infectedpotion_7"), -5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.CAMERA_DISTANCE, ResourceLocation.fromNamespaceAndPath(CapitalModeMod.MODID, "effect.infectedpotion_8"), -10, AttributeModifier.Operation.ADD_VALUE);
	}

	@SubscribeEvent
	public static void registerMobEffectExtensions(RegisterClientExtensionsEvent event) {
		event.registerMobEffect(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, AbstractContainerScreen<?> screen, GuiGraphics guiGraphics, int x, int y, int blitOffset) {
				return false;
			}
		}, CapitalModeModMobEffects.INFECTEDPOTION.get());
	}
}