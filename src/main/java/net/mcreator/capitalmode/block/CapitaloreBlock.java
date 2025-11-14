package net.mcreator.capitalmode.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.util.ARGB;
import net.minecraft.core.BlockPos;

public class CapitaloreBlock extends Block {
	public CapitaloreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.5f, 10f).lightLevel(s -> 15).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public Integer getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return ARGB.opaque(-10092544);
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}