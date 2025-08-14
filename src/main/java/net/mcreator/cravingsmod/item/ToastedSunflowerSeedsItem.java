package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ToastedSunflowerSeedsItem extends Item {
	public ToastedSunflowerSeedsItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.2f).alwaysEdible().build()));
	}
}