package net.echo.shimmering_gemstones.datagen;

import net.echo.shimmering_gemstones.block.ModBlocks;
import net.echo.shimmering_gemstones.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIOTITE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.POLISHED_BIOTITE, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);

        //
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MARBLE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.MARBLE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_MARBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_MARBLE);

        BlockStateModelGenerator.BlockTexturePool smoothMarblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_MARBLE);
        smoothMarblePool.stairs(ModBlocks.SMOOTH_MARBLE_STAIRS);
        smoothMarblePool.slab(ModBlocks.SMOOTH_MARBLE_SLAB);
        smoothMarblePool.button(ModBlocks.SMOOTH_MARBLE_BUTTON);
        smoothMarblePool.pressurePlate(ModBlocks.SMOOTH_MARBLE_PRESSURE_PLATE);
        smoothMarblePool.fence(ModBlocks.SMOOTH_MARBLE_FENCE);
        smoothMarblePool.wall(ModBlocks.SMOOTH_MARBLE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.SMOOTH_MARBLE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SMOOTH_MARBLE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool marbleBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE_BRICKS);
        marbleBrickPool.stairs(ModBlocks.MARBLE_BRICK_STAIRS);
        marbleBrickPool.slab(ModBlocks.MARBLE_BRICK_SLAB);
        marbleBrickPool.wall(ModBlocks.MARBLE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_MARBLE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool marbleTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE_TILES);
        marbleTilePool.stairs(ModBlocks.MARBLE_TILE_STAIRS);
        marbleTilePool.slab(ModBlocks.MARBLE_TILE_SLAB);
        marbleTilePool.wall(ModBlocks.MARBLE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERTICAL_MARBLE_TILES);

        //
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENCASED_RUBY_VEIN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FRACTURED_RUBY_VEIN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerAmethyst(ModBlocks.SMALL_RUBY_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.MEDIUM_RUBY_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.LARGE_RUBY_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.RUBY_CLUSTER);
        //blockStateModelGenerator.registerNorthDefaultHorizontalRotated(ModBlocks.RUBY_WARFORGE, TexturedModel.ORIENTABLE_WITH_BOTTOM);



      /*  private void registerSmithingTable() {
            TextureMap textureMap = new TextureMap().put(TextureKey.PARTICLE, TextureMap.getSubId(Blocks.SMITHING_TABLE, "_front")).put(TextureKey.DOWN, TextureMap.getSubId(Blocks.SMITHING_TABLE, "_bottom")).put(TextureKey.UP, TextureMap.getSubId(Blocks.SMITHING_TABLE, "_top")).put(TextureKey.NORTH, TextureMap.getSubId(Blocks.SMITHING_TABLE, "_front")).put(TextureKey.SOUTH, TextureMap.getSubId(Blocks.SMITHING_TABLE, "_front")).put(TextureKey.EAST, TextureMap.getSubId(Blocks.SMITHING_TABLE, "_side")).put(TextureKey.WEST, TextureMap.getSubId(Blocks.SMITHING_TABLE, "_side"));
            this.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(Blocks.SMITHING_TABLE, Models.CUBE.upload(Blocks.SMITHING_TABLE, textureMap, this.modelCollector)));
        }
       */




    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_SLIVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.SMALL_RUBY_BUD), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.MEDIUM_RUBY_BUD), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.LARGE_RUBY_BUD), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.RUBY_CLUSTER), Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY_PLATED_NETHERITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY_PLATED_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PLATED_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PLATED_NETHERITE_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DEPLETED_RUBY_PLATED_NETHERITE_UPGRADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARGED_RUBY_PLATED_NETHERITE_UPGRADE, Models.GENERATED);
    }
}
