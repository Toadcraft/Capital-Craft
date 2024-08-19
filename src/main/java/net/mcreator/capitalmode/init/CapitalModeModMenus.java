
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.capitalmode.world.inventory.WarpsMenu;
import net.mcreator.capitalmode.world.inventory.ReliquesacGUIMenu;
import net.mcreator.capitalmode.world.inventory.RankguiMenu;
import net.mcreator.capitalmode.world.inventory.PaneausolaireMenu;
import net.mcreator.capitalmode.world.inventory.MineralyserguiMenu;
import net.mcreator.capitalmode.world.inventory.JobsMenu;
import net.mcreator.capitalmode.world.inventory.GuipaysanMenu;
import net.mcreator.capitalmode.world.inventory.GgpaysanMenu;
import net.mcreator.capitalmode.world.inventory.GgmineurMenu;
import net.mcreator.capitalmode.world.inventory.GUImineurMenu;
import net.mcreator.capitalmode.world.inventory.GUIguerrierMenu;
import net.mcreator.capitalmode.world.inventory.GGguerierMenu;
import net.mcreator.capitalmode.world.inventory.Fonderiegui2Menu;
import net.mcreator.capitalmode.world.inventory.ElecfurnaceMenu;
import net.mcreator.capitalmode.world.inventory.DynamoguiMenu;
import net.mcreator.capitalmode.world.inventory.DuramachineGUIMenu;
import net.mcreator.capitalmode.world.inventory.DimentionalteleporteurMenu;
import net.mcreator.capitalmode.world.inventory.CompetensesMenu;
import net.mcreator.capitalmode.world.inventory.CapmachineMenu;
import net.mcreator.capitalmode.world.inventory.CapitalewhatMenu;
import net.mcreator.capitalmode.world.inventory.CapitaleguiMenu;
import net.mcreator.capitalmode.world.inventory.CapitaledeposerMenu;
import net.mcreator.capitalmode.world.inventory.CableguiMenu;
import net.mcreator.capitalmode.world.inventory.BatterieguiMenu;
import net.mcreator.capitalmode.world.inventory.ATMretireMenu;
import net.mcreator.capitalmode.world.inventory.ATMguiMenu;
import net.mcreator.capitalmode.world.inventory.ATMdeposeMenu;
import net.mcreator.capitalmode.CapitalModeMod;

public class CapitalModeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CapitalModeMod.MODID);
	public static final RegistryObject<MenuType<CapmachineMenu>> CAPMACHINE = REGISTRY.register("capmachine", () -> IForgeMenuType.create(CapmachineMenu::new));
	public static final RegistryObject<MenuType<Fonderiegui2Menu>> FONDERIEGUI_2 = REGISTRY.register("fonderiegui_2", () -> IForgeMenuType.create(Fonderiegui2Menu::new));
	public static final RegistryObject<MenuType<ReliquesacGUIMenu>> RELIQUESAC_GUI = REGISTRY.register("reliquesac_gui", () -> IForgeMenuType.create(ReliquesacGUIMenu::new));
	public static final RegistryObject<MenuType<GUImineurMenu>> GU_IMINEUR = REGISTRY.register("gu_imineur", () -> IForgeMenuType.create(GUImineurMenu::new));
	public static final RegistryObject<MenuType<JobsMenu>> JOBS_GUI = REGISTRY.register("jobs_gui", () -> IForgeMenuType.create(JobsMenu::new));
	public static final RegistryObject<MenuType<GuipaysanMenu>> GUIPAYSAN = REGISTRY.register("guipaysan", () -> IForgeMenuType.create(GuipaysanMenu::new));
	public static final RegistryObject<MenuType<GgmineurMenu>> GGMINEUR = REGISTRY.register("ggmineur", () -> IForgeMenuType.create(GgmineurMenu::new));
	public static final RegistryObject<MenuType<GgpaysanMenu>> GGPAYSAN = REGISTRY.register("ggpaysan", () -> IForgeMenuType.create(GgpaysanMenu::new));
	public static final RegistryObject<MenuType<GGguerierMenu>> G_GGUERIER = REGISTRY.register("g_gguerier", () -> IForgeMenuType.create(GGguerierMenu::new));
	public static final RegistryObject<MenuType<GUIguerrierMenu>> GU_IGUERRIER = REGISTRY.register("gu_iguerrier", () -> IForgeMenuType.create(GUIguerrierMenu::new));
	public static final RegistryObject<MenuType<CompetensesMenu>> COMPETENSES = REGISTRY.register("competenses", () -> IForgeMenuType.create(CompetensesMenu::new));
	public static final RegistryObject<MenuType<ElecfurnaceMenu>> ELECFURNACE = REGISTRY.register("elecfurnace", () -> IForgeMenuType.create(ElecfurnaceMenu::new));
	public static final RegistryObject<MenuType<DimentionalteleporteurMenu>> DIMENTIONALTELEPORTEUR = REGISTRY.register("dimentionalteleporteur", () -> IForgeMenuType.create(DimentionalteleporteurMenu::new));
	public static final RegistryObject<MenuType<PaneausolaireMenu>> PANEAUSOLAIRE = REGISTRY.register("paneausolaire", () -> IForgeMenuType.create(PaneausolaireMenu::new));
	public static final RegistryObject<MenuType<DynamoguiMenu>> DYNAMOGUI = REGISTRY.register("dynamogui", () -> IForgeMenuType.create(DynamoguiMenu::new));
	public static final RegistryObject<MenuType<MineralyserguiMenu>> MINERALYSERGUI = REGISTRY.register("mineralysergui", () -> IForgeMenuType.create(MineralyserguiMenu::new));
	public static final RegistryObject<MenuType<BatterieguiMenu>> BATTERIEGUI = REGISTRY.register("batteriegui", () -> IForgeMenuType.create(BatterieguiMenu::new));
	public static final RegistryObject<MenuType<RankguiMenu>> RANKGUI = REGISTRY.register("rankgui", () -> IForgeMenuType.create(RankguiMenu::new));
	public static final RegistryObject<MenuType<CableguiMenu>> CABLEGUI = REGISTRY.register("cablegui", () -> IForgeMenuType.create(CableguiMenu::new));
	public static final RegistryObject<MenuType<ATMretireMenu>> AT_MRETIRE = REGISTRY.register("at_mretire", () -> IForgeMenuType.create(ATMretireMenu::new));
	public static final RegistryObject<MenuType<ATMguiMenu>> AT_MGUI = REGISTRY.register("at_mgui", () -> IForgeMenuType.create(ATMguiMenu::new));
	public static final RegistryObject<MenuType<ATMdeposeMenu>> AT_MDEPOSE = REGISTRY.register("at_mdepose", () -> IForgeMenuType.create(ATMdeposeMenu::new));
	public static final RegistryObject<MenuType<WarpsMenu>> WARPS = REGISTRY.register("warps", () -> IForgeMenuType.create(WarpsMenu::new));
	public static final RegistryObject<MenuType<CapitaleguiMenu>> CAPITALEGUI = REGISTRY.register("capitalegui", () -> IForgeMenuType.create(CapitaleguiMenu::new));
	public static final RegistryObject<MenuType<CapitalewhatMenu>> CAPITALEWHAT = REGISTRY.register("capitalewhat", () -> IForgeMenuType.create(CapitalewhatMenu::new));
	public static final RegistryObject<MenuType<CapitaledeposerMenu>> CAPITALEDEPOSER = REGISTRY.register("capitaledeposer", () -> IForgeMenuType.create(CapitaledeposerMenu::new));
	public static final RegistryObject<MenuType<DuramachineGUIMenu>> DURAMACHINE_GUI = REGISTRY.register("duramachine_gui", () -> IForgeMenuType.create(DuramachineGUIMenu::new));
}
