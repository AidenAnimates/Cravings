
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.cravingsmod.block.OliveSaplingBlock;
import net.mcreator.cravingsmod.block.OliveLeavesBlock;
import net.mcreator.cravingsmod.block.FryerBlock;
import net.mcreator.cravingsmod.block.CheeseWheelBlock;
import net.mcreator.cravingsmod.CravingsModMod;

public class CravingsModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CravingsModMod.MODID);
	public static final DeferredBlock<Block> CHEESE_WHEEL = REGISTRY.register("cheese_wheel", CheeseWheelBlock::new);
	public static final DeferredBlock<Block> FRYER = REGISTRY.register("fryer", FryerBlock::new);
	public static final DeferredBlock<Block> OLIVE_LEAVES = REGISTRY.register("olive_leaves", OliveLeavesBlock::new);
	public static final DeferredBlock<Block> OLIVE_SAPLING = REGISTRY.register("olive_sapling", OliveSaplingBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
