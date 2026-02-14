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
	public static final RegistryObject<Item> A_BLOCK_WHITE;
	public static final RegistryObject<Item> B_BLOCK_WHITE;
	static {
		A_BLOCK_WHITE = block(LettersAndNumbersModBlocks.A_BLOCK_WHITE);
		B_BLOCK_WHITE = block(LettersAndNumbersModBlocks.B_BLOCK_WHITE);
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