/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class CravingsModModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(CravingsModModItems.RICOTTA.get()), new ItemStack(CravingsModModItems.FLOUR_SACK.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(CravingsModModBlocks.PITAYA_CROP.get()), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CravingsModModItems.GRAPE_SEEDS.get(), 4), new ItemStack(Items.EMERALD, 2), new ItemStack(CravingsModModItems.LEMON.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Blocks.SUGAR_CANE), new ItemStack(CravingsModModItems.CHEESE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(CravingsModModItems.CHEESE_CURDS.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(CravingsModModItems.GRAPE_SEEDS.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(CravingsModModItems.RAW_BACON.get()), new ItemStack(CravingsModModBlocks.TOMATO_CROP.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(CravingsModModItems.LETTUCE_SEEDS.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(CravingsModModItems.TOMATO.get(), 2), new ItemStack(CravingsModModItems.RADISH_SEEDS.get()), 10, 5, 0.05f));
		}
	}
}