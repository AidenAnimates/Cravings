
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
import net.minecraft.world.item.BlockItem;

import net.mcreator.cravingsmod.item.inventory.FlourSackInventoryCapability;
import net.mcreator.cravingsmod.item.RicottaItem;
import net.mcreator.cravingsmod.item.OliveItem;
import net.mcreator.cravingsmod.item.FriedCurdsItem;
import net.mcreator.cravingsmod.item.FlourSackItem;
import net.mcreator.cravingsmod.item.FlourItem;
import net.mcreator.cravingsmod.item.FabricItem;
import net.mcreator.cravingsmod.item.DippedCurdsItem;
import net.mcreator.cravingsmod.item.CheeseSliceItem;
import net.mcreator.cravingsmod.item.CheeseItem;
import net.mcreator.cravingsmod.item.CheeseCurdsItem;
import net.mcreator.cravingsmod.item.BucketOfWheyItem;
import net.mcreator.cravingsmod.item.BucketOfOliveOilItem;
import net.mcreator.cravingsmod.item.BucketOfCurdyMilkItem;
import net.mcreator.cravingsmod.CravingsModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CravingsModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CravingsModMod.MODID);
	public static final DeferredItem<Item> BUCKET_OF_CURDY_MILK = REGISTRY.register("bucket_of_curdy_milk", BucketOfCurdyMilkItem::new);
	public static final DeferredItem<Item> BUCKET_OF_WHEY = REGISTRY.register("bucket_of_whey", BucketOfWheyItem::new);
	public static final DeferredItem<Item> CHEESE_CURDS = REGISTRY.register("cheese_curds", CheeseCurdsItem::new);
	public static final DeferredItem<Item> CHEESE_WHEEL = block(CravingsModModBlocks.CHEESE_WHEEL);
	public static final DeferredItem<Item> CHEESE = REGISTRY.register("cheese", CheeseItem::new);
	public static final DeferredItem<Item> FLOUR = REGISTRY.register("flour", FlourItem::new);
	public static final DeferredItem<Item> RICOTTA = REGISTRY.register("ricotta", RicottaItem::new);
	public static final DeferredItem<Item> CHEESE_SLICE = REGISTRY.register("cheese_slice", CheeseSliceItem::new);
	public static final DeferredItem<Item> FABRIC = REGISTRY.register("fabric", FabricItem::new);
	public static final DeferredItem<Item> FLOUR_SACK = REGISTRY.register("flour_sack", FlourSackItem::new);
	public static final DeferredItem<Item> DIPPED_CURDS = REGISTRY.register("dipped_curds", DippedCurdsItem::new);
	public static final DeferredItem<Item> FRIED_CURDS = REGISTRY.register("fried_curds", FriedCurdsItem::new);
	public static final DeferredItem<Item> OLIVE = REGISTRY.register("olive", OliveItem::new);
	public static final DeferredItem<Item> BUCKET_OF_OLIVE_OIL = REGISTRY.register("bucket_of_olive_oil", BucketOfOliveOilItem::new);
	public static final DeferredItem<Item> FRYER = block(CravingsModModBlocks.FRYER);
	public static final DeferredItem<Item> OLIVE_LEAVES = block(CravingsModModBlocks.OLIVE_LEAVES);
	public static final DeferredItem<Item> OLIVE_SAPLING = block(CravingsModModBlocks.OLIVE_SAPLING);

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new FlourSackInventoryCapability(stack), FLOUR_SACK.get());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
