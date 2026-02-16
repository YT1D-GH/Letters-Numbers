package net.mcreator.lettersandnumbers.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.lettersandnumbers.init.LettersAndNumbersModBlocks;

import java.util.Comparator;

public class MBlockOnBlockRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((findEntityInWorldRange(world, Player.class, x, y, z, 4)) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LIME_DYE) {
			world.setBlock(BlockPos.containing(x, y, z), LettersAndNumbersModBlocks.M_BLOCK_GREEN.get().defaultBlockState(), 3);
			if ((findEntityInWorldRange(world, Player.class, x, y, z, 4)) instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.LIME_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (((findEntityInWorldRange(world, Player.class, x, y, z, 4)) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.YELLOW_DYE) {
			world.setBlock(BlockPos.containing(x, y, z), LettersAndNumbersModBlocks.M_BLOCK_YELLOW.get().defaultBlockState(), 3);
			if ((findEntityInWorldRange(world, Player.class, x, y, z, 4)) instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.YELLOW_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"tell @p Invalid dye in main hand, Please use lime or yellow dye");
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}