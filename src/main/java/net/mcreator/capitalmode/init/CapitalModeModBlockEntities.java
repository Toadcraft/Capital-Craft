
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.capitalmode.block.entity.QuarryBlockEntity;
import net.mcreator.capitalmode.block.entity.PanneausolairBlockEntity;
import net.mcreator.capitalmode.block.entity.MineralyserBlockEntity;
import net.mcreator.capitalmode.block.entity.FonderieBlockEntity;
import net.mcreator.capitalmode.block.entity.ElectricfurnaceBlockEntity;
import net.mcreator.capitalmode.block.entity.DynamoBlockEntity;
import net.mcreator.capitalmode.block.entity.DimensionalmachineBlockEntity;
import net.mcreator.capitalmode.block.entity.CapitaleBlockEntity;
import net.mcreator.capitalmode.block.entity.CapitalMachineBlockEntity;
import net.mcreator.capitalmode.block.entity.CablelBlockEntity;
import net.mcreator.capitalmode.block.entity.CableiBlockEntity;
import net.mcreator.capitalmode.block.entity.CableeBlockEntity;
import net.mcreator.capitalmode.block.entity.CableXCBlockEntity;
import net.mcreator.capitalmode.block.entity.CableXBlockEntity;
import net.mcreator.capitalmode.block.entity.CableTXCCBlockEntity;
import net.mcreator.capitalmode.block.entity.CableTXCBlockEntity;
import net.mcreator.capitalmode.block.entity.CableTXBlockEntity;
import net.mcreator.capitalmode.block.entity.CableTCBlockEntity;
import net.mcreator.capitalmode.block.entity.CableTBlockEntity;
import net.mcreator.capitalmode.block.entity.CableSBlockEntity;
import net.mcreator.capitalmode.block.entity.CableLTCBlockEntity;
import net.mcreator.capitalmode.block.entity.CableLTBlockEntity;
import net.mcreator.capitalmode.block.entity.CableLCCBlockEntity;
import net.mcreator.capitalmode.block.entity.CableLCBlockEntity;
import net.mcreator.capitalmode.block.entity.CableFBlockEntity;
import net.mcreator.capitalmode.block.entity.CableBlockEntity;
import net.mcreator.capitalmode.block.entity.BatterieBlockEntity;
import net.mcreator.capitalmode.block.entity.ATMBlockEntity;
import net.mcreator.capitalmode.CapitalModeMod;

public class CapitalModeModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CapitalModeMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CAPITAL_MACHINE = register("capital_machine", CapitalModeModBlocks.CAPITAL_MACHINE, CapitalMachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FONDERIE = register("fonderie", CapitalModeModBlocks.FONDERIE, FonderieBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTRICFURNACE = register("electricfurnace", CapitalModeModBlocks.ELECTRICFURNACE, ElectricfurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PANNEAUSOLAIR = register("panneausolair", CapitalModeModBlocks.PANNEAUSOLAIR, PanneausolairBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DIMENSIONALMACHINE = register("dimensionalmachine", CapitalModeModBlocks.DIMENSIONALMACHINE, DimensionalmachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DYNAMO = register("dynamo", CapitalModeModBlocks.DYNAMO, DynamoBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MINERALYSER = register("mineralyser", CapitalModeModBlocks.MINERALYSER, MineralyserBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BATTERIE = register("batterie", CapitalModeModBlocks.BATTERIE, BatterieBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ATM = register("atm", CapitalModeModBlocks.ATM, ATMBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> QUARRY = register("quarry", CapitalModeModBlocks.QUARRY, QuarryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CAPITALE = register("capitale", CapitalModeModBlocks.CAPITALE, CapitaleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE = register("cable", CapitalModeModBlocks.CABLE, CableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLEE = register("cablee", CapitalModeModBlocks.CABLEE, CableeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLEI = register("cablei", CapitalModeModBlocks.CABLEI, CableiBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLEL = register("cablel", CapitalModeModBlocks.CABLEL, CablelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LC = register("cable_lc", CapitalModeModBlocks.CABLE_LC, CableLCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LCC = register("cable_lcc", CapitalModeModBlocks.CABLE_LCC, CableLCCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LT = register("cable_lt", CapitalModeModBlocks.CABLE_LT, CableLTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LTC = register("cable_ltc", CapitalModeModBlocks.CABLE_LTC, CableLTCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_T = register("cable_t", CapitalModeModBlocks.CABLE_T, CableTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TC = register("cable_tc", CapitalModeModBlocks.CABLE_TC, CableTCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TX = register("cable_tx", CapitalModeModBlocks.CABLE_TX, CableTXBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TXC = register("cable_txc", CapitalModeModBlocks.CABLE_TXC, CableTXCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TXCC = register("cable_txcc", CapitalModeModBlocks.CABLE_TXCC, CableTXCCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_X = register("cable_x", CapitalModeModBlocks.CABLE_X, CableXBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_XC = register("cable_xc", CapitalModeModBlocks.CABLE_XC, CableXCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_F = register("cable_f", CapitalModeModBlocks.CABLE_F, CableFBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_S = register("cable_s", CapitalModeModBlocks.CABLE_S, CableSBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
