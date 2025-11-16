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
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DimensionalmachineBlockEntity>> DIMENSIONALMACHINE = register("dimensionalmachine", CapitalModeModBlocks.DIMENSIONALMACHINE, DimensionalmachineBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BatterieBlockEntity>> BATTERIE = register("batterie", CapitalModeModBlocks.BATTERIE, BatterieBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ATMBlockEntity>> ATM = register("atm", CapitalModeModBlocks.ATM, ATMBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<QuarryBlockEntity>> QUARRY = register("quarry", CapitalModeModBlocks.QUARRY, QuarryBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CapitaleBlockEntity>> CAPITALE = register("capitale", CapitalModeModBlocks.CAPITALE, CapitaleBlockEntity::new);

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
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DIMENSIONALMACHINE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, DIMENSIONALMACHINE.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BATTERIE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, BATTERIE.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ATM.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, QUARRY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, QUARRY.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CAPITALE.get(), SidedInvWrapper::new);
	}
}