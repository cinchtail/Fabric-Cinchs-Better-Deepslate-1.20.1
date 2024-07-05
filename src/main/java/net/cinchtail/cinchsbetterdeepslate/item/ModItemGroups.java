package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CINCHSBETTERDEEPSLATE_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CinchsBetterDeepslate.MOD_ID, "betterdeepslate"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.betterdeepslate"))
                    .icon(() -> new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICKS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
                        entries.add(ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);
                        entries.add(ModBlocks.MOSSY_DEEPSLATE_BRICKS);
                        entries.add(ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
                        entries.add(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
                        entries.add(ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
                        entries.add(ModBlocks.MOSSY_DEEPSLATE_TILES);
                        entries.add(ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
                        entries.add(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
                        entries.add(ModBlocks.MOSSY_DEEPSLATE_TILE_WALL);
                        entries.add(ModBlocks.DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.DEEPSLATE_SLAB);
                        entries.add(ModBlocks.DEEPSLATE_WALL);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
                        entries.add(ModItems.DEEPSLATE_SWORD);
                        entries.add(ModItems.DEEPSLATE_PICKAXE);
                        entries.add(ModItems.DEEPSLATE_AXE);
                        entries.add(ModItems.DEEPSLATE_SHOVEL);
                        entries.add(ModItems.DEEPSLATE_HOE);
                        entries.add(ModItems.BLACKSTONE_SWORD);
                        entries.add(ModItems.BLACKSTONE_PICKAXE);
                        entries.add(ModItems.BLACKSTONE_AXE);
                        entries.add(ModItems.BLACKSTONE_SHOVEL);
                        entries.add(ModItems.BLACKSTONE_HOE);
                    }).build());


    public static void registerItemGroups() {
        CinchsBetterDeepslate.LOGGER.info("Registering Item Groups for " + CinchsBetterDeepslate.MOD_ID);
    }
}
