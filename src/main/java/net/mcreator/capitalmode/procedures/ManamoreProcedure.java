package net.mcreator.capitalmode.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.network.CapitalModeModVariables;
import net.mcreator.capitalmode.init.CapitalModeModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ManamoreProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Mana >= 10 && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.ELECTRICFURNACE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy(100, false);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.Mana = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Mana - 10;
				_vars.markSyncDirty();
			}
		} else if (entity.isShiftKeyDown() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).Mana < 10 && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.ELECTRICFURNACE.get()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Vous n'avez pas assez de mana !"), false);
		}
	}
}