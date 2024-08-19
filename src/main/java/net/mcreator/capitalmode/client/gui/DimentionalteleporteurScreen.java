package net.mcreator.capitalmode.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.capitalmode.world.inventory.DimentionalteleporteurMenu;
import net.mcreator.capitalmode.network.DimentionalteleporteurButtonMessage;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DimentionalteleporteurScreen extends AbstractContainerScreen<DimentionalteleporteurMenu> {
	private final static HashMap<String, Object> guistate = DimentionalteleporteurMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_overworld;
	Button button_nether;
	Button button_end;
	Button button_demon_world;

	public DimentionalteleporteurScreen(DimentionalteleporteurMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("capital_mode:textures/screens/dimentionalteleporteur.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_overworld = Button.builder(Component.translatable("gui.capital_mode.dimentionalteleporteur.button_overworld"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new DimentionalteleporteurButtonMessage(0, x, y, z));
				DimentionalteleporteurButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 25, 72, 20).build();
		guistate.put("button:button_overworld", button_overworld);
		this.addRenderableWidget(button_overworld);
		button_nether = Button.builder(Component.translatable("gui.capital_mode.dimentionalteleporteur.button_nether"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new DimentionalteleporteurButtonMessage(1, x, y, z));
				DimentionalteleporteurButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 50, 56, 20).build();
		guistate.put("button:button_nether", button_nether);
		this.addRenderableWidget(button_nether);
		button_end = Button.builder(Component.translatable("gui.capital_mode.dimentionalteleporteur.button_end"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new DimentionalteleporteurButtonMessage(2, x, y, z));
				DimentionalteleporteurButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 73, 40, 20).build();
		guistate.put("button:button_end", button_end);
		this.addRenderableWidget(button_end);
		button_demon_world = Button.builder(Component.translatable("gui.capital_mode.dimentionalteleporteur.button_demon_world"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new DimentionalteleporteurButtonMessage(3, x, y, z));
				DimentionalteleporteurButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 48, this.topPos + 97, 82, 20).build();
		guistate.put("button:button_demon_world", button_demon_world);
		this.addRenderableWidget(button_demon_world);
	}
}
