package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BaconCheeseburgerItem extends Item {
	public BaconCheeseburgerItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(20).saturationModifier(20f).build()));
	}
}