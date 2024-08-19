
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.capitalmode.CapitalModeMod;

public class CapitalModeModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, CapitalModeMod.MODID);
	public static final RegistryObject<Potion> JUSDOPALE = REGISTRY.register("jusdopale",
			() -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 2, false, true), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2, false, true), new MobEffectInstance(MobEffects.HUNGER, 3600, 2, false, true)));
}
