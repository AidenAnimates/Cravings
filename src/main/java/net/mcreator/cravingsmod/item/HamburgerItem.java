package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HamburgerItem extends Item {
	public HamburgerItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(12).saturationModifier(15f).build()));
	}
}