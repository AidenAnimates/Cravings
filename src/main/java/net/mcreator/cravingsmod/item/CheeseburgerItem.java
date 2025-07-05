package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CheeseburgerItem extends Item {
	public CheeseburgerItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(15).saturationModifier(17f).build()));
	}
}