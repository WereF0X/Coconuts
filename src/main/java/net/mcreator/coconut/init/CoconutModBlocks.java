
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coconut.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.coconut.block.CoconutblockBlock;
import net.mcreator.coconut.CoconutMod;

public class CoconutModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CoconutMod.MODID);
	public static final RegistryObject<Block> COCONUTBLOCK = REGISTRY.register("coconutblock", () -> new CoconutblockBlock());
}
