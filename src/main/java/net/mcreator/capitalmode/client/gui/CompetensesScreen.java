package net.mcreator.capitalmode.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.capitalmode.world.inventory.CompetensesMenu;
import net.mcreator.capitalmode.procedures.VariableskillsProcedure;
import net.mcreator.capitalmode.network.CompetensesButtonMessage;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CompetensesScreen extends AbstractContainerScreen<CompetensesMenu> {
	private final static HashMap<String, Object> guistate = CompetensesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_page_2;

	public CompetensesScreen(CompetensesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 375;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("capital_mode:textures/screens/competenses.png");

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

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/qerzft.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 375, 200, 375, 200);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.competenses.label_page_1"), 331, 6, -12829636, false);
		guiGraphics.drawString(this.font,

				VariableskillsProcedure.execute(entity), 7, 6, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_page_2 = Button.builder(Component.translatable("gui.capital_mode.competenses.button_page_2"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new CompetensesButtonMessage(0, x, y, z));
				CompetensesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 313, this.topPos + 168, 56, 20).build();
		guistate.put("button:button_page_2", button_page_2);
		this.addRenderableWidget(button_page_2);
	}
}
