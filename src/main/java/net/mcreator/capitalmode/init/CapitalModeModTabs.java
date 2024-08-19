
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.capitalmode.CapitalModeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CapitalModeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CapitalModeMod.MODID);
	public static final RegistryObject<CreativeModeTab> CAPITAL_MOD = REGISTRY.register("capital_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.capital_mode.capital_mod")).icon(() -> new ItemStack(CapitalModeModItems.CAPITAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CapitalModeModItems.CAPITAL.get());
				tabData.accept(CapitalModeModBlocks.CAPITAL_ORE.get().asItem());
				tabData.accept(CapitalModeModItems.CAPITAL_OUTILS_PICKAXE.get());
				tabData.accept(CapitalModeModItems.CAPITAL_OUTILS_AXE.get());
				tabData.accept(CapitalModeModItems.CAPITAL_OUTILS_SWORD.get());
				tabData.accept(CapitalModeModItems.CAPITAL_OUTILS_SHOVEL.get());
				tabData.accept(CapitalModeModItems.CAPITAL_OUTILS_HOE.get());
				tabData.accept(CapitalModeModItems.CAPITALE_ARMOR_HELMET.get());
				tabData.accept(CapitalModeModItems.CAPITALE_ARMOR_CHESTPLATE.get());
				tabData.accept(CapitalModeModItems.CAPITALE_ARMOR_LEGGINGS.get());
				tabData.accept(CapitalModeModItems.CAPITALE_ARMOR_BOOTS.get());
				tabData.accept(CapitalModeModItems.CAPITALFONDU_BUCKET.get());
				tabData.accept(CapitalModeModItems.CAPITALAPPLE.get());
				tabData.accept(CapitalModeModItems.DEMON_HEARS.get());
				tabData.accept(CapitalModeModItems.COBALT.get());
				tabData.accept(CapitalModeModItems.RUBI_PICKAXE.get());
				tabData.accept(CapitalModeModItems.RUBI_AXE.get());
				tabData.accept(CapitalModeModItems.RUBI_SWORD.get());
				tabData.accept(CapitalModeModItems.RUBI_SHOVEL.get());
				tabData.accept(CapitalModeModItems.RUBI_HOE.get());
				tabData.accept(CapitalModeModItems.RUBI_ARMOR_HELMET.get());
				tabData.accept(CapitalModeModItems.RUBI_ARMOR_CHESTPLATE.get());
				tabData.accept(CapitalModeModItems.RUBI_ARMOR_LEGGINGS.get());
				tabData.accept(CapitalModeModItems.RUBI_ARMOR_BOOTS.get());
				tabData.accept(CapitalModeModItems.CAPITALSTICK.get());
				tabData.accept(CapitalModeModBlocks.CABLOCK.get().asItem());
				tabData.accept(CapitalModeModBlocks.COBLOCK.get().asItem());
				tabData.accept(CapitalModeModBlocks.FONDERIE.get().asItem());
				tabData.accept(CapitalModeModItems.UN_EU.get());
				tabData.accept(CapitalModeModItems.DIXEURO.get());
				tabData.accept(CapitalModeModItems.CINQUANNTE_EU.get());
				tabData.accept(CapitalModeModItems.CENT_EU.get());
				tabData.accept(CapitalModeModItems.CINQCEN_EU.get());
				tabData.accept(CapitalModeModItems.AMELIORATEURLVL_2.get());
				tabData.accept(CapitalModeModItems.AMELIORATEURLVL_3.get());
				tabData.accept(CapitalModeModItems.AMELIORATEURLVL_4.get());
				tabData.accept(CapitalModeModItems.AMELIORATEURLVL_5.get());
				tabData.accept(CapitalModeModItems.SPEED_SWORD.get());
				tabData.accept(CapitalModeModBlocks.CAPITAL_MACHINE.get().asItem());
				tabData.accept(CapitalModeModItems.AMELIORASTONE.get());
				tabData.accept(CapitalModeModItems.SPEEDSTONE.get());
				tabData.accept(CapitalModeModItems.SPEEDPICKAXE.get());
				tabData.accept(CapitalModeModItems.CAPITALHAMMER.get());
				tabData.accept(CapitalModeModItems.CAPITALWAND.get());
				tabData.accept(CapitalModeModItems.ULTIMASTONE.get());
				tabData.accept(CapitalModeModItems.BIGSWORD.get());
				tabData.accept(CapitalModeModItems.COBALTBIGWORD.get());
				tabData.accept(CapitalModeModItems.COBALTSPEEDSWORD.get());
				tabData.accept(CapitalModeModItems.AMELIORATEURNIV_6ITEM.get());
				tabData.accept(CapitalModeModItems.COBALTSPEEDPICKAXE.get());
				tabData.accept(CapitalModeModItems.COBALT_HAMMER.get());
				tabData.accept(CapitalModeModItems.AMELIORATEURLVL_7.get());
				tabData.accept(CapitalModeModItems.AMELIORATEURLVL_8.get());
				tabData.accept(CapitalModeModItems.MILLEEURO.get());
				tabData.accept(CapitalModeModItems.SUGILITE.get());
				tabData.accept(CapitalModeModBlocks.SUGILITE_BLOCK.get().asItem());
				tabData.accept(CapitalModeModItems.SUGILITE_PICKAXE.get());
				tabData.accept(CapitalModeModItems.SUGILITE_AXE.get());
				tabData.accept(CapitalModeModItems.SUGILITE_SWORD.get());
				tabData.accept(CapitalModeModItems.SUGILITE_SHOVEL.get());
				tabData.accept(CapitalModeModItems.SUGILITE_HOE.get());
				tabData.accept(CapitalModeModItems.SUGILITE_ARMOR_HELMET.get());
				tabData.accept(CapitalModeModItems.SUGILITE_ARMOR_CHESTPLATE.get());
				tabData.accept(CapitalModeModItems.SUGILITE_ARMOR_LEGGINGS.get());
				tabData.accept(CapitalModeModItems.SUGILITE_ARMOR_BOOTS.get());
				tabData.accept(CapitalModeModItems.BATONIRIDUIM.get());
				tabData.accept(CapitalModeModItems.IRIDIUMBIGSWORD.get());
				tabData.accept(CapitalModeModItems.IRIDIUMSPEEDSWORD.get());
				tabData.accept(CapitalModeModItems.IRIDIUMHAMMER.get());
				tabData.accept(CapitalModeModItems.IRIDIUMSPEEDPICKAXE.get());
				tabData.accept(CapitalModeModItems.AMELIORATEURLVL_9.get());
				tabData.accept(CapitalModeModItems.AMELIORATEURLVL_10.get());
				tabData.accept(CapitalModeModItems.ACHATCHUNK.get());
				tabData.accept(CapitalModeModItems.PERFECT_COAL.get());
				tabData.accept(CapitalModeModBlocks.CONDENSEDSTONE.get().asItem());
				tabData.accept(CapitalModeModBlocks.ULTRACONDENSED.get().asItem());
				tabData.accept(CapitalModeModItems.COBALTFONDU_BUCKET.get());
				tabData.accept(CapitalModeModItems.CAPITALPOWDER.get());
				tabData.accept(CapitalModeModItems.COBALTPOWDER.get());
				tabData.accept(CapitalModeModItems.IRIDIUMPOWDER.get());
				tabData.accept(CapitalModeModItems.IRIDFONDU_BUCKET.get());
				tabData.accept(CapitalModeModItems.DEADSTONE.get());
				tabData.accept(CapitalModeModItems.CAPITAL_FAUX.get());
				tabData.accept(CapitalModeModItems.COBGDAGUE.get());
				tabData.accept(CapitalModeModItems.CAPITALDAGUE.get());
				tabData.accept(CapitalModeModItems.FIRESTONE.get());
				tabData.accept(CapitalModeModItems.CAPITALSPEAR.get());
				tabData.accept(CapitalModeModItems.ROUEDUGARDIEN.get());
				tabData.accept(CapitalModeModItems.RELIQUEEAU.get());
				tabData.accept(CapitalModeModItems.RELIQUEBOOF.get());
				tabData.accept(CapitalModeModItems.RELIQUESAC.get());
				tabData.accept(CapitalModeModItems.RELIQUEFIRE.get());
				tabData.accept(CapitalModeModItems.RELIQUEPVP.get());
				tabData.accept(CapitalModeModItems.JOUETMARTEAU.get());
				tabData.accept(CapitalModeModBlocks.INVOCATEUR.get().asItem());
				tabData.accept(CapitalModeModItems.DEMONWORLD.get());
				tabData.accept(CapitalModeModItems.CAPITALSEED.get());
				tabData.accept(CapitalModeModBlocks.DOLOMITEORE.get().asItem());
				tabData.accept(CapitalModeModItems.DOLOMITEINGOT.get());
				tabData.accept(CapitalModeModItems.SOUL_SWORD.get());
				tabData.accept(CapitalModeModItems.INVISIBLEARMOR_HELMET.get());
				tabData.accept(CapitalModeModItems.INVISIBLEARMOR_CHESTPLATE.get());
				tabData.accept(CapitalModeModItems.INVISIBLEARMOR_LEGGINGS.get());
				tabData.accept(CapitalModeModItems.INVISIBLEARMOR_BOOTS.get());
				tabData.accept(CapitalModeModBlocks.ELECTRICFURNACE.get().asItem());
				tabData.accept(CapitalModeModItems.SUPER_COBALT_OLD_SWORD.get());
				tabData.accept(CapitalModeModBlocks.PANNEAUSOLAIR.get().asItem());
				tabData.accept(CapitalModeModBlocks.DIMENSIONALMACHINE.get().asItem());
				tabData.accept(CapitalModeModBlocks.BOXCOMMUNE.get().asItem());
				tabData.accept(CapitalModeModBlocks.DYNAMO.get().asItem());
				tabData.accept(CapitalModeModBlocks.MINERALYSER.get().asItem());
				tabData.accept(CapitalModeModBlocks.BATTERIE.get().asItem());
				tabData.accept(CapitalModeModItems.BANDAGE.get());
				tabData.accept(CapitalModeModItems.DEMON_SPAWN_EGG.get());
				tabData.accept(CapitalModeModItems.GARDIENDEMONIAQUE_SPAWN_EGG.get());
				tabData.accept(CapitalModeModBlocks.AUTEL_DEMONIAQUE.get().asItem());
				tabData.accept(CapitalModeModBlocks.ATM.get().asItem());
				tabData.accept(CapitalModeModItems.COBALTSEED.get());
				tabData.accept(CapitalModeModItems.IRIDIUMSEED.get());
				tabData.accept(CapitalModeModBlocks.DOLOMITE_FARMLAND.get().asItem());
				tabData.accept(CapitalModeModBlocks.QUARRY.get().asItem());
				tabData.accept(CapitalModeModBlocks.LIMITES.get().asItem());
				tabData.accept(CapitalModeModBlocks.CAPITALE.get().asItem());
				tabData.accept(CapitalModeModBlocks.BUEGRASS.get().asItem());
				tabData.accept(CapitalModeModBlocks.CABLE.get().asItem());
				tabData.accept(CapitalModeModItems.TRAVEL_HELMET.get());
				tabData.accept(CapitalModeModItems.TRAVEL_CHESTPLATE.get());
				tabData.accept(CapitalModeModItems.TRAVEL_LEGGINGS.get());
				tabData.accept(CapitalModeModItems.TRAVEL_BOOTS.get());
				tabData.accept(CapitalModeModBlocks.LUMIERE.get().asItem());
				tabData.accept(CapitalModeModItems.BIONICSWORD.get());
				tabData.accept(CapitalModeModItems.BATTERIEEXTERNE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CapitalModeModItems.MOUETTE_SPAWN_EGG.get());
		}
	}
}
