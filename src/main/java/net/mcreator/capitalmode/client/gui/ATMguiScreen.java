package net.mcreator.capitalmode.client.gui;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.capitalmode.world.inventory.ATMguiMenu;
import net.mcreator.capitalmode.network.ATMguiButtonMessage;
import net.mcreator.capitalmode.init.CapitalModeModScreens;

public class ATMguiScreen extends AbstractContainerScreen<ATMguiMenu> implements CapitalModeModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_retirer;
	private Button button_deposer;

	public ATMguiScreen(ATMguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("capital_mode:textures/screens/at_mgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	}

	@Override
	public void init() {
		super.init();
		button_retirer = Button.builder(Component.translatable("gui.capital_mode.at_mgui.button_retirer"), e -> {
			int x = ATMguiScreen.this.x;
			int y = ATMguiScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new ATMguiButtonMessage(0, x, y, z));
				ATMguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 70, 61, 20).build();
		this.addRenderableWidget(button_retirer);
		button_deposer = Button.builder(Component.translatable("gui.capital_mode.at_mgui.button_deposer"), e -> {
			int x = ATMguiScreen.this.x;
			int y = ATMguiScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new ATMguiButtonMessage(1, x, y, z));
				ATMguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 106, 61, 20).build();
		this.addRenderableWidget(button_deposer);
	}
}