
package net.mcreator.cravingsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FabricItem extends Item {
	public FabricItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
