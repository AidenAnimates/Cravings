package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GrapesItem extends Item {
	public GrapesItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.4f).build()));
	}
}