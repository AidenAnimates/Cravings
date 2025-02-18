
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cravingsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.cravingsmod.world.inventory.SackGUIMenu;
import net.mcreator.cravingsmod.world.inventory.FryerGUIMenu;
import net.mcreator.cravingsmod.CravingsModMod;

public class CravingsModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, CravingsModMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<SackGUIMenu>> SACK_GUI = REGISTRY.register("sack_gui", () -> IMenuTypeExtension.create(SackGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FryerGUIMenu>> FRYER_GUI = REGISTRY.register("fryer_gui", () -> IMenuTypeExtension.create(FryerGUIMenu::new));
}
