
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.cravingsmod.block.entity.TomatoCropBlockEntity;
import net.mcreator.cravingsmod.block.entity.RadishCropBlockEntity;
import net.mcreator.cravingsmod.block.entity.PitayaCropBlockEntity;
import net.mcreator.cravingsmod.block.entity.LettuceCropBlockEntity;
import net.mcreator.cravingsmod.block.entity.GrapeCropBlockEntity;
import net.mcreator.cravingsmod.block.entity.FryerBlockEntity;
import net.mcreator.cravingsmod.CravingsModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CravingsModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, CravingsModMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FRYER = register("fryer", CravingsModModBlocks.FRYER, FryerBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GRAPE_CROP = register("grape_crop", CravingsModModBlocks.GRAPE_CROP, GrapeCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> LETTUCE_CROP = register("lettuce_crop", CravingsModModBlocks.LETTUCE_CROP, LettuceCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> TOMATO_CROP = register("tomato_crop", CravingsModModBlocks.TOMATO_CROP, TomatoCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PITAYA_CROP = register("pitaya_crop", CravingsModModBlocks.PITAYA_CROP, PitayaCropBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> RADISH_CROP = register("radish_crop", CravingsModModBlocks.RADISH_CROP, RadishCropBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FRYER.get(), (blockEntity, side) -> ((FryerBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRAPE_CROP.get(), (blockEntity, side) -> ((GrapeCropBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LETTUCE_CROP.get(), (blockEntity, side) -> ((LettuceCropBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RADISH_CROP.get(), (blockEntity, side) -> ((RadishCropBlockEntity) blockEntity).getItemHandler());
	}
}
