package net.echo.shimmering_gemstones.datagen;

import net.echo.shimmering_gemstones.block.ModBlocks;
import net.echo.shimmering_gemstones.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {


        addDrop(ModBlocks.BIOTITE);
        addDrop(ModBlocks.POLISHED_BIOTITE);

        //
        addDrop(ModBlocks.MARBLE);
        addDrop(ModBlocks.MARBLE_PILLAR);
        addDrop(ModBlocks.GILDED_MARBLE);

        addDrop(ModBlocks.SMOOTH_MARBLE);
        addDrop(ModBlocks.SMOOTH_MARBLE_STAIRS);
        addDrop(ModBlocks.SMOOTH_MARBLE_BUTTON);
        addDrop(ModBlocks.SMOOTH_MARBLE_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_MARBLE_FENCE);
        addDrop(ModBlocks.SMOOTH_MARBLE_WALL);
        addDrop(ModBlocks.SMOOTH_MARBLE_TRAPDOOR);
        addDrop(ModBlocks.SMOOTH_MARBLE_DOOR, doorDrops(ModBlocks.SMOOTH_MARBLE_DOOR));
        addDrop(ModBlocks.SMOOTH_MARBLE_SLAB, slabDrops(ModBlocks.SMOOTH_MARBLE_SLAB));

        addDrop(ModBlocks.MARBLE_BRICKS);
        addDrop(ModBlocks.MARBLE_BRICK_STAIRS);
        addDrop(ModBlocks.MARBLE_BRICK_WALL);
        addDrop(ModBlocks.MARBLE_BRICK_SLAB, slabDrops(ModBlocks.MARBLE_BRICK_SLAB));
        addDrop(ModBlocks.VERTICAL_MARBLE_BRICKS);


        addDrop(ModBlocks.MARBLE_TILES);
        addDrop(ModBlocks.MARBLE_TILE_STAIRS);
        addDrop(ModBlocks.MARBLE_TILE_WALL);
        addDrop(ModBlocks.MARBLE_TILE_SLAB, slabDrops(ModBlocks.MARBLE_TILE_SLAB));
        addDrop(ModBlocks.VERTICAL_MARBLE_TILES);

        //
        addDrop(ModBlocks.ENCASED_RUBY_VEIN);
        addDrop(ModBlocks.FRACTURED_RUBY_VEIN, dropsWithSilkTouch(ModBlocks.FRACTURED_RUBY_VEIN));
        addDrop(ModBlocks.SMALL_RUBY_BUD, dropsWithSilkTouch(ModBlocks.SMALL_RUBY_BUD));
        addDrop(ModBlocks.MEDIUM_RUBY_BUD, dropsWithSilkTouch(ModBlocks.MEDIUM_RUBY_BUD));
        addDrop(ModBlocks.LARGE_RUBY_BUD, dropsWithSilkTouch(ModBlocks.LARGE_RUBY_BUD));
        addDrop(ModBlocks.RUBY_CLUSTER, multipleOreDrops(ModBlocks.RUBY_CLUSTER, ModItems.RUBY, 3, 5));
        addDrop(ModBlocks.RUBY_BLOCK);
    }




    public LootTable.Builder multipleOreDrops(Block drop, Item item, float min, float max) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(min, max))))
                        .apply(ApplyBonusLootFunction
                                .oreDrops(Enchantments.FORTUNE))));
    }

}
