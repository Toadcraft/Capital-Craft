package net.mcreator.capitalmode.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.capitalmode.init.CapitalModeModFluids;

public class CobaltfonduBlock extends LiquidBlock {
	public CobaltfonduBlock(BlockBehaviour.Properties properties) {
		super(CapitalModeModFluids.COBALTFONDU.get(), properties.mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}