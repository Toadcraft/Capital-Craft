
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.entity.MouetteEntity;
import net.mcreator.capitalmode.entity.GardiendemoniaqueEntity;
import net.mcreator.capitalmode.entity.DemonEntity;
import net.mcreator.capitalmode.CapitalModeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CapitalModeModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CapitalModeMod.MODID);
	public static final RegistryObject<EntityType<MouetteEntity>> MOUETTE = register("mouette",
			EntityType.Builder.<MouetteEntity>of(MouetteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MouetteEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DemonEntity>> DEMON = register("demon",
			EntityType.Builder.<DemonEntity>of(DemonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DemonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GardiendemoniaqueEntity>> GARDIENDEMONIAQUE = register("gardiendemoniaque", EntityType.Builder.<GardiendemoniaqueEntity>of(GardiendemoniaqueEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GardiendemoniaqueEntity::new).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MouetteEntity.init();
			DemonEntity.init();
			GardiendemoniaqueEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MOUETTE.get(), MouetteEntity.createAttributes().build());
		event.put(DEMON.get(), DemonEntity.createAttributes().build());
		event.put(GARDIENDEMONIAQUE.get(), GardiendemoniaqueEntity.createAttributes().build());
	}
}
