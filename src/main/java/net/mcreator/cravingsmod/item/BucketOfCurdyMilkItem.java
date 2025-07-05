package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cravingsmod.init.CravingsModModItems;

public class BucketOfCurdyMilkItem extends Item {
	public BucketOfCurdyMilkItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(CravingsModModItems.BUCKET_OF_WHEY.get());
	}
}