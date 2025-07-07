package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GreenBeansItem extends Item {
	public GreenBeansItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(3f).build()));
	}
}