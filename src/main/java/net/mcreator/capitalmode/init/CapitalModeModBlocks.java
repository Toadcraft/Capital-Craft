/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capitalmode.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.capitalmode.block.*;
import net.mcreator.capitalmode.CapitalModeMod;

import java.util.function.Function;

public class CapitalModeModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CapitalModeMod.MODID);
	public static final DeferredBlock<Block> CAPITAL_ORE;
	public static final DeferredBlock<Block> CABLOCK;
	public static final DeferredBlock<Block> COBLOCK;
	public static final DeferredBlock<Block> CAPITAL_MACHINE;
	public static final DeferredBlock<Block> SUGILITE_BLOCK;
	public static final DeferredBlock<Block> FONDERIE;
	public static final DeferredBlock<Block> CAPITALFONDU;
	public static final DeferredBlock<Block> CONDENSEDSTONE;
	public static final DeferredBlock<Block> ULTRACONDENSED;
	public static final DeferredBlock<Block> COBALTFONDU;
	public static final DeferredBlock<Block> IRIDFONDU;
	public static final DeferredBlock<Block> INVOCATEUR;
	public static final DeferredBlock<Block> DEMONWORLD_PORTAL;
	public static final DeferredBlock<Block> FANDECAPITAL;
	public static final DeferredBlock<Block> CAPITALPLANT;
	public static final DeferredBlock<Block> CAPITALPLANT_2;
	public static final DeferredBlock<Block> CAPITALPLANT_3;
	public static final DeferredBlock<Block> CAPITALPLANT_4;
	public static final DeferredBlock<Block> DOLOMITEORE;
	public static final DeferredBlock<Block> ELECTRICFURNACE;
	public static final DeferredBlock<Block> PANNEAUSOLAIR;
	public static final DeferredBlock<Block> DIMENSIONALMACHINE;
	public static final DeferredBlock<Block> BOXCOMMUNE;
	public static final DeferredBlock<Block> DYNAMO;
	public static final DeferredBlock<Block> MINERALYSER;
	public static final DeferredBlock<Block> BATTERIE;
	public static final DeferredBlock<Block> AUTEL_DEMONIAQUE;
	public static final DeferredBlock<Block> ATM;
	public static final DeferredBlock<Block> COBALTPLANT;
	public static final DeferredBlock<Block> COBALTPLANT_2;
	public static final DeferredBlock<Block> COBALTPLANT_3;
	public static final DeferredBlock<Block> COBALTPLANT_4;
	public static final DeferredBlock<Block> IRIDIUMPLANT;
	public static final DeferredBlock<Block> IRIDIUMPLANT_2;
	public static final DeferredBlock<Block> IRIDIUMPLANT_3;
	public static final DeferredBlock<Block> IRIDIUMPLANT_4;
	public static final DeferredBlock<Block> DOLOMITE_FARMLAND;
	public static final DeferredBlock<Block> QUARRY;
	public static final DeferredBlock<Block> LIMITES;
	public static final DeferredBlock<Block> CAPITALE;
	public static final DeferredBlock<Block> BUEGRASS;
	public static final DeferredBlock<Block> CABLE;
	public static final DeferredBlock<Block> CABLEE;
	public static final DeferredBlock<Block> CABLEI;
	public static final DeferredBlock<Block> CABLEL;
	public static final DeferredBlock<Block> CABLE_LC;
	public static final DeferredBlock<Block> CABLE_LCC;
	public static final DeferredBlock<Block> CABLE_LT;
	public static final DeferredBlock<Block> CABLE_LTC;
	public static final DeferredBlock<Block> CABLE_T;
	public static final DeferredBlock<Block> CABLE_TC;
	public static final DeferredBlock<Block> CABLE_TX;
	public static final DeferredBlock<Block> CABLE_TXC;
	public static final DeferredBlock<Block> CABLE_TXCC;
	public static final DeferredBlock<Block> CABLE_X;
	public static final DeferredBlock<Block> CABLE_XC;
	public static final DeferredBlock<Block> CABLE_F;
	public static final DeferredBlock<Block> CABLE_S;
	public static final DeferredBlock<Block> LUMIERE;
	static {
		CAPITAL_ORE = register("capital_ore", CapitaloreBlock::new);
		CABLOCK = register("cablock", CablockBlock::new);
		COBLOCK = register("coblock", CoblockBlock::new);
		CAPITAL_MACHINE = register("capital_machine", CapitalMachineBlock::new);
		SUGILITE_BLOCK = register("sugilite_block", SugiliteBlockBlock::new);
		FONDERIE = register("fonderie", FonderieBlock::new);
		CAPITALFONDU = register("capitalfondu", CapitalfonduBlock::new);
		CONDENSEDSTONE = register("condensedstone", CondensedstoneBlock::new);
		ULTRACONDENSED = register("ultracondensed", UltracondensedBlock::new);
		COBALTFONDU = register("cobaltfondu", CobaltfonduBlock::new);
		IRIDFONDU = register("iridfondu", IridfonduBlock::new);
		INVOCATEUR = register("invocateur", InvocateurBlock::new);
		DEMONWORLD_PORTAL = register("demonworld_portal", DemonworldPortalBlock::new);
		FANDECAPITAL = register("fandecapital", FandecapitalBlock::new);
		CAPITALPLANT = register("capitalplant", CapitalplantBlock::new);
		CAPITALPLANT_2 = register("capitalplant_2", Capitalplant2Block::new);
		CAPITALPLANT_3 = register("capitalplant_3", Capitalplant3Block::new);
		CAPITALPLANT_4 = register("capitalplant_4", Capitalplant4Block::new);
		DOLOMITEORE = register("dolomiteore", DolomiteoreBlock::new);
		ELECTRICFURNACE = register("electricfurnace", ElectricfurnaceBlock::new);
		PANNEAUSOLAIR = register("panneausolair", PanneausolairBlock::new);
		DIMENSIONALMACHINE = register("dimensionalmachine", DimensionalmachineBlock::new);
		BOXCOMMUNE = register("boxcommune", BoxcommuneBlock::new);
		DYNAMO = register("dynamo", DynamoBlock::new);
		MINERALYSER = register("mineralyser", MineralyserBlock::new);
		BATTERIE = register("batterie", BatterieBlock::new);
		AUTEL_DEMONIAQUE = register("autel_demoniaque", AutelDemoniaqueBlock::new);
		ATM = register("atm", ATMBlock::new);
		COBALTPLANT = register("cobaltplant", CobaltplantBlock::new);
		COBALTPLANT_2 = register("cobaltplant_2", Cobaltplant2Block::new);
		COBALTPLANT_3 = register("cobaltplant_3", Cobaltplant3Block::new);
		COBALTPLANT_4 = register("cobaltplant_4", Cobaltplant4Block::new);
		IRIDIUMPLANT = register("iridiumplant", IridiumplantBlock::new);
		IRIDIUMPLANT_2 = register("iridiumplant_2", Iridiumplant2Block::new);
		IRIDIUMPLANT_3 = register("iridiumplant_3", Iridiumplant3Block::new);
		IRIDIUMPLANT_4 = register("iridiumplant_4", Iridiumplant4Block::new);
		DOLOMITE_FARMLAND = register("dolomite_farmland", DolomiteFarmlandBlock::new);
		QUARRY = register("quarry", QuarryBlock::new);
		LIMITES = register("limites", LimitesBlock::new);
		CAPITALE = register("capitale", CapitaleBlock::new);
		BUEGRASS = register("buegrass", BuegrassBlock::new);
		CABLE = register("cable", CableBlock::new);
		CABLEE = register("cablee", CableeBlock::new);
		CABLEI = register("cablei", CableiBlock::new);
		CABLEL = register("cablel", CablelBlock::new);
		CABLE_LC = register("cable_lc", CableLCBlock::new);
		CABLE_LCC = register("cable_lcc", CableLCCBlock::new);
		CABLE_LT = register("cable_lt", CableLTBlock::new);
		CABLE_LTC = register("cable_ltc", CableLTCBlock::new);
		CABLE_T = register("cable_t", CableTBlock::new);
		CABLE_TC = register("cable_tc", CableTCBlock::new);
		CABLE_TX = register("cable_tx", CableTXBlock::new);
		CABLE_TXC = register("cable_txc", CableTXCBlock::new);
		CABLE_TXCC = register("cable_txcc", CableTXCCBlock::new);
		CABLE_X = register("cable_x", CableXBlock::new);
		CABLE_XC = register("cable_xc", CableXCBlock::new);
		CABLE_F = register("cable_f", CableFBlock::new);
		CABLE_S = register("cable_s", CableSBlock::new);
		LUMIERE = register("lumiere", LumiereBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}