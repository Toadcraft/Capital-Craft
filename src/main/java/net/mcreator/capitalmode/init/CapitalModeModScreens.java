/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.capitalmode.client.gui.*;

@EventBusSubscriber(Dist.CLIENT)
public class CapitalModeModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CapitalModeModMenus.CAPMACHINE.get(), CapmachineScreen::new);
		event.register(CapitalModeModMenus.FONDERIEGUI_2.get(), Fonderiegui2Screen::new);
		event.register(CapitalModeModMenus.RELIQUESAC_GUI.get(), ReliquesacGUIScreen::new);
		event.register(CapitalModeModMenus.GU_IMINEUR.get(), GUImineurScreen::new);
		event.register(CapitalModeModMenus.JOBS_GUI.get(), JobsScreen::new);
		event.register(CapitalModeModMenus.GUIPAYSAN.get(), GuipaysanScreen::new);
		event.register(CapitalModeModMenus.GGMINEUR.get(), GgmineurScreen::new);
		event.register(CapitalModeModMenus.GGPAYSAN.get(), GgpaysanScreen::new);
		event.register(CapitalModeModMenus.G_GGUERIER.get(), GGguerierScreen::new);
		event.register(CapitalModeModMenus.GU_IGUERRIER.get(), GUIguerrierScreen::new);
		event.register(CapitalModeModMenus.COMPETENSES.get(), CompetensesScreen::new);
		event.register(CapitalModeModMenus.ELECFURNACE.get(), ElecfurnaceScreen::new);
		event.register(CapitalModeModMenus.DIMENTIONALTELEPORTEUR.get(), DimentionalteleporteurScreen::new);
		event.register(CapitalModeModMenus.PANEAUSOLAIRE.get(), PaneausolaireScreen::new);
		event.register(CapitalModeModMenus.DYNAMOGUI.get(), DynamoguiScreen::new);
		event.register(CapitalModeModMenus.MINERALYSERGUI.get(), MineralyserguiScreen::new);
		event.register(CapitalModeModMenus.BATTERIEGUI.get(), BatterieguiScreen::new);
		event.register(CapitalModeModMenus.RANKGUI.get(), RankguiScreen::new);
		event.register(CapitalModeModMenus.CABLEGUI.get(), CableguiScreen::new);
		event.register(CapitalModeModMenus.AT_MRETIRE.get(), ATMretireScreen::new);
		event.register(CapitalModeModMenus.AT_MGUI.get(), ATMguiScreen::new);
		event.register(CapitalModeModMenus.AT_MDEPOSE.get(), ATMdeposeScreen::new);
		event.register(CapitalModeModMenus.WARPS.get(), WarpsScreen::new);
		event.register(CapitalModeModMenus.CAPITALEGUI.get(), CapitaleguiScreen::new);
		event.register(CapitalModeModMenus.CAPITALEWHAT.get(), CapitalewhatScreen::new);
		event.register(CapitalModeModMenus.CAPITALEDEPOSER.get(), CapitaledeposerScreen::new);
		event.register(CapitalModeModMenus.DURAMACHINE_GUI.get(), DuramachineGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}