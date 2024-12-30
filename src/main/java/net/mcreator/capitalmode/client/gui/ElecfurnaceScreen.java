package net.mcreator.capitalmode.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.capitalmode.world.inventory.ElecfurnaceMenu;
import net.mcreator.capitalmode.procedures.EnergieGUIProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ElecfurnaceScreen extends AbstractContainerScreen<ElecfurnaceMenu> {
	private final static HashMap<String, Object> guistate = ElecfurnaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ElecfurnaceScreen(ElecfurnaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("capital_mode:textures/screens/elecfurnace.png");

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

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_0_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_1_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_2_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_3_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_4_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_5_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_6_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_7_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_8_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_9_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/fe_10_10.png"), this.leftPos + 24, this.topPos + 25, 0, 0, -1, -1, -1, -1);

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
		guiGraphics.drawString(this.font,

				EnergieGUIProcedure.execute(world, x, y, z), 6, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
