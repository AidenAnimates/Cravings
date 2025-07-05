package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BucketOfWheyItem extends Item {
	public BucketOfWheyItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(Items.BUCKET);
	}
}