
package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MustItem extends Item {
	public MustItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
