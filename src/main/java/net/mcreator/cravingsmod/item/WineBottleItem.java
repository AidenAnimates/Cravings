package net.mcreator.cravingsmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.cravingsmod.procedures.BeerBottlePlayerFinishesUsingItemProcedure;

public class WineBottleItem extends Item {
	public WineBottleItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.5f).alwaysEdible().build(), Consumables.defaultDrink().consumeSeconds(2.5F).build())
				.usingConvertsTo(Items.GLASS_BOTTLE));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		BeerBottlePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}