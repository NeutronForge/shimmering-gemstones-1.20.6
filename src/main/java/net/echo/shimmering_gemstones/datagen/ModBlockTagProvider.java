package net.echo.shimmering_gemstones.datagen;

import net.echo.shimmering_gemstones.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {


        // PICKAXE MINEABLE
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BIOTITE)
                .add(ModBlocks.POLISHED_BIOTITE)

                //
                .add(ModBlocks.MARBLE)
                .add(ModBlocks.MARBLE_PILLAR)
                .add(ModBlocks.CHISELED_MARBLE)
                .add(ModBlocks.GILDED_MARBLE)
                .add(ModBlocks.SMOOTH_MARBLE)

                .add(ModBlocks.MARBLE_BRICKS)
                .add(ModBlocks.MARBLE_BRICK_STAIRS)
                .add(ModBlocks.MARBLE_BRICK_SLAB)
                .add(ModBlocks.MARBLE_BRICK_WALL)
                .add(ModBlocks.VERTICAL_MARBLE_BRICKS)

                .add(ModBlocks.MARBLE_TILES)
                .add(ModBlocks.MARBLE_TILE_STAIRS)
                .add(ModBlocks.MARBLE_TILE_SLAB)
                .add(ModBlocks.MARBLE_TILE_WALL)
                .add(ModBlocks.VERTICAL_MARBLE_TILES)

                //
                .add(ModBlocks.ENCASED_RUBY_VEIN)
                .add(ModBlocks.FRACTURED_RUBY_VEIN)
                .add(ModBlocks.SMALL_RUBY_BUD)
                .add(ModBlocks.MEDIUM_RUBY_BUD)
                .add(ModBlocks.LARGE_RUBY_BUD)
                .add(ModBlocks.RUBY_CLUSTER)
                .add(ModBlocks.RUBY_BLOCK);




        // REQUIRES STONE
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MARBLE)
                .add(ModBlocks.MARBLE_PILLAR)
                .add(ModBlocks.CHISELED_MARBLE)
                .add(ModBlocks.GILDED_MARBLE)
                .add(ModBlocks.SMOOTH_MARBLE)

                .add(ModBlocks.MARBLE_BRICKS)
                .add(ModBlocks.MARBLE_BRICK_STAIRS)
                .add(ModBlocks.MARBLE_BRICK_SLAB)
                .add(ModBlocks.MARBLE_BRICK_WALL)
                .add(ModBlocks.VERTICAL_MARBLE_BRICKS)

                .add(ModBlocks.MARBLE_TILES)
                .add(ModBlocks.MARBLE_TILE_STAIRS)
                .add(ModBlocks.MARBLE_TILE_SLAB)
                .add(ModBlocks.MARBLE_TILE_WALL)
                .add(ModBlocks.VERTICAL_MARBLE_TILES);

        // REQUIRES IRON
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ENCASED_RUBY_VEIN)
                .add(ModBlocks.ENCASED_RUBY_VEIN)
                .add(ModBlocks.SMALL_RUBY_BUD)
                .add(ModBlocks.MEDIUM_RUBY_BUD)
                .add(ModBlocks.LARGE_RUBY_BUD)
                .add(ModBlocks.RUBY_CLUSTER);

        // REQUIRES DIAMOND
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RUBY_BLOCK);

        // REQUIRES TIER 4 (NETHERITE)
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));


        // REQUIRES TIER 5 (MODDED)
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")));


        // FENCE TAG
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.SMOOTH_MARBLE_FENCE);

        // FENCE GATE TAG
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                ;

        // WALL TAG
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SMOOTH_MARBLE_WALL)
                .add(ModBlocks.MARBLE_BRICK_WALL)
                .add(ModBlocks.MARBLE_TILE_WALL);

    }
}
