package net.echo.shimmering_gemstones;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShimmeringGemstones implements ModInitializer {
    public static final String MOD_ID = "shimmering_gemstones";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        net.echo.shimmering_gemstones.item.ModItemGroups.registerItemGroups();
        net.echo.shimmering_gemstones.item.ModItems.registerModItems();
        net.echo.shimmering_gemstones.block.ModBlocks.registerModBlocks();

    }
}