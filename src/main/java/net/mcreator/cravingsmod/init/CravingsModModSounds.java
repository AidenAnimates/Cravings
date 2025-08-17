/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.cravingsmod.CravingsModMod;

public class CravingsModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CravingsModMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> BELLOW = REGISTRY.register("bellow", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cravings_mod", "bellow")));
}