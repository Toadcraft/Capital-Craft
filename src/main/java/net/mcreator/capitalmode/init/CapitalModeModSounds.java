/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.capitalmode.CapitalModeMod;

public class CapitalModeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CapitalModeMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MOUETTE = REGISTRY.register("mouette", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("capital_mode", "mouette")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MOUETTE2 = REGISTRY.register("mouette2", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("capital_mode", "mouette2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MOUETTE3 = REGISTRY.register("mouette3", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("capital_mode", "mouette3")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MOUETTE4 = REGISTRY.register("mouette4", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("capital_mode", "mouette4")));
}