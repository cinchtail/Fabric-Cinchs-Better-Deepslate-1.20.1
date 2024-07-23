package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BLACKSTONE_SWORD = registerItem("blackstone_sword",
            new SwordItem(ModToolMaterial.BLACKSTONE,3, -2.4f,
                    new FabricItemSettings()));
    public static final Item BLACKSTONE_PICKAXE = registerItem("blackstone_pickaxe",
            new PickaxeItem(ModToolMaterial.BLACKSTONE,1, -2.8F,
                    new FabricItemSettings()));
    public static final Item BLACKSTONE_AXE = registerItem("blackstone_axe",
            new AxeItem(ModToolMaterial.BLACKSTONE,7F, -3.2F,
                    new FabricItemSettings()));
    public static final Item BLACKSTONE_SHOVEL = registerItem("blackstone_shovel",
            new ShovelItem(ModToolMaterial.BLACKSTONE,1.5F, -3F,
                    new FabricItemSettings()));
    public static final Item BLACKSTONE_HOE = registerItem("blackstone_hoe",
            new HoeItem(ModToolMaterial.BLACKSTONE,-1, -2F,
                    new FabricItemSettings()));
    public static final Item DEEPSLATE_SWORD = registerItem("deepslate_sword",
            new SwordItem(ModToolMaterial.DEEPSLATE,3, -2.4F,
                    new FabricItemSettings()));
    public static final Item DEEPSLATE_PICKAXE = registerItem("deepslate_pickaxe",
            new PickaxeItem(ModToolMaterial.DEEPSLATE,1, -2.8F,
                    new FabricItemSettings()));
    public static final Item DEEPSLATE_AXE = registerItem("deepslate_axe",
            new AxeItem(ModToolMaterial.DEEPSLATE,7F, -3.2F,
                    new FabricItemSettings()));
    public static final Item DEEPSLATE_SHOVEL = registerItem("deepslate_shovel",
            new ShovelItem(ModToolMaterial.DEEPSLATE,1.5F, -3F,
                    new FabricItemSettings()));
    public static final Item DEEPSLATE_HOE = registerItem("deepslate_hoe",
            new HoeItem(ModToolMaterial.DEEPSLATE,-1, -2F,
                    new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CinchsBetterDeepslate.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CinchsBetterDeepslate.LOGGER.info("Registering Mod Items for " + CinchsBetterDeepslate.MOD_ID);
    }
}