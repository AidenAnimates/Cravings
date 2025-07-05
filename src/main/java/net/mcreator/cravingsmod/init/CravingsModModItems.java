/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cravingsmod.item.inventory.FlourSackInventoryCapability;
import net.mcreator.cravingsmod.item.YeastItem;
import net.mcreator.cravingsmod.item.WortBottleItem;
import net.mcreator.cravingsmod.item.WineBottleItem;
import net.mcreator.cravingsmod.item.VodkaItem;
import net.mcreator.cravingsmod.item.ToolHandleItem;
import net.mcreator.cravingsmod.item.TomatoItem;
import net.mcreator.cravingsmod.item.ToastItem;
import net.mcreator.cravingsmod.item.RicottaItem;
import net.mcreator.cravingsmod.item.RawBaconItem;
import net.mcreator.cravingsmod.item.RadishSeedsItem;
import net.mcreator.cravingsmod.item.RadishItem;
import net.mcreator.cravingsmod.item.PotatoMashItem;
import net.mcreator.cravingsmod.item.PitayaItem;
import net.mcreator.cravingsmod.item.OliveItem;
import net.mcreator.cravingsmod.item.MustItem;
import net.mcreator.cravingsmod.item.MeadBottleItem;
import net.mcreator.cravingsmod.item.LettuceSeedsItem;
import net.mcreator.cravingsmod.item.LettuceItem;
import net.mcreator.cravingsmod.item.LemonItem;
import net.mcreator.cravingsmod.item.KnifeItem;
import net.mcreator.cravingsmod.item.IceCreamItem;
import net.mcreator.cravingsmod.item.HeavyCreamItem;
import net.mcreator.cravingsmod.item.HamburgerItem;
import net.mcreator.cravingsmod.item.GrilledCheeseItem;
import net.mcreator.cravingsmod.item.GrapesItem;
import net.mcreator.cravingsmod.item.GrapeSeedsItem;
import net.mcreator.cravingsmod.item.GrapeJuiceItem;
import net.mcreator.cravingsmod.item.FriedCurdsItem;
import net.mcreator.cravingsmod.item.FlourSackItem;
import net.mcreator.cravingsmod.item.FlourItem;
import net.mcreator.cravingsmod.item.FermentedPotatoMashItem;
import net.mcreator.cravingsmod.item.FabricItem;
import net.mcreator.cravingsmod.item.DoughItem;
import net.mcreator.cravingsmod.item.DippedCurdsItem;
import net.mcreator.cravingsmod.item.CutBunsItem;
import net.mcreator.cravingsmod.item.CheeseburgerItem;
import net.mcreator.cravingsmod.item.CheeseSliceItem;
import net.mcreator.cravingsmod.item.CheeseSandwichItem;
import net.mcreator.cravingsmod.item.CheeseItem;
import net.mcreator.cravingsmod.item.CheeseCurdsItem;
import net.mcreator.cravingsmod.item.BurgerBunsItem;
import net.mcreator.cravingsmod.item.BucketOfWheyItem;
import net.mcreator.cravingsmod.item.BucketOfOliveOilItem;
import net.mcreator.cravingsmod.item.BucketOfCurdyMilkItem;
import net.mcreator.cravingsmod.item.BreadSliceItem;
import net.mcreator.cravingsmod.item.BeerBottleItem;
import net.mcreator.cravingsmod.item.BaconItem;
import net.mcreator.cravingsmod.item.BaconCheeseburgerItem;
import net.mcreator.cravingsmod.item.BLTItem;
import net.mcreator.cravingsmod.CravingsModMod;

import java.util.function.Function;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CravingsModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CravingsModMod.MODID);
	public static final DeferredItem<Item> BUCKET_OF_CURDY_MILK = register("bucket_of_curdy_milk", BucketOfCurdyMilkItem::new);
	public static final DeferredItem<Item> BUCKET_OF_WHEY = register("bucket_of_whey", BucketOfWheyItem::new);
	public static final DeferredItem<Item> CHEESE_CURDS = register("cheese_curds", CheeseCurdsItem::new);
	public static final DeferredItem<Item> CHEESE_WHEEL = block(CravingsModModBlocks.CHEESE_WHEEL);
	public static final DeferredItem<Item> CHEESE = register("cheese", CheeseItem::new);
	public static final DeferredItem<Item> FLOUR = register("flour", FlourItem::new);
	public static final DeferredItem<Item> RICOTTA = register("ricotta", RicottaItem::new);
	public static final DeferredItem<Item> CHEESE_SLICE = register("cheese_slice", CheeseSliceItem::new);
	public static final DeferredItem<Item> FABRIC = register("fabric", FabricItem::new);
	public static final DeferredItem<Item> FLOUR_SACK = register("flour_sack", FlourSackItem::new);
	public static final DeferredItem<Item> DIPPED_CURDS = register("dipped_curds", DippedCurdsItem::new);
	public static final DeferredItem<Item> FRIED_CURDS = register("fried_curds", FriedCurdsItem::new);
	public static final DeferredItem<Item> OLIVE = register("olive", OliveItem::new);
	public static final DeferredItem<Item> BUCKET_OF_OLIVE_OIL = register("bucket_of_olive_oil", BucketOfOliveOilItem::new);
	public static final DeferredItem<Item> FRYER = block(CravingsModModBlocks.FRYER);
	public static final DeferredItem<Item> OLIVE_LEAVES = block(CravingsModModBlocks.OLIVE_LEAVES);
	public static final DeferredItem<Item> OLIVE_SAPLING = block(CravingsModModBlocks.OLIVE_SAPLING);
	public static final DeferredItem<Item> TOOL_HANDLE = register("tool_handle", ToolHandleItem::new);
	public static final DeferredItem<Item> KNIFE = register("knife", KnifeItem::new);
	public static final DeferredItem<Item> DOUGH = register("dough", DoughItem::new);
	public static final DeferredItem<Item> LEMON = register("lemon", LemonItem::new);
	public static final DeferredItem<Item> LEMON_LEAVES = block(CravingsModModBlocks.LEMON_LEAVES);
	public static final DeferredItem<Item> LEMON_SAPLING = block(CravingsModModBlocks.LEMON_SAPLING);
	public static final DeferredItem<Item> GRAPES = register("grapes", GrapesItem::new);
	public static final DeferredItem<Item> WORT_BOTTLE = register("wort_bottle", WortBottleItem::new);
	public static final DeferredItem<Item> BEER_BOTTLE = register("beer_bottle", BeerBottleItem::new);
	public static final DeferredItem<Item> GRAPE_CROP = block(CravingsModModBlocks.GRAPE_CROP);
	public static final DeferredItem<Item> GRAPE_SEEDS = register("grape_seeds", GrapeSeedsItem::new);
	public static final DeferredItem<Item> YEAST = register("yeast", YeastItem::new);
	public static final DeferredItem<Item> GRAPE_JUICE = register("grape_juice", GrapeJuiceItem::new);
	public static final DeferredItem<Item> WINE_BOTTLE = register("wine_bottle", WineBottleItem::new);
	public static final DeferredItem<Item> MUST = register("must", MustItem::new);
	public static final DeferredItem<Item> MEAD_BOTTLE = register("mead_bottle", MeadBottleItem::new);
	public static final DeferredItem<Item> POTATO_MASH = register("potato_mash", PotatoMashItem::new);
	public static final DeferredItem<Item> FERMENTED_POTATO_MASH = register("fermented_potato_mash", FermentedPotatoMashItem::new);
	public static final DeferredItem<Item> VODKA = register("vodka", VodkaItem::new);
	public static final DeferredItem<Item> CHEESE_SANDWICH = register("cheese_sandwich", CheeseSandwichItem::new);
	public static final DeferredItem<Item> GRILLED_CHEESE = register("grilled_cheese", GrilledCheeseItem::new);
	public static final DeferredItem<Item> BREAD_SLICE = register("bread_slice", BreadSliceItem::new);
	public static final DeferredItem<Item> TOAST = register("toast", ToastItem::new);
	public static final DeferredItem<Item> LETTUCE = register("lettuce", LettuceItem::new);
	public static final DeferredItem<Item> LETTUCE_CROP = block(CravingsModModBlocks.LETTUCE_CROP);
	public static final DeferredItem<Item> LETTUCE_SEEDS = register("lettuce_seeds", LettuceSeedsItem::new);
	public static final DeferredItem<Item> RAW_BACON = register("raw_bacon", RawBaconItem::new);
	public static final DeferredItem<Item> BACON = register("bacon", BaconItem::new);
	public static final DeferredItem<Item> BLT = register("blt", BLTItem::new);
	public static final DeferredItem<Item> TOMATO = register("tomato", TomatoItem::new);
	public static final DeferredItem<Item> TOMATO_CROP = doubleBlock(CravingsModModBlocks.TOMATO_CROP);
	public static final DeferredItem<Item> BURGER_BUNS = register("burger_buns", BurgerBunsItem::new);
	public static final DeferredItem<Item> CUT_BUNS = register("cut_buns", CutBunsItem::new);
	public static final DeferredItem<Item> HAMBURGER = register("hamburger", HamburgerItem::new);
	public static final DeferredItem<Item> CHEESEBURGER = register("cheeseburger", CheeseburgerItem::new);
	public static final DeferredItem<Item> BACON_CHEESEBURGER = register("bacon_cheeseburger", BaconCheeseburgerItem::new);
	public static final DeferredItem<Item> HEAVY_CREAM = register("heavy_cream", HeavyCreamItem::new);
	public static final DeferredItem<Item> ICE_CREAM = register("ice_cream", IceCreamItem::new);
	public static final DeferredItem<Item> PITAYA_CROP = doubleBlock(CravingsModModBlocks.PITAYA_CROP);
	public static final DeferredItem<Item> PITAYA = register("pitaya", PitayaItem::new);
	public static final DeferredItem<Item> RADISH = register("radish", RadishItem::new);
	public static final DeferredItem<Item> RADISH_SEEDS = register("radish_seeds", RadishSeedsItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new DoubleHighBlockItem(block.get(), prop), properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new FlourSackInventoryCapability(stack), FLOUR_SACK.get());
	}
}