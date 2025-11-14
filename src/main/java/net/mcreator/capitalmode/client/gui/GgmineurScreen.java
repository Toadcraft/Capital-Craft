package net.mcreator.capitalmode.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.capitalmode.world.inventory.GgmineurMenu;
import net.mcreator.capitalmode.init.CapitalModeModScreens;

public class GgmineurScreen extends AbstractContainerScreen<GgmineurMenu> implements CapitalModeModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public GgmineurScreen(GgmineurMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 230;
		this.imageHeight = 130;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("capital_mode:textures/screens/ggmineur.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("capital_mode:textures/screens/gg.png"), this.leftPos + -1, this.topPos + 0, 0, 0, 230, 130, 230, 130);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("capital_mode:textures/screens/capital_ingot.png"), this.leftPos + 99, this.topPos + 60, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.ggmineur.label_vous_etes_passez_level_varlvl"), 15, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.ggmineur.label_recompense"), 35, 64, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.ggmineur.label_xvarlvl_mineur"), 114, 65, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}