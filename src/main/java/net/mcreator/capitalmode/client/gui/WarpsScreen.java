package net.mcreator.capitalmode.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.capitalmode.world.inventory.WarpsMenu;
import net.mcreator.capitalmode.network.WarpsButtonMessage;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WarpsScreen extends AbstractContainerScreen<WarpsMenu> {
	private final static HashMap<String, Object> guistate = WarpsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_spawn;
	Button button_nether;
	Button button_random_tp;

	public WarpsScreen(WarpsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("capital_mode:textures/screens/warps.png");

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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.warps.label_warps"), 67, 17, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_spawn = Button.builder(Component.translatable("gui.capital_mode.warps.button_spawn"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new WarpsButtonMessage(0, x, y, z));
				WarpsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 57, this.topPos + 49, 51, 20).build();
		guistate.put("button:button_spawn", button_spawn);
		this.addRenderableWidget(button_spawn);
		button_nether = Button.builder(Component.translatable("gui.capital_mode.warps.button_nether"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new WarpsButtonMessage(1, x, y, z));
				WarpsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 55, this.topPos + 85, 56, 20).build();
		guistate.put("button:button_nether", button_nether);
		this.addRenderableWidget(button_nether);
		button_random_tp = Button.builder(Component.translatable("gui.capital_mode.warps.button_random_tp"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new WarpsButtonMessage(2, x, y, z));
				WarpsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 50, this.topPos + 120, 72, 20).build();
		guistate.put("button:button_random_tp", button_random_tp);
		this.addRenderableWidget(button_random_tp);
	}
}
