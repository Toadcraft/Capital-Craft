package net.mcreator.capitalmode.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.capitalmode.network.CapitalModeModVariables;

public class BionicswordToolInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Vous avez une killstreak de " + (entity.getCapability(CapitalModeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CapitalModeModVariables.PlayerVariables())).Kill_streak)), true);
	}
}
