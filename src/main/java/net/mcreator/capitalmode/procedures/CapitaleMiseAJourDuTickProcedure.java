package net.mcreator.capitalmode.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class CapitaleMiseAJourDuTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (CapitalModeModVariables.MapVariables.get(world).lvl_spawn == 0) {
			CapitalModeModVariables.MapVariables.get(world).lvl_spawn = 1;
			CapitalModeModVariables.MapVariables.get(world).syncData(world);
		}
		if (CapitalModeModVariables.MapVariables.get(world).argent_spawn >= 10000) {
			CapitalModeModVariables.MapVariables.get(world).lvl_spawn = CapitalModeModVariables.MapVariables.get(world).lvl_spawn + 1;
			CapitalModeModVariables.MapVariables.get(world).syncData(world);
			CapitalModeModVariables.MapVariables.get(world).argent_spawn = 0;
			CapitalModeModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
				entityToSpawn.setVisualOnly(true);
				_level.addFreshEntity(entityToSpawn);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("LE NIVEAU DE SPAWN A AUGMENTE !"), false);
		}
	}
}
