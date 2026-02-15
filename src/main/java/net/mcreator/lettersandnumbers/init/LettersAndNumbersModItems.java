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
	public static final RegistryObject<Item> E_BLOCK_YELLOW;
	public static final RegistryObject<Item> E_BLOCK_GREEN;
	public static final RegistryObject<Item> E_BLOCK;
	public static final RegistryObject<Item> FBLOCK_GREEN;
	public static final RegistryObject<Item> F_BLOCK_YELLOW;
	public static final RegistryObject<Item> F_BLOCK;
	public static final RegistryObject<Item> G_BLOCK_YELLOW;
	public static final RegistryObject<Item> G_BLOCK_GREEN;
	public static final RegistryObject<Item> G_BLOCK;
	public static final RegistryObject<Item> H_BLOCK_YELLOW;
	public static final RegistryObject<Item> H_BLOCK_GREEN;
	public static final RegistryObject<Item> H_BLOCK;
	public static final RegistryObject<Item> I_BLOCK_YELLOW;
	public static final RegistryObject<Item> I_BLOCK_GREEN;
	public static final RegistryObject<Item> I_BLOCK;
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
		E_BLOCK_YELLOW = block(LettersAndNumbersModBlocks.E_BLOCK_YELLOW);
		E_BLOCK_GREEN = block(LettersAndNumbersModBlocks.E_BLOCK_GREEN);
		E_BLOCK = block(LettersAndNumbersModBlocks.E_BLOCK);
		FBLOCK_GREEN = block(LettersAndNumbersModBlocks.FBLOCK_GREEN);
		F_BLOCK_YELLOW = block(LettersAndNumbersModBlocks.F_BLOCK_YELLOW);
		F_BLOCK = block(LettersAndNumbersModBlocks.F_BLOCK);
		G_BLOCK_YELLOW = block(LettersAndNumbersModBlocks.G_BLOCK_YELLOW);
		G_BLOCK_GREEN = block(LettersAndNumbersModBlocks.G_BLOCK_GREEN);
		G_BLOCK = block(LettersAndNumbersModBlocks.G_BLOCK);
		H_BLOCK_YELLOW = block(LettersAndNumbersModBlocks.H_BLOCK_YELLOW);
		H_BLOCK_GREEN = block(LettersAndNumbersModBlocks.H_BLOCK_GREEN);
		H_BLOCK = block(LettersAndNumbersModBlocks.H_BLOCK);
		I_BLOCK_YELLOW = block(LettersAndNumbersModBlocks.I_BLOCK_YELLOW);
		I_BLOCK_GREEN = block(LettersAndNumbersModBlocks.I_BLOCK_GREEN);
		I_BLOCK = block(LettersAndNumbersModBlocks.I_BLOCK);
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