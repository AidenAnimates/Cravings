
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.cravingsmod.CravingsModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CravingsModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CravingsModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CRAVINGS = REGISTRY.register("cravings",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cravings_mod.cravings")).icon(() -> new ItemStack(CravingsModModItems.CHEESE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CravingsModModItems.BUCKET_OF_CURDY_MILK.get());
				tabData.accept(CravingsModModItems.BUCKET_OF_WHEY.get());
				tabData.accept(CravingsModModItems.CHEESE_CURDS.get());
				tabData.accept(CravingsModModBlocks.CHEESE_WHEEL.get().asItem());
				tabData.accept(CravingsModModItems.CHEESE.get());
				tabData.accept(CravingsModModItems.FLOUR.get());
				tabData.accept(CravingsModModItems.RICOTTA.get());
				tabData.accept(CravingsModModItems.CHEESE_SLICE.get());
				tabData.accept(CravingsModModItems.FABRIC.get());
				tabData.accept(CravingsModModItems.FLOUR_SACK.get());
				tabData.accept(CravingsModModItems.DIPPED_CURDS.get());
				tabData.accept(CravingsModModItems.FRIED_CURDS.get());
				tabData.accept(CravingsModModItems.OLIVE.get());
				tabData.accept(CravingsModModItems.BUCKET_OF_OLIVE_OIL.get());
				tabData.accept(CravingsModModBlocks.FRYER.get().asItem());
				tabData.accept(CravingsModModBlocks.OLIVE_LEAVES.get().asItem());
				tabData.accept(CravingsModModBlocks.OLIVE_SAPLING.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(CravingsModModItems.BUCKET_OF_CURDY_MILK.get());
			tabData.accept(CravingsModModItems.BUCKET_OF_WHEY.get());
			tabData.accept(CravingsModModItems.FLOUR.get());
			tabData.accept(CravingsModModItems.FABRIC.get());
			tabData.accept(CravingsModModItems.BUCKET_OF_OLIVE_OIL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(CravingsModModItems.CHEESE_CURDS.get());
			tabData.accept(CravingsModModBlocks.CHEESE_WHEEL.get().asItem());
			tabData.accept(CravingsModModItems.CHEESE.get());
			tabData.accept(CravingsModModItems.RICOTTA.get());
			tabData.accept(CravingsModModItems.CHEESE_SLICE.get());
			tabData.accept(CravingsModModItems.DIPPED_CURDS.get());
			tabData.accept(CravingsModModItems.FRIED_CURDS.get());
			tabData.accept(CravingsModModItems.OLIVE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CravingsModModItems.FLOUR_SACK.get());
			tabData.accept(CravingsModModItems.BUCKET_OF_OLIVE_OIL.get());
			tabData.accept(CravingsModModBlocks.FRYER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(CravingsModModBlocks.FRYER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(CravingsModModBlocks.OLIVE_LEAVES.get().asItem());
			tabData.accept(CravingsModModBlocks.OLIVE_SAPLING.get().asItem());
		}
	}
}
