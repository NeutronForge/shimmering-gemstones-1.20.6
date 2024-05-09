package net.echo.shimmering_gemstones.datagen;

import net.echo.shimmering_gemstones.block.ModBlocks;
import net.echo.shimmering_gemstones.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MARBLE_BRICKS);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.MARBLE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_MARBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_MARBLE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_MARBLE_BRICKS);


        //
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENCASED_RUBY_VEIN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FRACTURED_RUBY_VEIN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerAmethyst(ModBlocks.SMALL_RUBY_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.MEDIUM_RUBY_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.LARGE_RUBY_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.RUBY_CLUSTER);
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
    }
}
