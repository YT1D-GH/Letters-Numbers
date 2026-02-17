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
				tabData.accept(LettersAndNumbersModBlocks.B_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.B_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.B_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.C_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.C_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.C_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.D_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.D_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.D_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.E_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.E_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.E_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.F_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.FBLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.F_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.G_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.G_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.G_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.H_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.H_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.H_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.I_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.I_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.I_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.J_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.J_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.J_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.K_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.K_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.K_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.L_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.L_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.L_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.M_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.M_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.M_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.N_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.N_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.N_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.O_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.O_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.O_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.P_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.P_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.P_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.Q_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.Q_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.Q_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.R_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.R_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.R_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.S_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.S_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.S_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.T_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.T_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.T_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.U_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.U_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.U_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.V_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.V_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.V_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.W_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.W_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.W_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.X_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.X_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.X_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.Y_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.Y_BLOCK_YELLOW.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.Y_BLOCK.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.Z_BLOCK_GREEN.get().asItem());
				tabData.accept(LettersAndNumbersModBlocks.Z_BLOCK_YELLOW.get().asItem());
			}).build());
}