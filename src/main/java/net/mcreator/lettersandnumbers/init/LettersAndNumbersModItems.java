/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lettersandnumbers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lettersandnumbers.LettersAndNumbersMod;

public class LettersAndNumbersModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LettersAndNumbersMod.MODID);
	public static final RegistryObject<Item> A_BLOCK;
	public static final RegistryObject<Item> A_BLOCK_GREEN;
	public static final RegistryObject<Item> A_BLOCK_YELLOW;
	public static final RegistryObject<Item> B_BLOCK_GREEN;
	public static final RegistryObject<Item> B_BLOCK_YELLOW;
	public static final RegistryObject<Item> B_BLOCK;
	public static final RegistryObject<Item> C_BLOCK;
	public static final RegistryObject<Item> C_BLOCK_YELLOW;
	public static final RegistryObject<Item> C_BLOCK_GREEN;
	public static final RegistryObject<Item> LETTERSANDNUMBERSCMICO;
	public static final RegistryObject<Item> D_BLOCK;
	public static final RegistryObject<Item> D_BLOCK_YELLOW;
	public static final RegistryObject<Item> D_BLOCK_GREEN;
	static {
		A_BLOCK = block(LettersAndNumbersModBlocks.A_BLOCK);
		A_BLOCK_GREEN = block(LettersAndNumbersModBlocks.A_BLOCK_GREEN);
		A_BLOCK_YELLOW = block(LettersAndNumbersModBlocks.A_BLOCK_YELLOW);
		B_BLOCK_GREEN = block(LettersAndNumbersModBlocks.B_BLOCK_GREEN);
		B_BLOCK_YELLOW = block(LettersAndNumbersModBlocks.B_BLOCK_YELLOW);
		B_BLOCK = block(LettersAndNumbersModBlocks.B_BLOCK);
		C_BLOCK = block(LettersAndNumbersModBlocks.C_BLOCK);
		C_BLOCK_YELLOW = block(LettersAndNumbersModBlocks.C_BLOCK_YELLOW);
		C_BLOCK_GREEN = block(LettersAndNumbersModBlocks.C_BLOCK_GREEN);
		LETTERSANDNUMBERSCMICO = block(LettersAndNumbersModBlocks.LETTERSANDNUMBERSCMICO, new Item.Properties().stacksTo(1));
		D_BLOCK = block(LettersAndNumbersModBlocks.D_BLOCK);
		D_BLOCK_YELLOW = block(LettersAndNumbersModBlocks.D_BLOCK_YELLOW);
		D_BLOCK_GREEN = block(LettersAndNumbersModBlocks.D_BLOCK_GREEN);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}