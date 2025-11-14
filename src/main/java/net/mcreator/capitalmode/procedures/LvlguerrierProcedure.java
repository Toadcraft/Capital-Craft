package net.mcreator.capitalmode.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.world.inventory.GGguerierMenu;
import net.mcreator.capitalmode.world.inventory.CapmachineMenu;
import net.mcreator.capitalmode.network.CapitalModeModVariables;
import net.mcreator.capitalmode.init.CapitalModeModItems;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

@EventBusSubscriber
public class LvlguerrierProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 0) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index0 = 0; index0 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 1) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index1 = 0; index1 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 2) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index2 = 0; index2 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index2++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 3) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index3 = 0; index3 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index3++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 4) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 1;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index4 = 0; index4 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index4++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 5) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index5 = 0; index5 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index5++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 700 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 6) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index6 = 0; index6 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index6++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 800 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 7) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index7 = 0; index7 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index7++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 900 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 8) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index8 = 0; index8 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index8++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 1000 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 9) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 1;
				_vars.markSyncDirty();
			}
			for (int index9 = 0; index9 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index9++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 1100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 10) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index10 = 0; index10 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index10++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 1200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 11) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index11 = 0; index11 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index11++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 1300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 12) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index12 = 0; index12 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index12++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 1400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 13) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index13 = 0; index13 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index13++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 1500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 14) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 2;
				_vars.markSyncDirty();
			}
			for (int index14 = 0; index14 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index14++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 1600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 15) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index15 = 0; index15 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index15++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 1700 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 16) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index16 = 0; index16 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index16++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 1800 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 17) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index17 = 0; index17 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index17++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 1900 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 18) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index18 = 0; index18 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index18++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 2000 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 19) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 2;
				_vars.markSyncDirty();
			}
			for (int index19 = 0; index19 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index19++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 2100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index20 = 0; index20 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index20++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 2200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 21) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index21 = 0; index21 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index21++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 2300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 22) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index22 = 0; index22 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index22++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 2400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 23) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index23 = 0; index23 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index23++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 2500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 24) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 3;
				_vars.markSyncDirty();
			}
			for (int index24 = 0; index24 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index24++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.SUGILITE.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 2600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 25) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index25 = 0; index25 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index25++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 2700 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 26) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index26 = 0; index26 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index26++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 2800 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 27) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index27 = 0; index27 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index27++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 2900 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 28) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index28 = 0; index28 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index28++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 3000 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 29) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 3;
				_vars.markSyncDirty();
			}
			for (int index29 = 0; index29 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index29++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 3100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 30) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index30 = 0; index30 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index30++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 3200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 31) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index31 = 0; index31 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index31++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 3300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 32) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index32 = 0; index32 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index32++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 3400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 33) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Capmachine");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new CapmachineMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index33 = 0; index33 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index33++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 3500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 34) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 4;
				_vars.markSyncDirty();
			}
			for (int index34 = 0; index34 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index34++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 3600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index35 = 0; index35 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index35++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 3700 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 36) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index36 = 0; index36 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index36++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 3800 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 37) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index37 = 0; index37 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index37++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 3900 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 38) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index38 = 0; index38 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index38++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 4000 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 39) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 4;
				_vars.markSyncDirty();
			}
			for (int index39 = 0; index39 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index39++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 4100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index40 = 0; index40 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index40++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 4200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 41) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index41 = 0; index41 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index41++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 4300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 42) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index42 = 0; index42 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index42++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 4400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 43) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index43 = 0; index43 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index43++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 4500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 44) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 5;
				_vars.markSyncDirty();
			}
			for (int index44 = 0; index44 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index44++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 4600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 45) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index45 = 0; index45 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index45++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 4700 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 46) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index46 = 0; index46 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index46++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 4800 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 47) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index47 = 0; index47 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index47++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 4900 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 48) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index48 = 0; index48 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index48++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier >= 5000 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier == 49) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier + 1;
				_vars.xp_guerrier = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("GGguerier");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GGguerierMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 5;
				_vars.markSyncDirty();
			}
			for (int index49 = 0; index49 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier; index49++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.SUGILITE_SWORD.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.SUGILITE_ARMOR_CHESTPLATE.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.SUGILITE_SWORD.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}