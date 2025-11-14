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

import net.mcreator.capitalmode.world.inventory.ATMdeposeMenu;
import net.mcreator.capitalmode.network.ATMdeposeButtonMessage;
import net.mcreator.capitalmode.init.CapitalModeModScreens;

public class ATMdeposeScreen extends AbstractContainerScreen<ATMdeposeMenu> implements CapitalModeModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_1eu;
	private Button button_10eu;
	private Button button_100eu;
	private Button button_1000eu;
	private Button button_retour;

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

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("capital_mode:textures/screens/at_mdepose.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.at_mdepose.label_vous_voulez_deposer"), 6, 43, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_1eu = Button.builder(Component.translatable("gui.capital_mode.at_mdepose.button_1eu"), e -> {
			int x = ATMdeposeScreen.this.x;
			int y = ATMdeposeScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new ATMdeposeButtonMessage(0, x, y, z));
				ATMdeposeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 70, 35, 20).build();
		this.addRenderableWidget(button_1eu);
		button_10eu = Button.builder(Component.translatable("gui.capital_mode.at_mdepose.button_10eu"), e -> {
			int x = ATMdeposeScreen.this.x;
			int y = ATMdeposeScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new ATMdeposeButtonMessage(1, x, y, z));
				ATMdeposeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 70, 40, 20).build();
		this.addRenderableWidget(button_10eu);
		button_100eu = Button.builder(Component.translatable("gui.capital_mode.at_mdepose.button_100eu"), e -> {
			int x = ATMdeposeScreen.this.x;
			int y = ATMdeposeScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new ATMdeposeButtonMessage(2, x, y, z));
				ATMdeposeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 106, 46, 20).build();
		this.addRenderableWidget(button_100eu);
		button_1000eu = Button.builder(Component.translatable("gui.capital_mode.at_mdepose.button_1000eu"), e -> {
			int x = ATMdeposeScreen.this.x;
			int y = ATMdeposeScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new ATMdeposeButtonMessage(3, x, y, z));
				ATMdeposeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 114, this.topPos + 106, 51, 20).build();
		this.addRenderableWidget(button_1000eu);
		button_retour = Button.builder(Component.translatable("gui.capital_mode.at_mdepose.button_retour"), e -> {
			int x = ATMdeposeScreen.this.x;
			int y = ATMdeposeScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new ATMdeposeButtonMessage(4, x, y, z));
				ATMdeposeButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 133, 56, 20).build();
		this.addRenderableWidget(button_retour);
	}
}