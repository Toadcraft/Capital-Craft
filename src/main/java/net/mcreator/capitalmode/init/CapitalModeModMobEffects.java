/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.capitalmode.potion.InfectedpotionMobEffect;
import net.mcreator.capitalmode.CapitalModeMod;

public class CapitalModeModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CapitalModeMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> INFECTEDPOTION = REGISTRY.register("infectedpotion", () -> new InfectedpotionMobEffect());
}