package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GrapeJuiceItem extends Item {
	public GrapeJuiceItem(Item.Properties properties) {
		super(properties.stacksTo(1).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.5f).alwaysEdible().build(), Consumables.defaultDrink().consumeSeconds(2.5F).build()).usingConvertsTo(Items.GLASS_BOTTLE));
	}
}