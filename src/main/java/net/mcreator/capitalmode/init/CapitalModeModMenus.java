/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.capitalmode.world.inventory.*;
import net.mcreator.capitalmode.network.MenuStateUpdateMessage;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.Map;

public class CapitalModeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, CapitalModeMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<CapmachineMenu>> CAPMACHINE = REGISTRY.register("capmachine", () -> IMenuTypeExtension.create(CapmachineMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Fonderiegui2Menu>> FONDERIEGUI_2 = REGISTRY.register("fonderiegui_2", () -> IMenuTypeExtension.create(Fonderiegui2Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ReliquesacGUIMenu>> RELIQUESAC_GUI = REGISTRY.register("reliquesac_gui", () -> IMenuTypeExtension.create(ReliquesacGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GUImineurMenu>> GU_IMINEUR = REGISTRY.register("gu_imineur", () -> IMenuTypeExtension.create(GUImineurMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<JobsMenu>> JOBS_GUI = REGISTRY.register("jobs_gui", () -> IMenuTypeExtension.create(JobsMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GuipaysanMenu>> GUIPAYSAN = REGISTRY.register("guipaysan", () -> IMenuTypeExtension.create(GuipaysanMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GgmineurMenu>> GGMINEUR = REGISTRY.register("ggmineur", () -> IMenuTypeExtension.create(GgmineurMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GgpaysanMenu>> GGPAYSAN = REGISTRY.register("ggpaysan", () -> IMenuTypeExtension.create(GgpaysanMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GGguerierMenu>> G_GGUERIER = REGISTRY.register("g_gguerier", () -> IMenuTypeExtension.create(GGguerierMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GUIguerrierMenu>> GU_IGUERRIER = REGISTRY.register("gu_iguerrier", () -> IMenuTypeExtension.create(GUIguerrierMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CompetensesMenu>> COMPETENSES = REGISTRY.register("competenses", () -> IMenuTypeExtension.create(CompetensesMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ElecfurnaceMenu>> ELECFURNACE = REGISTRY.register("elecfurnace", () -> IMenuTypeExtension.create(ElecfurnaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DimentionalteleporteurMenu>> DIMENTIONALTELEPORTEUR = REGISTRY.register("dimentionalteleporteur", () -> IMenuTypeExtension.create(DimentionalteleporteurMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<PaneausolaireMenu>> PANEAUSOLAIRE = REGISTRY.register("paneausolaire", () -> IMenuTypeExtension.create(PaneausolaireMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DynamoguiMenu>> DYNAMOGUI = REGISTRY.register("dynamogui", () -> IMenuTypeExtension.create(DynamoguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<MineralyserguiMenu>> MINERALYSERGUI = REGISTRY.register("mineralysergui", () -> IMenuTypeExtension.create(MineralyserguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BatterieguiMenu>> BATTERIEGUI = REGISTRY.register("batteriegui", () -> IMenuTypeExtension.create(BatterieguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RankguiMenu>> RANKGUI = REGISTRY.register("rankgui", () -> IMenuTypeExtension.create(RankguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CableguiMenu>> CABLEGUI = REGISTRY.register("cablegui", () -> IMenuTypeExtension.create(CableguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ATMretireMenu>> AT_MRETIRE = REGISTRY.register("at_mretire", () -> IMenuTypeExtension.create(ATMretireMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ATMguiMenu>> AT_MGUI = REGISTRY.register("at_mgui", () -> IMenuTypeExtension.create(ATMguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ATMdeposeMenu>> AT_MDEPOSE = REGISTRY.register("at_mdepose", () -> IMenuTypeExtension.create(ATMdeposeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WarpsMenu>> WARPS = REGISTRY.register("warps", () -> IMenuTypeExtension.create(WarpsMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CapitaleguiMenu>> CAPITALEGUI = REGISTRY.register("capitalegui", () -> IMenuTypeExtension.create(CapitaleguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CapitalewhatMenu>> CAPITALEWHAT = REGISTRY.register("capitalewhat", () -> IMenuTypeExtension.create(CapitalewhatMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CapitaledeposerMenu>> CAPITALEDEPOSER = REGISTRY.register("capitaledeposer", () -> IMenuTypeExtension.create(CapitaledeposerMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DuramachineGUIMenu>> DURAMACHINE_GUI = REGISTRY.register("duramachine_gui", () -> IMenuTypeExtension.create(DuramachineGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof CapitalModeModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ClientPacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}