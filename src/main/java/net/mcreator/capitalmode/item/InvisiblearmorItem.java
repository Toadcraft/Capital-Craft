package net.mcreator.capitalmode.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import java.util.function.Consumer;
import java.util.Map;

public abstract class InvisiblearmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(100, Map.of(ArmorType.BOOTS, 6, ArmorType.LEGGINGS, 12, ArmorType.CHESTPLATE, 18, ArmorType.HELMET, 6, ArmorType.BODY, 18), 45,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("block.amethyst_block.break")), 4f, 0.15f, TagKey.create(Registries.ITEM, ResourceLocation.parse("capital_mode:invisiblearmor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("capital_mode:invisiblearmor")));

	private InvisiblearmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends InvisiblearmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.capital_mode.invisiblearmor_helmet.description_0"));
		}
	}

	public static class Chestplate extends InvisiblearmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.capital_mode.invisiblearmor_chestplate.description_0"));
		}
	}

	public static class Leggings extends InvisiblearmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.capital_mode.invisiblearmor_leggings.description_0"));
		}
	}

	public static class Boots extends InvisiblearmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.capital_mode.invisiblearmor_boots.description_0"));
		}
	}
}