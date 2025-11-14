package net.mcreator.capitalmode.procedures;

import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class CableForgeEnergyMainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean east = false;
		boolean south = false;
		boolean north = false;
		boolean west = false;
		boolean up = false;
		boolean down = false;
		double sides = 0;
		double sendAmount = 0;
		double energy = 0;
		sides = CableForgeEnergySidesProcedure.execute(world, x, y, z);
		south = CableForgeEnergySouthProcedure.execute(world, x, y, z);
		north = CableForgeEnergyNorthProcedure.execute(world, x, y, z);
		east = CableForgeEnergyEastProcedure.execute(world, x, y, z);
		west = CableForgeEnergyWestProcedure.execute(world, x, y, z);
		up = CableForgeEnergyUpProcedure.execute(world, x, y, z);
		down = CableForgeEnergyDownProcedure.execute(world, x, y, z);
		if (south) {
			sendAmount = getEnergyStored(world, BlockPos.containing(x, y, z), null) / sides;
			energy = receiveEnergySimulate(world, BlockPos.containing(x, y, z + 1), (int) sendAmount, null);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z + 1), null);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) energy, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) energy, false);
			}
		}
		if (north) {
			sendAmount = getEnergyStored(world, BlockPos.containing(x, y, z), null) / sides;
			energy = receiveEnergySimulate(world, BlockPos.containing(x, y, z - 1), (int) sendAmount, null);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z - 1), null);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) energy, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) energy, false);
			}
		}
		if (east) {
			sendAmount = getEnergyStored(world, BlockPos.containing(x, y, z), null) / sides;
			energy = receiveEnergySimulate(world, BlockPos.containing(x + 1, y, z), (int) sendAmount, null);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x + 1, y, z), null);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) energy, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) energy, false);
			}
		}
		if (west) {
			sendAmount = getEnergyStored(world, BlockPos.containing(x, y, z), null) / sides;
			energy = receiveEnergySimulate(world, BlockPos.containing(x - 1, y, z), (int) sendAmount, null);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x - 1, y, z), null);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) energy, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) energy, false);
			}
		}
		if (up) {
			sendAmount = getEnergyStored(world, BlockPos.containing(x, y, z), null) / sides;
			energy = receiveEnergySimulate(world, BlockPos.containing(x, y + 1, z), (int) sendAmount, null);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y + 1, z), null);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) energy, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) energy, false);
			}
		}
		if (down) {
			sendAmount = getEnergyStored(world, BlockPos.containing(x, y, z), null) / sides;
			energy = receiveEnergySimulate(world, BlockPos.containing(x, y - 1, z), (int) sendAmount, null);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y - 1, z), null);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) energy, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) energy, false);
			}
		}
	}

	public static int getEnergyStored(LevelAccessor level, BlockPos pos, Direction direction) {
		if (level instanceof ILevelExtension levelExtension) {
			IEnergyStorage energyStorage = levelExtension.getCapability(Capabilities.EnergyStorage.BLOCK, pos, direction);
			if (energyStorage != null)
				return energyStorage.getEnergyStored();
		}
		return 0;
	}

	private static int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int amount, Direction direction) {
		if (level instanceof ILevelExtension levelExtension) {
			IEnergyStorage energyStorage = levelExtension.getCapability(Capabilities.EnergyStorage.BLOCK, pos, direction);
			if (energyStorage != null)
				return energyStorage.receiveEnergy(amount, true);
		}
		return 0;
	}
}