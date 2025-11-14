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

import net.mcreator.capitalmode.world.inventory.CapitaleguiMenu;
import net.mcreator.capitalmode.network.CapitaleguiButtonMessage;
import net.mcreator.capitalmode.init.CapitalModeModScreens;

public class CapitaleguiScreen extends AbstractContainerScreen<CapitaleguiMenu> implements CapitalModeModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_deposer;
	private Button button_empty;

	public CapitaleguiScreen(CapitaleguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 500;
		this.imageHeight = 500;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("capital_mode:textures/screens/capitalegui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.capitalegui.label_le_spawn_est_actuellement_niveau"), 141, 147, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.capitalegui.label_il_y_a_varargent_spawneu_dans"), 159, 165, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.capitalegui.label_vous_avez_varargenteu"), 204, 183, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_deposer = Button.builder(Component.translatable("gui.capital_mode.capitalegui.button_deposer"), e -> {
			int x = CapitaleguiScreen.this.x;
			int y = CapitaleguiScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new CapitaleguiButtonMessage(0, x, y, z));
				CapitaleguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 231, this.topPos + 255, 61, 20).build();
		this.addRenderableWidget(button_deposer);
		button_empty = Button.builder(Component.translatable("gui.capital_mode.capitalegui.button_empty"), e -> {
			int x = CapitaleguiScreen.this.x;
			int y = CapitaleguiScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new CapitaleguiButtonMessage(1, x, y, z));
				CapitaleguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 429, this.topPos + 138, 30, 20).build();
		this.addRenderableWidget(button_empty);
	}
}