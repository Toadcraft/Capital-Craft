
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.capitalmode.client.gui.WarpsScreen;
import net.mcreator.capitalmode.client.gui.ReliquesacGUIScreen;
import net.mcreator.capitalmode.client.gui.RankguiScreen;
import net.mcreator.capitalmode.client.gui.PaneausolaireScreen;
import net.mcreator.capitalmode.client.gui.MineralyserguiScreen;
import net.mcreator.capitalmode.client.gui.JobsScreen;
import net.mcreator.capitalmode.client.gui.GuipaysanScreen;
import net.mcreator.capitalmode.client.gui.GgpaysanScreen;
import net.mcreator.capitalmode.client.gui.GgmineurScreen;
import net.mcreator.capitalmode.client.gui.GUImineurScreen;
import net.mcreator.capitalmode.client.gui.GUIguerrierScreen;
import net.mcreator.capitalmode.client.gui.GGguerierScreen;
import net.mcreator.capitalmode.client.gui.Fonderiegui2Screen;
import net.mcreator.capitalmode.client.gui.ElecfurnaceScreen;
import net.mcreator.capitalmode.client.gui.DynamoguiScreen;
import net.mcreator.capitalmode.client.gui.DuramachineGUIScreen;
import net.mcreator.capitalmode.client.gui.DimentionalteleporteurScreen;
import net.mcreator.capitalmode.client.gui.CompetensesScreen;
import net.mcreator.capitalmode.client.gui.CapmachineScreen;
import net.mcreator.capitalmode.client.gui.CapitalewhatScreen;
import net.mcreator.capitalmode.client.gui.CapitaleguiScreen;
import net.mcreator.capitalmode.client.gui.CapitaledeposerScreen;
import net.mcreator.capitalmode.client.gui.CableguiScreen;
import net.mcreator.capitalmode.client.gui.BatterieguiScreen;
import net.mcreator.capitalmode.client.gui.ATMretireScreen;
import net.mcreator.capitalmode.client.gui.ATMguiScreen;
import net.mcreator.capitalmode.client.gui.ATMdeposeScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CapitalModeModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CapitalModeModMenus.CAPMACHINE.get(), CapmachineScreen::new);
			MenuScreens.register(CapitalModeModMenus.FONDERIEGUI_2.get(), Fonderiegui2Screen::new);
			MenuScreens.register(CapitalModeModMenus.RELIQUESAC_GUI.get(), ReliquesacGUIScreen::new);
			MenuScreens.register(CapitalModeModMenus.GU_IMINEUR.get(), GUImineurScreen::new);
			MenuScreens.register(CapitalModeModMenus.JOBS_GUI.get(), JobsScreen::new);
			MenuScreens.register(CapitalModeModMenus.GUIPAYSAN.get(), GuipaysanScreen::new);
			MenuScreens.register(CapitalModeModMenus.GGMINEUR.get(), GgmineurScreen::new);
			MenuScreens.register(CapitalModeModMenus.GGPAYSAN.get(), GgpaysanScreen::new);
			MenuScreens.register(CapitalModeModMenus.G_GGUERIER.get(), GGguerierScreen::new);
			MenuScreens.register(CapitalModeModMenus.GU_IGUERRIER.get(), GUIguerrierScreen::new);
			MenuScreens.register(CapitalModeModMenus.COMPETENSES.get(), CompetensesScreen::new);
			MenuScreens.register(CapitalModeModMenus.ELECFURNACE.get(), ElecfurnaceScreen::new);
			MenuScreens.register(CapitalModeModMenus.DIMENTIONALTELEPORTEUR.get(), DimentionalteleporteurScreen::new);
			MenuScreens.register(CapitalModeModMenus.PANEAUSOLAIRE.get(), PaneausolaireScreen::new);
			MenuScreens.register(CapitalModeModMenus.DYNAMOGUI.get(), DynamoguiScreen::new);
			MenuScreens.register(CapitalModeModMenus.MINERALYSERGUI.get(), MineralyserguiScreen::new);
			MenuScreens.register(CapitalModeModMenus.BATTERIEGUI.get(), BatterieguiScreen::new);
			MenuScreens.register(CapitalModeModMenus.RANKGUI.get(), RankguiScreen::new);
			MenuScreens.register(CapitalModeModMenus.CABLEGUI.get(), CableguiScreen::new);
			MenuScreens.register(CapitalModeModMenus.AT_MRETIRE.get(), ATMretireScreen::new);
			MenuScreens.register(CapitalModeModMenus.AT_MGUI.get(), ATMguiScreen::new);
			MenuScreens.register(CapitalModeModMenus.AT_MDEPOSE.get(), ATMdeposeScreen::new);
			MenuScreens.register(CapitalModeModMenus.WARPS.get(), WarpsScreen::new);
			MenuScreens.register(CapitalModeModMenus.CAPITALEGUI.get(), CapitaleguiScreen::new);
			MenuScreens.register(CapitalModeModMenus.CAPITALEWHAT.get(), CapitalewhatScreen::new);
			MenuScreens.register(CapitalModeModMenus.CAPITALEDEPOSER.get(), CapitaledeposerScreen::new);
			MenuScreens.register(CapitalModeModMenus.DURAMACHINE_GUI.get(), DuramachineGUIScreen::new);
		});
	}
}
