package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CheeseSandwichItem extends Item {
	public CheeseSandwichItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.4f).build()));
	}
}