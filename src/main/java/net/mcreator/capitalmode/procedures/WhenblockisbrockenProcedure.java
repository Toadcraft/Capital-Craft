package net.mcreator.capitalmode.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.world.inventory.GgmineurMenu;
import net.mcreator.capitalmode.network.CapitalModeModVariables;
import net.mcreator.capitalmode.init.CapitalModeModItems;
import net.mcreator.capitalmode.init.CapitalModeModBlocks;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

@EventBusSubscriber
public class WhenblockisbrockenProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRANITE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIORITE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ANDESITE
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BLACKSTONE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BASALT)
				&& entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur == 0) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 1;
				_vars.markSyncDirty();
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COAL_ORE && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur == 5) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 10;
				_vars.markSyncDirty();
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur >= 100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur == 0) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur + 1;
				_vars.xp_mineur = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggmineur");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgmineurMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level)
				_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRANITE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIORITE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ANDESITE
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BLACKSTONE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BASALT)
				&& entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 1) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 1;
				_vars.markSyncDirty();
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COAL_ORE && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 5) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 5;
				_vars.markSyncDirty();
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 10;
				_vars.markSyncDirty();
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 10;
				_vars.markSyncDirty();
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAPIS_ORE && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 10;
				_vars.markSyncDirty();
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIAMOND_ORE && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 30) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 50;
				_vars.markSyncDirty();
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ANCIENT_DEBRIS && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 200;
				_vars.markSyncDirty();
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CAPITAL_ORE.get() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur + 100;
				_vars.markSyncDirty();
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CAPITAL_ORE.get() && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skill_06 == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.CAPITAL.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur >= 200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur == 1) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur + 1;
				_vars.xp_mineur = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggmineur");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgmineurMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur >= 300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur == 2) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur + 1;
				_vars.xp_mineur = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggmineur");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgmineurMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index0 = 0; index0 < 3; index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur >= 400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur == 3) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur + 1;
				_vars.xp_mineur = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggmineur");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgmineurMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index1 = 0; index1 < 4; index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur >= 500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur == 4) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_mineur = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_mineur + 1;
				_vars.xp_mineur = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggmineur");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgmineurMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 1;
				_vars.markSyncDirty();
			}
			for (int index2 = 0; index2 < 5; index2++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CARROTS || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.POTATOES)
				&& entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 0) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 5;
				_vars.markSyncDirty();
			}
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LOG || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WARPED_STEM || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_STEM)
				&& entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan >= 10) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan + 10;
				_vars.markSyncDirty();
			}
		}
	}
}