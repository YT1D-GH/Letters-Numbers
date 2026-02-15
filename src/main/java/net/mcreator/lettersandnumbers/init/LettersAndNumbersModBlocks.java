/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lettersandnumbers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lettersandnumbers.block.*;
import net.mcreator.lettersandnumbers.LettersAndNumbersMod;

public class LettersAndNumbersModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LettersAndNumbersMod.MODID);
	public static final RegistryObject<Block> A_BLOCK;
	public static final RegistryObject<Block> A_BLOCK_GREEN;
	public static final RegistryObject<Block> A_BLOCK_YELLOW;
	public static final RegistryObject<Block> B_BLOCK_GREEN;
	public static final RegistryObject<Block> B_BLOCK_YELLOW;
	public static final RegistryObject<Block> B_BLOCK;
	public static final RegistryObject<Block> C_BLOCK;
	public static final RegistryObject<Block> C_BLOCK_YELLOW;
	public static final RegistryObject<Block> C_BLOCK_GREEN;
	public static final RegistryObject<Block> LETTERSANDNUMBERSCMICO;
	public static final RegistryObject<Block> D_BLOCK;
	public static final RegistryObject<Block> D_BLOCK_YELLOW;
	public static final RegistryObject<Block> D_BLOCK_GREEN;
	static {
		A_BLOCK = REGISTRY.register("a_block", ABlockBlock::new);
		A_BLOCK_GREEN = REGISTRY.register("a_block_green", ABlockGreenBlock::new);
		A_BLOCK_YELLOW = REGISTRY.register("a_block_yellow", ABlockYellowBlock::new);
		B_BLOCK_GREEN = REGISTRY.register("b_block_green", BBlockGreenBlock::new);
		B_BLOCK_YELLOW = REGISTRY.register("b_block_yellow", BBlockYellowBlock::new);
		B_BLOCK = REGISTRY.register("b_block", BBlockBlock::new);
		C_BLOCK = REGISTRY.register("c_block", CBlockBlock::new);
		C_BLOCK_YELLOW = REGISTRY.register("c_block_yellow", CBlockYellowBlock::new);
		C_BLOCK_GREEN = REGISTRY.register("c_block_green", CBlockGreenBlock::new);
		LETTERSANDNUMBERSCMICO = REGISTRY.register("lettersandnumberscmico", LettersandnumberscmicoBlock::new);
		D_BLOCK = REGISTRY.register("d_block", DBlockBlock::new);
		D_BLOCK_YELLOW = REGISTRY.register("d_block_yellow", DBlockYellowBlock::new);
		D_BLOCK_GREEN = REGISTRY.register("d_block_green", DBlockGreenBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}