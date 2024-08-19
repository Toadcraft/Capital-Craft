package net.mcreator.capitalmode.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.capitalmode.world.inventory.ATMdeposeMenu;
import net.mcreator.capitalmode.network.ATMdeposeButtonMessage;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ATMdeposeScreen extends AbstractContainerScreen<ATMdeposeMenu> {
	private final static HashMap<String, Object> guistate = ATMdeposeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1eu;
	Button button_10eu;
	Button button_100eu;
	Button button_1000eu;
	Button button_retour;

	public ATMdeposeScreen(ATMdeposeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("capital_mode:textures/screens/at_mdepose.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.at_mdepose.label_vous_voulez_deposer"), 6, 43, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_1eu = Button.builder(Component.translatable("gui.capital_mode.at_mdepose.button_1eu"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new ATMdeposeButtonMessage(0, x, y, z));
				ATMdeposeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 70, 35, 20).build();
		guistate.put("button:button_1eu", button_1eu);
		this.addRenderableWidget(button_1eu);
		button_10eu = Button.builder(Component.translatable("gui.capital_mode.at_mdepose.button_10eu"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new ATMdeposeButtonMessage(1, x, y, z));
				ATMdeposeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 70, 40, 20).build();
		guistate.put("button:button_10eu", button_10eu);
		this.addRenderableWidget(button_10eu);
		button_100eu = Button.builder(Component.translatable("gui.capital_mode.at_mdepose.button_100eu"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new ATMdeposeButtonMessage(2, x, y, z));
				ATMdeposeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 106, 46, 20).build();
		guistate.put("button:button_100eu", button_100eu);
		this.addRenderableWidget(button_100eu);
		button_1000eu = Button.builder(Component.translatable("gui.capital_mode.at_mdepose.button_1000eu"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new ATMdeposeButtonMessage(3, x, y, z));
				ATMdeposeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 114, this.topPos + 106, 51, 20).build();
		guistate.put("button:button_1000eu", button_1000eu);
		this.addRenderableWidget(button_1000eu);
		button_retour = Button.builder(Component.translatable("gui.capital_mode.at_mdepose.button_retour"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new ATMdeposeButtonMessage(4, x, y, z));
				ATMdeposeButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 133, 56, 20).build();
		guistate.put("button:button_retour", button_retour);
		this.addRenderableWidget(button_retour);
	}
}
