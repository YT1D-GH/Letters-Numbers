/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lettersandnumbers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.lettersandnumbers.LettersAndNumbersMod;

public class LettersAndNumbersModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LettersAndNumbersMod.MODID);
	public static final RegistryObject<CreativeModeTab> LETTERS_AND_NUMBERS = REGISTRY.register("letters_and_numbers",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.letters_and_numbers.letters_and_numbers")).icon(() -> new ItemStack(LettersAndNumbersModBlocks.LETTERSANDNUMBERSCMICO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LettersAndNumbersModBlocks.A_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.A_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.A_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.B_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.B_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.B_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.C_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.C_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.C_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.D_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.D_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.D_BLOCK_GREEN.get().asItem());
			}).build());
}