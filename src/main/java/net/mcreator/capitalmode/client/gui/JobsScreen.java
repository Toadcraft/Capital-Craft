package net.mcreator.capitalmode.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.capitalmode.world.inventory.JobsMenu;
import net.mcreator.capitalmode.network.JobsButtonMessage;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class JobsScreen extends AbstractContainerScreen<JobsMenu> {
	private final static HashMap<String, Object> guistate = JobsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_mineur;
	Button button_paysan;
	Button button_guerrier;

	public JobsScreen(JobsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 230;
		this.imageHeight = 130;
	}

	private static final ResourceLocation texture = new ResourceLocation("capital_mode:textures/screens/jobs_gui.png");

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

		guiGraphics.blit(new ResourceLocation("capital_mode:textures/screens/jobs_texture.png"), this.leftPos + -3, this.topPos + -1, 0, 0, 230, 130, 230, 130);

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
	}

	@Override
	public void init() {
		super.init();
		button_mineur = Button.builder(Component.translatable("gui.capital_mode.jobs_gui.button_mineur"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new JobsButtonMessage(0, x, y, z));
				JobsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 92, 56, 20).build();
		guistate.put("button:button_mineur", button_mineur);
		this.addRenderableWidget(button_mineur);
		button_paysan = Button.builder(Component.translatable("gui.capital_mode.jobs_gui.button_paysan"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new JobsButtonMessage(1, x, y, z));
				JobsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 85, this.topPos + 92, 56, 20).build();
		guistate.put("button:button_paysan", button_paysan);
		this.addRenderableWidget(button_paysan);
		button_guerrier = Button.builder(Component.translatable("gui.capital_mode.jobs_gui.button_guerrier"), e -> {
			if (true) {
				CapitalModeMod.PACKET_HANDLER.sendToServer(new JobsButtonMessage(2, x, y, z));
				JobsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 157, this.topPos + 92, 67, 20).build();
		guistate.put("button:button_guerrier", button_guerrier);
		this.addRenderableWidget(button_guerrier);
	}
}
