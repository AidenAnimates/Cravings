package net.mcreator.cravingsmod.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;

import net.mcreator.cravingsmod.init.CravingsModModBlockEntities;

public class PitayaCropBlockEntity extends BlockEntity {
	public PitayaCropBlockEntity(BlockPos pos, BlockState state) {
		super(CravingsModModBlockEntities.PITAYA_CROP.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag(HolderLookup.Provider lookupProvider) {
		return this.saveWithFullMetadata(lookupProvider);
	}
}
