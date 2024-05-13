package net.echo.shimmering_gemstones.item;

import net.echo.shimmering_gemstones.ShimmeringGemstones;
import net.echo.shimmering_gemstones.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ShimmeringGemstones.MOD_ID, "ruby_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby_group"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RUBY_SLIVER);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.ENCASED_RUBY_VEIN);
                        entries.add(ModBlocks.FRACTURED_RUBY_VEIN);
                        entries.add(ModBlocks.SMALL_RUBY_BUD);
                        entries.add(ModBlocks.MEDIUM_RUBY_BUD);
                        entries.add(ModBlocks.LARGE_RUBY_BUD);
                        entries.add(ModBlocks.RUBY_CLUSTER);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModItems.RUBY_PLATED_NETHERITE_INGOT);
                        entries.add(ModItems.RUBY_PLATED_NETHERITE_SWORD);
                        entries.add(ModItems.RUBY_PLATED_NETHERITE_PICKAXE);
                        entries.add(ModItems.RUBY_PLATED_NETHERITE_AXE);
                        entries.add(ModItems.DEPLETED_RUBY_PLATED_NETHERITE_UPGRADE);
                        entries.add(ModItems.CHARGED_RUBY_PLATED_NETHERITE_UPGRADE);


                        entries.add(ModBlocks.BIOTITE);
                        entries.add(ModBlocks.POLISHED_BIOTITE);




                    }).build());





    public static final ItemGroup MARBLE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ShimmeringGemstones.MOD_ID, "marble_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.marble_group"))
                    .icon(() -> new ItemStack(ModBlocks.GILDED_MARBLE)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.MARBLE);
                        entries.add(ModBlocks.MARBLE_PILLAR);
                        entries.add(ModBlocks.CHISELED_MARBLE);
                        entries.add(ModBlocks.GILDED_MARBLE);

                        entries.add(ModBlocks.SMOOTH_MARBLE);
                        entries.add(ModBlocks.SMOOTH_MARBLE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_MARBLE_SLAB);
                        entries.add(ModBlocks.SMOOTH_MARBLE_BUTTON);
                        entries.add(ModBlocks.SMOOTH_MARBLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_MARBLE_FENCE);
                        entries.add(ModBlocks.SMOOTH_MARBLE_WALL);
                        entries.add(ModBlocks.SMOOTH_MARBLE_DOOR);
                        entries.add(ModBlocks.SMOOTH_MARBLE_TRAPDOOR);


                        entries.add(ModBlocks.VERTICAL_MARBLE_BRICKS);
                        entries.add(ModBlocks.MARBLE_BRICKS);
                        entries.add(ModBlocks.MARBLE_BRICK_STAIRS);
                        entries.add(ModBlocks.MARBLE_BRICK_SLAB);
                        entries.add(ModBlocks.MARBLE_BRICK_WALL);

                        entries.add(ModBlocks.VERTICAL_MARBLE_TILES);
                        entries.add(ModBlocks.MARBLE_TILES);
                        entries.add(ModBlocks.MARBLE_TILE_STAIRS);
                        entries.add(ModBlocks.MARBLE_TILE_SLAB);
                        entries.add(ModBlocks.MARBLE_TILE_WALL);


                    }).build());

    public static void registerItemGroups() {
        ShimmeringGemstones.LOGGER.info("Registering Item Groups for " + ShimmeringGemstones.MOD_ID);
    }
}
