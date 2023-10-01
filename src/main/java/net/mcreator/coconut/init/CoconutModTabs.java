
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coconut.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.coconut.CoconutMod;

public class CoconutModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoconutMod.MODID);
	public static final RegistryObject<CreativeModeTab> COCONUTMOD = REGISTRY.register("coconutmod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.coconut.coconutmod")).icon(() -> new ItemStack(Blocks.AIR)).displayItems((parameters, tabData) -> {
				tabData.accept(CoconutModItems.COCONUT.get());
			})

					.build());
}
