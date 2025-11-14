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

import net.mcreator.capitalmode.world.inventory.GgpaysanMenu;
import net.mcreator.capitalmode.network.CapitalModeModVariables;
import net.mcreator.capitalmode.init.CapitalModeModItems;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

@EventBusSubscriber
public class LvlpaysanProcedure {
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
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 0) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index0 = 0; index0 < 1; index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 1) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index1 = 0; index1 < 2; index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 2) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index2 = 0; index2 < 3; index2++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 3) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index3 = 0; index3 < 4; index3++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 4) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 1;
				_vars.markSyncDirty();
			}
			for (int index4 = 0; index4 < 5; index4++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 5) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index5 = 0; index5 < 6; index5++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 700 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 6) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index6 = 0; index6 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index6++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 800 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 7) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index7 = 0; index7 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index7++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 900 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 8) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index8 = 0; index8 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index8++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 1000 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 9) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 1;
				_vars.markSyncDirty();
			}
			for (int index9 = 0; index9 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index9++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 1100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 10) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index10 = 0; index10 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index10++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 1200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 11) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index11 = 0; index11 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index11++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 1300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 12) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index12 = 0; index12 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index12++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 1400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 13) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index13 = 0; index13 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index13++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 1500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 14) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 2;
				_vars.markSyncDirty();
			}
			for (int index14 = 0; index14 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index14++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 1600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 15) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index15 = 0; index15 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index15++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 1700 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 16) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index16 = 0; index16 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index16++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 1800 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 17) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index17 = 0; index17 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index17++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 1900 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 18) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index18 = 0; index18 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index18++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 2000 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 19) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 2;
				_vars.markSyncDirty();
			}
			for (int index19 = 0; index19 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index19++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 2100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index20 = 0; index20 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index20++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 2200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 21) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index21 = 0; index21 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index21++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 2300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 22) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index22 = 0; index22 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index22++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 2400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 23) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index23 = 0; index23 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index23++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 2500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 24) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 3;
				_vars.markSyncDirty();
			}
			for (int index24 = 0; index24 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index24++) {
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
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 2600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 25) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index25 = 0; index25 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index25++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 2700 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 26) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index26 = 0; index26 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index26++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 2800 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 27) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index27 = 0; index27 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index27++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 2900 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 28) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index28 = 0; index28 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index28++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3000 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 29) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 3;
				_vars.markSyncDirty();
			}
			for (int index29 = 0; index29 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index29++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 30) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index30 = 0; index30 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index30++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 31) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index31 = 0; index31 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index31++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 32) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index32 = 0; index32 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index32++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 33) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index33 = 0; index33 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index33++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 34) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 4;
				_vars.markSyncDirty();
			}
			for (int index34 = 0; index34 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index34++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index35 = 0; index35 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index35++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index36 = 0; index36 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index36++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3700 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 36) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index37 = 0; index37 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index37++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3800 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 37) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index38 = 0; index38 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index38++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 3900 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 38) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index39 = 0; index39 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index39++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 4000 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 39) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 4;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index40 = 0; index40 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index40++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 4100 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index41 = 0; index41 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index41++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 4200 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 41) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index42 = 0; index42 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index42++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 4300 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 42) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index43 = 0; index43 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index43++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 4400 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 43) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index44 = 0; index44 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index44++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 4500 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 44) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 5;
				_vars.markSyncDirty();
			}
			for (int index45 = 0; index45 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index45++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 4600 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 45) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index46 = 0; index46 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index46++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 4700 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 46) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index47 = 0; index47 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index47++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 4800 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 47) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index48 = 0; index48 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index48++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 4900 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 48) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			for (int index49 = 0; index49 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index49++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_paysan >= 5000 && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan == 49) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.lvl_paysan = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan + 1;
				_vars.xp_paysan = 0;
				_vars.markSyncDirty();
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggpaysan");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgpaysanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.skills_points = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).skills_points + 5;
				_vars.markSyncDirty();
			}
			for (int index50 = 0; index50 < (int) entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_paysan; index50++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.CAPITAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.SUGILITE_AXE.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.SUGILITE_HOE.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CapitalModeModItems.SUGILITE_SHOVEL.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}