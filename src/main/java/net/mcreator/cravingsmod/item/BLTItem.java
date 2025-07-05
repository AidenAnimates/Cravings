package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BLTItem extends Item {
	public BLTItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(14).saturationModifier(0.7f).build()));
	}
}