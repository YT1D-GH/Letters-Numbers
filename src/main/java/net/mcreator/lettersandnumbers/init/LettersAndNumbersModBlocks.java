/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lettersandnumbers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lettersandnumbers.block.BBlockWhiteBlock;
import net.mcreator.lettersandnumbers.block.ABlockWhiteBlock;
import net.mcreator.lettersandnumbers.LettersAndNumbersMod;

public class LettersAndNumbersModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LettersAndNumbersMod.MODID);
	public static final RegistryObject<Block> A_BLOCK_WHITE;
	public static final RegistryObject<Block> B_BLOCK_WHITE;
	static {
		A_BLOCK_WHITE = REGISTRY.register("a_block_white", ABlockWhiteBlock::new);
		B_BLOCK_WHITE = REGISTRY.register("b_block_white", BBlockWhiteBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}