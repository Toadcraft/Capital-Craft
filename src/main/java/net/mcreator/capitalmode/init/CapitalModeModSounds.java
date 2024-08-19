
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.capitalmode.CapitalModeMod;

public class CapitalModeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CapitalModeMod.MODID);
	public static final RegistryObject<SoundEvent> MOUETTE = REGISTRY.register("mouette", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("capital_mode", "mouette")));
	public static final RegistryObject<SoundEvent> MOUETTE2 = REGISTRY.register("mouette2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("capital_mode", "mouette2")));
	public static final RegistryObject<SoundEvent> MOUETTE3 = REGISTRY.register("mouette3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("capital_mode", "mouette3")));
	public static final RegistryObject<SoundEvent> MOUETTE4 = REGISTRY.register("mouette4", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("capital_mode", "mouette4")));
}
