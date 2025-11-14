package net.mcreator.capitalmode.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.capitalmode.world.inventory.CableguiMenu;
import net.mcreator.capitalmode.procedures.EnergieGUIProcedure;
import net.mcreator.capitalmode.init.CapitalModeModScreens;

public class CableguiScreen extends AbstractContainerScreen<CableguiMenu> implements CapitalModeModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private EditBox Quantite_energie_cable_sortie;
	private Button button_transferer_de_lenergie;

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

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("Quantite_energie_cable_sortie"))
				Quantite_energie_cable_sortie.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("capital_mode:textures/screens/cablegui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		Quantite_energie_cable_sortie.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (Quantite_energie_cable_sortie.isFocused())
			return Quantite_energie_cable_sortie.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
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
		guiGraphics.drawString(this.font, EnergieGUIProcedure.execute(world, x, y, z), 6, 6, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		Quantite_energie_cable_sortie = new EditBox(this.font, this.leftPos + 26, this.topPos + 38, 118, 18, Component.translatable("gui.capital_mode.cablegui.Quantite_energie_cable_sortie"));
		Quantite_energie_cable_sortie.setMaxLength(8192);
		Quantite_energie_cable_sortie.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "Quantite_energie_cable_sortie", content, false);
		});
		Quantite_energie_cable_sortie.setHint(Component.translatable("gui.capital_mode.cablegui.Quantite_energie_cable_sortie"));
		this.addWidget(this.Quantite_energie_cable_sortie);
		button_transferer_de_lenergie = Button.builder(Component.translatable("gui.capital_mode.cablegui.button_transferer_de_lenergie"), e -> {
		}).bounds(this.leftPos + 14, this.topPos + 90, 145, 20).build();
		this.addRenderableWidget(button_transferer_de_lenergie);
	}
}