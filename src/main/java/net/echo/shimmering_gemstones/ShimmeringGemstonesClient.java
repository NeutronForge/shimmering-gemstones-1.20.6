package net.echo.shimmering_gemstones;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ShimmeringGemstonesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {





        BlockRenderLayerMap.INSTANCE.putBlock(net.echo.shimmering_gemstones.block.ModBlocks.SMALL_RUBY_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(net.echo.shimmering_gemstones.block.ModBlocks.MEDIUM_RUBY_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(net.echo.shimmering_gemstones.block.ModBlocks.LARGE_RUBY_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(net.echo.shimmering_gemstones.block.ModBlocks.RUBY_CLUSTER, RenderLayer.getCutout());

    }
}
