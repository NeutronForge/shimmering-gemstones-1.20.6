package net.echo.shimmering_gemstones;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShimmeringGemstones implements ModInitializer {
    public static final String MOD_ID = "shimmering_gemstones";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    //public static final PickaxeItem SHIT_PICKAXE = new PickaxeItem(ToolMaterials.NETHERITE, new Item.Settings());


    @Override
    public void onInitialize() {
        net.echo.shimmering_gemstones.item.ModItemGroups.registerItemGroups();
        net.echo.shimmering_gemstones.item.ModItems.registerModItems();
        net.echo.shimmering_gemstones.block.ModBlocks.registerModBlocks();

    //    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shit_pickaxe"), SHIT_PICKAXE);
    }
}