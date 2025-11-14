package net.mcreator.capitalmode.procedures;

import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class QuarryMiseAJourDuTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "drill") && getEnergyStored(world, BlockPos.containing(x, y, z), null) >= 10) {
			if (!((world.getBlockState(
					BlockPos.containing(x + getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qx"), y - getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qy"), z + getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qz"))))
					.getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = BlockPos.containing(x + getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qx"), y - getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qy"),
							z + getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qz"));
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y + 2.2, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy(10, false);
			}
			if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qx") > 16) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("qx", 2);
						_blockEntity.getPersistentData().putDouble("qz", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qz") + 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qz") > 16) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("qx", 2);
						_blockEntity.getPersistentData().putDouble("qz", 1);
						_blockEntity.getPersistentData().putDouble("qy", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qy") + 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("qx", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "qx") + 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getBooleanOr(tag, false);
		return false;
	}

	public static int getEnergyStored(LevelAccessor level, BlockPos pos, Direction direction) {
		if (level instanceof ILevelExtension levelExtension) {
			IEnergyStorage energyStorage = levelExtension.getCapability(Capabilities.EnergyStorage.BLOCK, pos, direction);
			if (energyStorage != null)
				return energyStorage.getEnergyStored();
		}
		return 0;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}