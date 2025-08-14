/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.cravingsmod.block.TomatoCropBlock;
import net.mcreator.cravingsmod.block.RadishCropBlock;
import net.mcreator.cravingsmod.block.PricklyCropBlock;
import net.mcreator.cravingsmod.block.PitayaCropBlock;
import net.mcreator.cravingsmod.block.OliveSaplingBlock;
import net.mcreator.cravingsmod.block.OliveLeavesBlock;
import net.mcreator.cravingsmod.block.LettuceCropBlock;
import net.mcreator.cravingsmod.block.LemonSaplingBlock;
import net.mcreator.cravingsmod.block.LemonLeavesBlock;
import net.mcreator.cravingsmod.block.JalapenoCropBlock;
import net.mcreator.cravingsmod.block.GreenPepperCropBlock;
import net.mcreator.cravingsmod.block.GreenBeanCropBlock;
import net.mcreator.cravingsmod.block.GrapeCropBlock;
import net.mcreator.cravingsmod.block.FryerBlock;
import net.mcreator.cravingsmod.block.CheeseWheelBlock;
import net.mcreator.cravingsmod.CravingsModMod;

import java.util.function.Function;

public class CravingsModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CravingsModMod.MODID);
	public static final DeferredBlock<Block> CHEESE_WHEEL = register("cheese_wheel", CheeseWheelBlock::new);
	public static final DeferredBlock<Block> FRYER = register("fryer", FryerBlock::new);
	public static final DeferredBlock<Block> OLIVE_LEAVES = register("olive_leaves", OliveLeavesBlock::new);
	public static final DeferredBlock<Block> OLIVE_SAPLING = register("olive_sapling", OliveSaplingBlock::new);
	public static final DeferredBlock<Block> LEMON_LEAVES = register("lemon_leaves", LemonLeavesBlock::new);
	public static final DeferredBlock<Block> LEMON_SAPLING = register("lemon_sapling", LemonSaplingBlock::new);
	public static final DeferredBlock<Block> GRAPE_CROP = register("grape_crop", GrapeCropBlock::new);
	public static final DeferredBlock<Block> LETTUCE_CROP = register("lettuce_crop", LettuceCropBlock::new);
	public static final DeferredBlock<Block> TOMATO_CROP = register("tomato_crop", TomatoCropBlock::new);
	public static final DeferredBlock<Block> PITAYA_CROP = register("pitaya_crop", PitayaCropBlock::new);
	public static final DeferredBlock<Block> RADISH_CROP = register("radish_crop", RadishCropBlock::new);
	public static final DeferredBlock<Block> GREEN_BEAN_CROP = register("green_bean_crop", GreenBeanCropBlock::new);
	public static final DeferredBlock<Block> PRICKLY_CROP = register("prickly_crop", PricklyCropBlock::new);
	public static final DeferredBlock<Block> JALAPENO_CROP = register("jalapeno_crop", JalapenoCropBlock::new);
	public static final DeferredBlock<Block> GREEN_PEPPER_CROP = register("green_pepper_crop", GreenPepperCropBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}