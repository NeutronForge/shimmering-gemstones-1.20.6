package net.echo.shimmering_gemstones.item;

import net.echo.shimmering_gemstones.ShimmeringGemstones;
import net.echo.shimmering_gemstones.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RANDOM_SHIT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ShimmeringGemstones.MOD_ID, "ruby_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby_group"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY_SLIVER);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.ENCASED_RUBY_VEIN);
                        entries.add(ModBlocks.FRACTURED_RUBY_VEIN);
                        entries.add(ModBlocks.BIOTITE);
                        entries.add(ModBlocks.POLISHED_BIOTITE);

                        entries.add(ModBlocks.SMALL_RUBY_BUD);
                        entries.add(ModBlocks.MEDIUM_RUBY_BUD);
                        entries.add(ModBlocks.LARGE_RUBY_BUD);
                        entries.add(ModBlocks.RUBY_CLUSTER);

                        entries.add(ModBlocks.MARBLE);
                        entries.add(ModBlocks.MARBLE_BRICKS);
                        entries.add(ModBlocks.MARBLE_PILLAR);
                        entries.add(ModBlocks.CHISELED_MARBLE);
                        entries.add(ModBlocks.SMOOTH_MARBLE);

                        entries.add(ModBlocks.SMOOTH_MARBLE_BRICKS);



                    }).build());

    public static void registerItemGroups() {
        ShimmeringGemstones.LOGGER.info("Registering Item Groups for " + ShimmeringGemstones.MOD_ID);
    }
}
