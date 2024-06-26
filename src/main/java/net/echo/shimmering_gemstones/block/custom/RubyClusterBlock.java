package net.echo.shimmering_gemstones.block.custom;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class RubyClusterBlock
        extends AmethystBlock
        implements Waterloggable {
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final DirectionProperty FACING = Properties.FACING;
    private final float height;
    private final float xzOffset;
    protected final VoxelShape northShape;
    protected final VoxelShape southShape;
    protected final VoxelShape eastShape;
    protected final VoxelShape westShape;
    protected final VoxelShape upShape;
    protected final VoxelShape downShape;

    public RubyClusterBlock(Settings settings, float height, float xzOffset, VoxelShape northShape, VoxelShape southShape, VoxelShape eastShape, VoxelShape westShape, VoxelShape upShape, VoxelShape downShape) {
        super(settings);
        this.height = height;
        this.xzOffset = xzOffset;
        this.northShape = northShape;
        this.southShape = southShape;
        this.eastShape = eastShape;
        this.westShape = westShape;
        this.upShape = upShape;
        this.downShape = downShape;
    }


    public RubyClusterBlock(float height, float xzOffset, AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.getDefaultState().with(WATERLOGGED, false)).with(FACING, Direction.UP));
        this.upShape = Block.createCuboidShape(xzOffset, 0.0, xzOffset, 16.0f - xzOffset, height, 16.0f - xzOffset);
        this.downShape = Block.createCuboidShape(xzOffset, 16.0f - height, xzOffset, 16.0f - xzOffset, 16.0, 16.0f - xzOffset);
        this.northShape = Block.createCuboidShape(xzOffset, xzOffset, 16.0f - height, 16.0f - xzOffset, 16.0f - xzOffset, 16.0);
        this.southShape = Block.createCuboidShape(xzOffset, xzOffset, 0.0, 16.0f - xzOffset, 16.0f - xzOffset, height);
        this.eastShape = Block.createCuboidShape(0.0, xzOffset, xzOffset, height, 16.0f - xzOffset, 16.0f - xzOffset);
        this.westShape = Block.createCuboidShape(16.0f - height, xzOffset, xzOffset, 16.0, 16.0f - xzOffset, 16.0f - xzOffset);
        this.height = height;
        this.xzOffset = xzOffset;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        switch (direction) {
            case NORTH: {
                return this.northShape;
            }
            case SOUTH: {
                return this.southShape;
            }
            case EAST: {
                return this.eastShape;
            }
            case WEST: {
                return this.westShape;
            }
            case DOWN: {
                return this.downShape;
            }
        }
        return this.upShape;
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = state.get(FACING);
        BlockPos blockPos = pos.offset(direction.getOpposite());
        return world.getBlockState(blockPos).isSideSolidFullSquare(world, blockPos, direction);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED).booleanValue()) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        if (direction == state.get(FACING).getOpposite() && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World worldAccess = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        return (BlockState)((BlockState)this.getDefaultState().with(WATERLOGGED, worldAccess.getFluidState(blockPos).getFluid() == Fluids.WATER)).with(FACING, ctx.getSide());
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED).booleanValue()) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, FACING);
    }
}

