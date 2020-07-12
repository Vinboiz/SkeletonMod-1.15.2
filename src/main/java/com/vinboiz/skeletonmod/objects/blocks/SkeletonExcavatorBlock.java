package com.vinboiz.skeletonmod.objects.blocks;

import java.util.stream.Stream;

import com.vinboiz.skeletonmod.init.ModTileEntityTypes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
//import net.minecraft.block.Block.Properties;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

@SuppressWarnings("deprecation")

public class SkeletonExcavatorBlock extends Block{
	//specal block has this line
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING; 
	
	private static final VoxelShape SHAPE_N = 
			Stream.of(
					Block.makeCuboidShape(5, 7, 4, 11, 8, 10),
					Block.makeCuboidShape(4, 8, 3, 12, 14, 11),
					Block.makeCuboidShape(6, 2, 5, 10, 7, 9),
					Block.makeCuboidShape(7, 1, 6, 9, 2, 8),
					Block.makeCuboidShape(5, 14, 4, 11, 16, 10),
					Block.makeCuboidShape(6, 14, 1, 10, 15, 13),
					Block.makeCuboidShape(2, 14, 5, 5, 15, 9),
					Block.makeCuboidShape(6, 12, 11, 10, 14, 14),
					Block.makeCuboidShape(6, 4, 12, 10, 12, 14),
					Block.makeCuboidShape(6, 0, 11, 10, 4, 13),
					Block.makeCuboidShape(6, 7, 14, 10, 12, 15),
					Block.makeCuboidShape(6, 12, 0, 10, 14, 4),
					Block.makeCuboidShape(6, 4, 0, 10, 12, 2),
					Block.makeCuboidShape(6, 7, -1, 10, 12, 0),
					Block.makeCuboidShape(6, 0, 1, 10, 4, 3),
					Block.makeCuboidShape(12, 12, 5, 15, 14, 9),
					Block.makeCuboidShape(1, 12, 5, 4, 14, 9),
					Block.makeCuboidShape(13, 4, 5, 15, 12, 9),
					Block.makeCuboidShape(0, 7, 5, 1, 12, 9),
					Block.makeCuboidShape(15, 7, 5, 16, 12, 9),
					Block.makeCuboidShape(1, 4, 5, 3, 12, 9),
					Block.makeCuboidShape(12, 0, 5, 14, 4, 9),
					Block.makeCuboidShape(2, 0, 5, 4, 4, 9),
					Block.makeCuboidShape(11, 14, 5, 14, 15, 9)
					).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	private static final VoxelShape SHAPE_W = 
			Stream.of(
					Block.makeCuboidShape(5, 7, 4, 11, 8, 10),
					Block.makeCuboidShape(4, 8, 3, 12, 14, 11),
					Block.makeCuboidShape(6, 2, 5, 10, 7, 9),
					Block.makeCuboidShape(7, 1, 6, 9, 2, 8),
					Block.makeCuboidShape(5, 14, 4, 11, 16, 10),
					Block.makeCuboidShape(6, 14, 1, 10, 15, 13),
					Block.makeCuboidShape(2, 14, 5, 5, 15, 9),
					Block.makeCuboidShape(6, 12, 11, 10, 14, 14),
					Block.makeCuboidShape(6, 4, 12, 10, 12, 14),
					Block.makeCuboidShape(6, 0, 11, 10, 4, 13),
					Block.makeCuboidShape(6, 7, 14, 10, 12, 15),
					Block.makeCuboidShape(6, 12, 0, 10, 14, 4),
					Block.makeCuboidShape(6, 4, 0, 10, 12, 2),
					Block.makeCuboidShape(6, 7, -1, 10, 12, 0),
					Block.makeCuboidShape(6, 0, 1, 10, 4, 3),
					Block.makeCuboidShape(12, 12, 5, 15, 14, 9),
					Block.makeCuboidShape(1, 12, 5, 4, 14, 9),
					Block.makeCuboidShape(13, 4, 5, 15, 12, 9),
					Block.makeCuboidShape(0, 7, 5, 1, 12, 9),
					Block.makeCuboidShape(15, 7, 5, 16, 12, 9),
					Block.makeCuboidShape(1, 4, 5, 3, 12, 9),
					Block.makeCuboidShape(12, 0, 5, 14, 4, 9),
					Block.makeCuboidShape(2, 0, 5, 4, 4, 9),
					Block.makeCuboidShape(11, 14, 5, 14, 15, 9)
					).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	private static final VoxelShape SHAPE_S = 
			Stream.of(
					Block.makeCuboidShape(5, 7, 4, 11, 8, 10),
					Block.makeCuboidShape(4, 8, 3, 12, 14, 11),
					Block.makeCuboidShape(6, 2, 5, 10, 7, 9),
					Block.makeCuboidShape(7, 1, 6, 9, 2, 8),
					Block.makeCuboidShape(5, 14, 4, 11, 16, 10),
					Block.makeCuboidShape(6, 14, 1, 10, 15, 13),
					Block.makeCuboidShape(2, 14, 5, 5, 15, 9),
					Block.makeCuboidShape(6, 12, 11, 10, 14, 14),
					Block.makeCuboidShape(6, 4, 12, 10, 12, 14),
					Block.makeCuboidShape(6, 0, 11, 10, 4, 13),
					Block.makeCuboidShape(6, 7, 14, 10, 12, 15),
					Block.makeCuboidShape(6, 12, 0, 10, 14, 4),
					Block.makeCuboidShape(6, 4, 0, 10, 12, 2),
					Block.makeCuboidShape(6, 7, -1, 10, 12, 0),
					Block.makeCuboidShape(6, 0, 1, 10, 4, 3),
					Block.makeCuboidShape(12, 12, 5, 15, 14, 9),
					Block.makeCuboidShape(1, 12, 5, 4, 14, 9),
					Block.makeCuboidShape(13, 4, 5, 15, 12, 9),
					Block.makeCuboidShape(0, 7, 5, 1, 12, 9),
					Block.makeCuboidShape(15, 7, 5, 16, 12, 9),
					Block.makeCuboidShape(1, 4, 5, 3, 12, 9),
					Block.makeCuboidShape(12, 0, 5, 14, 4, 9),
					Block.makeCuboidShape(2, 0, 5, 4, 4, 9),
					Block.makeCuboidShape(11, 14, 5, 14, 15, 9)
					).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	private static final VoxelShape SHAPE_E = 
			Stream.of(
					Block.makeCuboidShape(5, 7, 4, 11, 8, 10),
					Block.makeCuboidShape(4, 8, 3, 12, 14, 11),
					Block.makeCuboidShape(6, 2, 5, 10, 7, 9),
					Block.makeCuboidShape(7, 1, 6, 9, 2, 8),
					Block.makeCuboidShape(5, 14, 4, 11, 16, 10),
					Block.makeCuboidShape(6, 14, 1, 10, 15, 13),
					Block.makeCuboidShape(2, 14, 5, 5, 15, 9),
					Block.makeCuboidShape(6, 12, 11, 10, 14, 14),
					Block.makeCuboidShape(6, 4, 12, 10, 12, 14),
					Block.makeCuboidShape(6, 0, 11, 10, 4, 13),
					Block.makeCuboidShape(6, 7, 14, 10, 12, 15),
					Block.makeCuboidShape(6, 12, 0, 10, 14, 4),
					Block.makeCuboidShape(6, 4, 0, 10, 12, 2),
					Block.makeCuboidShape(6, 7, -1, 10, 12, 0),
					Block.makeCuboidShape(6, 0, 1, 10, 4, 3),
					Block.makeCuboidShape(12, 12, 5, 15, 14, 9),
					Block.makeCuboidShape(1, 12, 5, 4, 14, 9),
					Block.makeCuboidShape(13, 4, 5, 15, 12, 9),
					Block.makeCuboidShape(0, 7, 5, 1, 12, 9),
					Block.makeCuboidShape(15, 7, 5, 16, 12, 9),
					Block.makeCuboidShape(1, 4, 5, 3, 12, 9),
					Block.makeCuboidShape(12, 0, 5, 14, 4, 9),
					Block.makeCuboidShape(2, 0, 5, 4, 4, 9),
					Block.makeCuboidShape(11, 14, 5, 14, 15, 9)
					).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	public SkeletonExcavatorBlock(Properties properties) {
		super(properties);
		//this.setDefaultState(this.stateContainer.getBaseState());
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING,  Direction.NORTH));
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch(state.get(FACING)) {
		case NORTH: 
			return SHAPE_N;
		case SOUTH:
			return SHAPE_S;
		case EAST:
			return SHAPE_E;
		case WEST:
			return SHAPE_W;
		default:
			return SHAPE_N;
		}
	}
	
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return ModTileEntityTypes.EXCAVATOR.get().create();
	}



	/* typed in by Vinny 		

		private static final VoxelShape SHAPE = 
			
				Stream.of(
				
				Block.makeCuboidShape(5, 7, 5, 11, 8, 11),
				Block.makeCuboidShape(4, 8, 4, 12, 14, 12),
				Block.makeCuboidShape(6, 2, 6, 10, 7, 10),
				Block.makeCuboidShape(7, 1, 7, 9, 2, 9),
				Block.makeCuboidShape(5, 14, 5, 11, 16, 11),
				Block.makeCuboidShape(6, 14, 2, 10, 15, 14),
				Block.makeCuboidShape(2, 14, 6, 5, 15, 10),
				Block.makeCuboidShape(6, 12, 12, 10, 14, 15),
				Block.makeCuboidShape(6, 4, 13, 10, 12, 15),
				Block.makeCuboidShape(6, 0, 12, 10, 4, 14),
				Block.makeCuboidShape(6, 7, 15, 10, 12, 16),
				Block.makeCuboidShape(6, 12, 1, 10, 14, 5),
				Block.makeCuboidShape(6, 4, 1, 10, 12, 3),
				Block.makeCuboidShape(6, 7, 0, 10, 12, 1),
				Block.makeCuboidShape(6, 0, 2, 10, 4, 4),
				Block.makeCuboidShape(12, 12, 6, 15, 14, 10),
				Block.makeCuboidShape(1, 12, 6, 4, 14, 10),
				Block.makeCuboidShape(13, 4, 6, 15, 12, 10),
				Block.makeCuboidShape(0, 7, 6, 1, 12, 10),
				Block.makeCuboidShape(15, 7, 6, 16, 12, 10),
				Block.makeCuboidShape(1, 4, 6, 3, 12, 10),
				Block.makeCuboidShape(12, 0, 6, 14, 4, 10),
				Block.makeCuboidShape(2, 0, 6, 4, 4, 10),
				Block.makeCuboidShape(11, 14, 6, 14, 15, 10)
				).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
			
				
		@Override
		public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
			return SHAPE;
		}
	*/
	

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
				return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
	}
	
	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING,  rot.rotate(state.get(FACING)));
	}
	

		@Override
		public BlockState mirror(BlockState state, Mirror mirrorIn) {
			
		return super.mirror(state, mirrorIn);
		}

	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}
	
}
