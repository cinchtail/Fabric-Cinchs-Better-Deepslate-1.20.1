package net.cinchtail.cinchsbetterdeepslate;

import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.cinchtail.cinchsbetterdeepslate.item.ModItemGroups;
import net.cinchtail.cinchsbetterdeepslate.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinchsBetterDeepslate implements ModInitializer {
	public static final String MOD_ID = "cinchsbetterdeepslate";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}