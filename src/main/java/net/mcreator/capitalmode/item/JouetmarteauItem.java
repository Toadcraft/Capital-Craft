package net.mcreator.capitalmode.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import net.mcreator.capitalmode.procedures.JouetmarteauEvenementAuClicDroitDansLairProcedure;
import net.mcreator.capitalmode.init.CapitalModeModItems;

@EventBusSubscriber
public class JouetmarteauItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 0, 0f, 0, 1, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:jouetmarteau_repair_items")));

	public JouetmarteauItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, -1f, -3.5f));
	}

	@SubscribeEvent
	public static void handleToolDamage(ModifyDefaultComponentsEvent event) {
		event.modify(CapitalModeModItems.JOUETMARTEAU.get(), builder -> builder.remove(DataComponents.MAX_DAMAGE));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		JouetmarteauEvenementAuClicDroitDansLairProcedure.execute(world, entity.getItemInHand(hand));
		return ar;
	}
}