
package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PotatoMashItem extends Item {
	public PotatoMashItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
