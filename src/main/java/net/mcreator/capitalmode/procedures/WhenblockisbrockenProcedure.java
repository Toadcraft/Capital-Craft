package net.mcreator.capitalmode.procedures;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

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

@Mod.EventBusSubscriber
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
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur == 0) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 1;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COAL_ORE
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur == 5) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 10;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur >= 100
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur == 0) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur + 1;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lvl_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggmineur");
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
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 1) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 1;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COAL_ORE
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 5) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 5;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 20) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 10;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 20) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 10;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAPIS_ORE
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 20) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 10;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIAMOND_ORE
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 30) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 50;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ANCIENT_DEBRIS
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 35) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 200;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CAPITAL_ORE.get()
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur >= 40) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur + 100;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CapitalModeModBlocks.CAPITAL_ORE.get()
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skill_06 == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CapitalModeModItems.CAPITAL.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur >= 200
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur == 1) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur + 1;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lvl_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggmineur");
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
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur >= 300
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur == 2) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur + 1;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lvl_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggmineur");
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
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur >= 400
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur == 3) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur + 1;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lvl_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggmineur");
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
		if ((entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_mineur >= 500
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur == 4) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_mineur + 1;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lvl_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_mineur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ggmineur");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GgmineurMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).skills_points + 1;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.skills_points = _setval;
					capability.syncPlayerVariables(entity);
				});
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
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_paysan >= 0) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_paysan + 5;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_paysan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LOG || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_LOG
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WARPED_STEM || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_STEM)
				&& (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).lvl_paysan >= 10) {
			{
				double _setval = (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).xp_paysan + 10;
				entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp_paysan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
