package net.echo.shimmering_gemstones.block;

import net.echo.shimmering_gemstones.ShimmeringGemstones;
import net.echo.shimmering_gemstones.block.custom.FracturedRubyBlock;
import net.echo.shimmering_gemstones.block.custom.RubyClusterBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {



/* Test ore for dropping XP
    public static final Block SHIT = registerBlock("shit",
            new ExperienceDroppingBlock(UniformIntProvider.create(200, 500), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(0.1f)));
*/


    // Biotite
    public static final Block BIOTITE = registerBlock("biotite",
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT)));

    public static final Block POLISHED_BIOTITE = registerBlock("polished_biotite",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BASALT)));







    // Marble
    public static final Block MARBLE = registerBlock("marble",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));

    public static final Block CHISELED_MARBLE = registerBlock("chiseled_marble",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_QUARTZ_BLOCK)));

    public static final Block MARBLE_PILLAR = registerBlock("marble_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_PILLAR)));

    public static final Block GILDED_MARBLE = registerBlock("gilded_marble",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));

    public static final Block SMOOTH_MARBLE = registerBlock("smooth_marble",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_MARBLE_STAIRS = registerBlock("smooth_marble_stairs",
            new StairsBlock(ModBlocks.SMOOTH_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_MARBLE_SLAB = registerBlock("smooth_marble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_MARBLE_BUTTON = registerBlock("smooth_marble_button",
            new ButtonBlock(BlockSetType.STONE, 10, FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_MARBLE_PRESSURE_PLATE = registerBlock("smooth_marble_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_MARBLE_FENCE = registerBlock("smooth_marble_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_MARBLE_WALL = registerBlock("smooth_marble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_MARBLE_DOOR = registerBlock("smooth_marble_door",
            new DoorBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ).nonOpaque()));
    public static final Block SMOOTH_MARBLE_TRAPDOOR = registerBlock("smooth_marble_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ).nonOpaque()));

    public static final Block MARBLE_BRICKS = registerBlock("marble_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block MARBLE_BRICK_STAIRS = registerBlock("marble_brick_stairs",
            new StairsBlock(ModBlocks.MARBLE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block MARBLE_BRICK_SLAB = registerBlock("marble_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block MARBLE_BRICK_WALL = registerBlock("marble_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block VERTICAL_MARBLE_BRICKS = registerBlock("vertical_marble_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));

    public static final Block MARBLE_TILES = registerBlock("marble_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block MARBLE_TILE_STAIRS = registerBlock("marble_tile_stairs",
            new StairsBlock(ModBlocks.MARBLE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block MARBLE_TILE_SLAB = registerBlock("marble_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block MARBLE_TILE_WALL = registerBlock("marble_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block VERTICAL_MARBLE_TILES = registerBlock("vertical_marble_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));




    // Ruby

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block ENCASED_RUBY_VEIN = registerBlock("encased_ruby_vein",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block FRACTURED_RUBY_VEIN = registerBlock("fractured_ruby_vein",
            new FracturedRubyBlock(FabricBlockSettings.copyOf(Blocks.BUDDING_AMETHYST)));

    public static final Block RUBY_CLUSTER = registerBlock("ruby_cluster",
            new RubyClusterBlock(16.0f, 3.0f, FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER).nonOpaque()));
    public static final Block LARGE_RUBY_BUD = registerBlock("large_ruby_bud",
            new RubyClusterBlock(9.0f, 3.0f, FabricBlockSettings.copyOf(Blocks.LARGE_AMETHYST_BUD).nonOpaque()));
    public static final Block MEDIUM_RUBY_BUD = registerBlock("medium_ruby_bud",
            new RubyClusterBlock(6.0f, 3.0f, FabricBlockSettings.copyOf(Blocks.MEDIUM_AMETHYST_BUD).nonOpaque()));
    public static final Block SMALL_RUBY_BUD = registerBlock("small_ruby_bud",
            new RubyClusterBlock(3.0f, 4.0f, FabricBlockSettings.copyOf(Blocks.SMALL_AMETHYST_BUD).nonOpaque()));

    //public static final Block RUBY_WARFORGE = registerBlock("ruby_warforge",
    //        new RubyWarforgeBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)));




    // seperator

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ShimmeringGemstones.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ShimmeringGemstones.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ShimmeringGemstones.LOGGER.info("Registering ModBlocks for " + ShimmeringGemstones.MOD_ID);
    }
}
