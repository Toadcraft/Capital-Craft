/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.capitalmode.block.entity.*;
import net.mcreator.capitalmode.CapitalModeMod;

@EventBusSubscriber
public class CapitalModeModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, CapitalModeMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CapitalMachineBlockEntity>> CAPITAL_MACHINE = register("capital_machine", CapitalModeModBlocks.CAPITAL_MACHINE, CapitalMachineBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FonderieBlockEntity>> FONDERIE = register("fonderie", CapitalModeModBlocks.FONDERIE, FonderieBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ElectricfurnaceBlockEntity>> ELECTRICFURNACE = register("electricfurnace", CapitalModeModBlocks.ELECTRICFURNACE, ElectricfurnaceBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PanneausolairBlockEntity>> PANNEAUSOLAIR = register("panneausolair", CapitalModeModBlocks.PANNEAUSOLAIR, PanneausolairBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DimensionalmachineBlockEntity>> DIMENSIONALMACHINE = register("dimensionalmachine", CapitalModeModBlocks.DIMENSIONALMACHINE, DimensionalmachineBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DynamoBlockEntity>> DYNAMO = register("dynamo", CapitalModeModBlocks.DYNAMO, DynamoBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MineralyserBlockEntity>> MINERALYSER = register("mineralyser", CapitalModeModBlocks.MINERALYSER, MineralyserBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BatterieBlockEntity>> BATTERIE = register("batterie", CapitalModeModBlocks.BATTERIE, BatterieBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ATMBlockEntity>> ATM = register("atm", CapitalModeModBlocks.ATM, ATMBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<QuarryBlockEntity>> QUARRY = register("quarry", CapitalModeModBlocks.QUARRY, QuarryBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CapitaleBlockEntity>> CAPITALE = register("capitale", CapitalModeModBlocks.CAPITALE, CapitaleBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableBlockEntity>> CABLE = register("cable", CapitalModeModBlocks.CABLE, CableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableeBlockEntity>> CABLEE = register("cablee", CapitalModeModBlocks.CABLEE, CableeBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableiBlockEntity>> CABLEI = register("cablei", CapitalModeModBlocks.CABLEI, CableiBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CablelBlockEntity>> CABLEL = register("cablel", CapitalModeModBlocks.CABLEL, CablelBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableLCBlockEntity>> CABLE_LC = register("cable_lc", CapitalModeModBlocks.CABLE_LC, CableLCBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableLCCBlockEntity>> CABLE_LCC = register("cable_lcc", CapitalModeModBlocks.CABLE_LCC, CableLCCBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableLTBlockEntity>> CABLE_LT = register("cable_lt", CapitalModeModBlocks.CABLE_LT, CableLTBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableLTCBlockEntity>> CABLE_LTC = register("cable_ltc", CapitalModeModBlocks.CABLE_LTC, CableLTCBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableTBlockEntity>> CABLE_T = register("cable_t", CapitalModeModBlocks.CABLE_T, CableTBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableTCBlockEntity>> CABLE_TC = register("cable_tc", CapitalModeModBlocks.CABLE_TC, CableTCBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableTXBlockEntity>> CABLE_TX = register("cable_tx", CapitalModeModBlocks.CABLE_TX, CableTXBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableTXCBlockEntity>> CABLE_TXC = register("cable_txc", CapitalModeModBlocks.CABLE_TXC, CableTXCBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableTXCCBlockEntity>> CABLE_TXCC = register("cable_txcc", CapitalModeModBlocks.CABLE_TXCC, CableTXCCBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableXBlockEntity>> CABLE_X = register("cable_x", CapitalModeModBlocks.CABLE_X, CableXBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableXCBlockEntity>> CABLE_XC = register("cable_xc", CapitalModeModBlocks.CABLE_XC, CableXCBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableFBlockEntity>> CABLE_F = register("cable_f", CapitalModeModBlocks.CABLE_F, CableFBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CableSBlockEntity>> CABLE_S = register("cable_s", CapitalModeModBlocks.CABLE_S, CableSBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CAPITAL_MACHINE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FONDERIE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ELECTRICFURNACE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, ELECTRICFURNACE.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PANNEAUSOLAIR.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, PANNEAUSOLAIR.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DIMENSIONALMACHINE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, DIMENSIONALMACHINE.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DYNAMO.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, DYNAMO.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MINERALYSER.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, MINERALYSER.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BATTERIE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, BATTERIE.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ATM.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, QUARRY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, QUARRY.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CAPITALE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLEE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLEE.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLEI.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLEI.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLEL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLEL.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_LC.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_LC.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_LCC.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_LCC.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_LT.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_LT.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_LTC.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_LTC.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_T.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_T.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_TC.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_TC.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_TX.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_TX.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_TXC.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_TXC.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_TXCC.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_TXCC.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_X.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_X.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_XC.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_XC.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_F.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_F.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CABLE_S.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CABLE_S.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
	}
}