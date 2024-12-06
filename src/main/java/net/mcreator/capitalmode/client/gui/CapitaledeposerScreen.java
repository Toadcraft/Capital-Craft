package net.mcreator.capitalmode.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.capitalmode.world.inventory.CapitaledeposerMenu;
import net.mcreator.capitalmode.network.CapitaledeposerButtonMessage;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CapitaledeposerScreen extends AbstractContainerScreen<CapitaledeposerMenu> {
	private final static HashMap<String, Object> guistate = CapitaledeposerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1eu;
	Button button_10eu;
	Button button_100eu;
	Button button_1000eu;

	public CapitaledeposerScreen(CapitaledeposerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 500;
		this.imageHeight = 500;
	}

	private static final ResourceLocation texture = new ResourceLocation("capital_mode:textures/screens/capitaledeposer.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.capitaledeposer.label_le_spawn_est_actuellement_niveau"), 42, 138, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.capitaledeposer.label_il_y_a_varargent_spawneu_dans"), 42, 156, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.capitaledeposer.label_vous_avez_varargenteu"), 42, 174, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.capitaledeposer.label_vous_voulez_deposer"), 195, 210, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_1eu = Button.builder(Component.translatable("gui.capital_mode.capitaledeposer.button_1eu"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new CapitaledeposerButtonMessage(0, x, y, z));
				CapitaledeposerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 150, this.topPos + 246, 50, 20).build();
		guistate.put("button:button_1eu", button_1eu);
		this.addRenderableWidget(button_1eu);
		button_10eu = Button.builder(Component.translatable("gui.capital_mode.capitaledeposer.button_10eu"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new CapitaledeposerButtonMessage(1, x, y, z));
				CapitaledeposerButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 150, this.topPos + 300, 50, 20).build();
		guistate.put("button:button_10eu", button_10eu);
		this.addRenderableWidget(button_10eu);
		button_100eu = Button.builder(Component.translatable("gui.capital_mode.capitaledeposer.button_100eu"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new CapitaledeposerButtonMessage(2, x, y, z));
				CapitaledeposerButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 294, this.topPos + 246, 51, 20).build();
		guistate.put("button:button_100eu", button_100eu);
		this.addRenderableWidget(button_100eu);
		button_1000eu = Button.builder(Component.translatable("gui.capital_mode.capitaledeposer.button_1000eu"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new CapitaledeposerButtonMessage(3, x, y, z));
				CapitaledeposerButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 294, this.topPos + 300, 56, 20).build();
		guistate.put("button:button_1000eu", button_1000eu);
		this.addRenderableWidget(button_1000eu);
	}
}
