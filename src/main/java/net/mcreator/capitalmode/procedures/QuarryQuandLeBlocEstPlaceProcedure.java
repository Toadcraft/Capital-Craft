package net.mcreator.capitalmode.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.init.CapitalModeModBlocks;

public class QuarryQuandLeBlocEstPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean allowToDrill = false;
		double qx = 0;
		double qz = 0;
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("energyMax", 5000);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		qx = 1;
		qz = 0;
		allowToDrill = true;
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putBoolean("drill", false);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		for (int index0 = 0; index0 < 18; index0++) {
			qx = 1;
			for (int index1 = 0; index1 < 18; index1++) {
				qx = qx + 1;
				if (!((world.getBlockState(BlockPos.containing(x + qx, y, z + qz))).getBlock() == Blocks.AIR)) {
					allowToDrill = false;
				}
			}
			qz = qz + 1;
		}
		if (allowToDrill) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("drill", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			qx = 1;
			qz = 0;
			for (int index2 = 0; index2 < 18; index2++) {
				qx = 1;
				for (int index3 = 0; index3 < 18; index3++) {
					world.setBlock(BlockPos.containing(x + qx, y, z + qz), CapitalModeModBlocks.LIMITES.get().defaultBlockState(), 3);
					qx = qx + 1;
				}
				qz = qz + 1;
			}
			qx = 2;
			qz = 1;
			for (int index4 = 0; index4 < 16; index4++) {
				qx = 2;
				for (int index5 = 0; index5 < 16; index5++) {
					world.setBlock(BlockPos.containing(x + qx, y, z + qz), Blocks.AIR.defaultBlockState(), 3);
					qx = qx + 1;
				}
				qz = qz + 1;
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("qx", 2);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("qz", 1);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("qy", 1);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Area not clear !"), false);
		}
	}
}
