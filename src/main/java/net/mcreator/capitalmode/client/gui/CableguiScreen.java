package net.mcreator.capitalmode.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.capitalmode.world.inventory.CableguiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CableguiScreen extends AbstractContainerScreen<CableguiMenu> {
	private final static HashMap<String, Object> guistate = CableguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Quantite_energie_cable_sortie;
	Button button_transferer_de_lenergie;

	public CableguiScreen(CableguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 146;
	}

	private static final ResourceLocation texture = new ResourceLocation("capital_mode:textures/screens/cablegui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		Quantite_energie_cable_sortie.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (Quantite_energie_cable_sortie.isFocused())
			return Quantite_energie_cable_sortie.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Quantite_energie_cable_sortie.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String Quantite_energie_cable_sortieValue = Quantite_energie_cable_sortie.getValue();
		super.resize(minecraft, width, height);
		Quantite_energie_cable_sortie.setValue(Quantite_energie_cable_sortieValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.cablegui.label_cable"), 72, 14, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.capital_mode.cablegui.label_energy_fe"), 112, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		Quantite_energie_cable_sortie = new EditBox(this.font, this.leftPos + 26, this.topPos + 38, 118, 18, Component.translatable("gui.capital_mode.cablegui.Quantite_energie_cable_sortie")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.capital_mode.cablegui.Quantite_energie_cable_sortie").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.capital_mode.cablegui.Quantite_energie_cable_sortie").getString());
				else
					setSuggestion(null);
			}
		};
		Quantite_energie_cable_sortie.setSuggestion(Component.translatable("gui.capital_mode.cablegui.Quantite_energie_cable_sortie").getString());
		Quantite_energie_cable_sortie.setMaxLength(32767);
		guistate.put("text:Quantite_energie_cable_sortie", Quantite_energie_cable_sortie);
		this.addWidget(this.Quantite_energie_cable_sortie);
		button_transferer_de_lenergie = Button.builder(Component.translatable("gui.capital_mode.cablegui.button_transferer_de_lenergie"), e -> {
		}).bounds(this.leftPos + 14, this.topPos + 90, 145, 20).build();
		guistate.put("button:button_transferer_de_lenergie", button_transferer_de_lenergie);
		this.addRenderableWidget(button_transferer_de_lenergie);
	}
}
