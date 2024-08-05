package net.cinchtail.cinchsbetterdeepslate.util;


import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

import java.util.Set;

public class ModBlockSetType {
    private static final Set<BlockSetType> VALUES = new ObjectArraySet<BlockSetType>();
    public static final BlockSetType POLISHED_DEEPSLATE = ModBlockSetType.modRegister(new BlockSetType("polished_deepslate",
            false, BlockSoundGroup.POLISHED_DEEPSLATE, SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN,
            SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));

    private static BlockSetType modRegister(BlockSetType blockSetType) {
        VALUES.add(blockSetType);
        return blockSetType;
    }
}