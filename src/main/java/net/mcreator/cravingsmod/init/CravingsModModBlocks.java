
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.cravingsmod.block.TomatoCropBlock;
import net.mcreator.cravingsmod.block.OliveSaplingBlock;
import net.mcreator.cravingsmod.block.OliveLeavesBlock;
import net.mcreator.cravingsmod.block.LettuceCropBlock;
import net.mcreator.cravingsmod.block.LemonSaplingBlock;
import net.mcreator.cravingsmod.block.LemonLeavesBlock;
import net.mcreator.cravingsmod.block.GrapeCropBlock;
import net.mcreator.cravingsmod.block.FryerBlock;
import net.mcreator.cravingsmod.block.CheeseWheelBlock;
import net.mcreator.cravingsmod.CravingsModMod;

public class CravingsModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CravingsModMod.MODID);
	public static final DeferredBlock<Block> CHEESE_WHEEL = REGISTRY.register("cheese_wheel", CheeseWheelBlock::new);
	public static final DeferredBlock<Block> FRYER = REGISTRY.register("fryer", FryerBlock::new);
	public static final DeferredBlock<Block> OLIVE_LEAVES = REGISTRY.register("olive_leaves", OliveLeavesBlock::new);
	public static final DeferredBlock<Block> OLIVE_SAPLING = REGISTRY.register("olive_sapling", OliveSaplingBlock::new);
	public static final DeferredBlock<Block> LEMON_LEAVES = REGISTRY.register("lemon_leaves", LemonLeavesBlock::new);
	public static final DeferredBlock<Block> LEMON_SAPLING = REGISTRY.register("lemon_sapling", LemonSaplingBlock::new);
	public static final DeferredBlock<Block> GRAPE_CROP = REGISTRY.register("grape_crop", GrapeCropBlock::new);
	public static final DeferredBlock<Block> LETTUCE_CROP = REGISTRY.register("lettuce_crop", LettuceCropBlock::new);
	public static final DeferredBlock<Block> TOMATO_CROP = REGISTRY.register("tomato_crop", TomatoCropBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
