package net.mcreator.capitalmode.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.capitalmode.init.CapitalModeModFluids;

public class IridfonduBlock extends LiquidBlock {
	public IridfonduBlock(BlockBehaviour.Properties properties) {
		super(CapitalModeModFluids.IRIDFONDU.get(), properties.mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}