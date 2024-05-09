package net.echo.shimmering_gemstones.block.custom;

import net.echo.shimmering_gemstones.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;


public class FracturedRubyBlock extends Block {
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public FracturedRubyBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) != 0) {
            return;
        }
        Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
        BlockPos blockPos = pos.offset(direction);
        BlockState blockState = world.getBlockState(blockPos);
        Block block = null;
        if (net.echo.shimmering_gemstones.block.custom.FracturedRubyBlock.canGrowIn(blockState)) {
            block = ModBlocks.SMALL_RUBY_BUD;
        } else if (blockState.isOf(ModBlocks.SMALL_RUBY_BUD) && blockState.get(RubyClusterBlock.FACING) == direction) {
            block = ModBlocks.MEDIUM_RUBY_BUD;
        } else if (blockState.isOf(ModBlocks.MEDIUM_RUBY_BUD) && blockState.get(RubyClusterBlock.FACING) == direction) {
            block = ModBlocks.LARGE_RUBY_BUD;
        } else if (blockState.isOf(ModBlocks.LARGE_RUBY_BUD) && blockState.get(RubyClusterBlock.FACING) == direction) {
            block = ModBlocks.RUBY_CLUSTER;
        }
        if (block != null) {
            BlockState blockState2 = (BlockState)((BlockState)block.getDefaultState().with(RubyClusterBlock.FACING, direction)).with(RubyClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
            world.setBlockState(blockPos, blockState2);
        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }
}

