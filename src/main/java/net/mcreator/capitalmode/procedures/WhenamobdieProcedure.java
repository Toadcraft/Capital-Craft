package net.mcreator.capitalmode.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.Entity;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class WhenamobdieProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Zombie && sourceentity instanceof Player) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 10;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Skeleton && sourceentity instanceof Player) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 15;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Creeper && sourceentity instanceof Player) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 20;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Phantom && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 5) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 30;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Blaze && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 25) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 35;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof ElderGuardian && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 300;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof EnderDragon && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 300;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Endermite && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 30) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 10;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Evoker && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 25;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Ghast && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 25) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 40;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Guardian && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 30) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 25;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Husk && sourceentity instanceof Player) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 20;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof MagmaCube && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 25) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 20;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof PiglinBrute && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 1) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 20;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Pillager && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 30;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Piglin && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 25) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 25;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Ravager && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_mineur >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 60;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Shulker && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 35) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 30;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Silverfish && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 10) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 5;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Slime && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 10) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 20;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Vindicator && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 40;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Witch && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 20;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof WitherBoss && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 40) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 300;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof WitherSkeleton && sourceentity instanceof Player) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 20;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof ZombifiedPiglin && sourceentity instanceof Player && entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).lvl_guerrier >= 20) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + 15;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof ZombieVillager && sourceentity instanceof Player) {
			{
				CapitalModeModVariables.PlayerVariables _vars = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES);
				_vars.xp_guerrier = entity.getData(CapitalModeModVariables.PLAYER_VARIABLES).xp_guerrier + -20;
				_vars.markSyncDirty();
			}
		}
	}
}