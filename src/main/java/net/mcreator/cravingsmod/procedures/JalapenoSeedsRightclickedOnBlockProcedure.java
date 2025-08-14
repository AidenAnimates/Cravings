package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.cravingsmod.init.CravingsModModBlocks;

public class JalapenoSeedsRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FARMLAND) {
			world.setBlock(BlockPos.containing(x, y + 1, z), CravingsModModBlocks.JALAPENO_CROP.get().defaultBlockState(), 3);
			itemstack.setCount(itemstack.getCount() - 1);
		}
	}
}