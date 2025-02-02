package com.vinboiz.skeletonmod.objects.blocks;

//import java.util.Optional;
import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
//import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
//import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.ActionResultType;
//import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
//import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

@SuppressWarnings("deprecation")
public class SummonerBlock extends Block {

	

	private static final VoxelShape SHAPE = Stream.of(
			Block.makeCuboidShape(0, 0, 0, 16, 8, 16),
			Block.makeCuboidShape(0, 8, 0, 16, 8, 16),
			Block.makeCuboidShape(9, 10, 9, 7, 11, 7),
			Block.makeCuboidShape(11, 12, 11, 5, 13, 5),
			Block.makeCuboidShape(10, 13, 10, 6, 14, 6),
			Block.makeCuboidShape(9, 14, 9, 7, 15, 7),
			Block.makeCuboidShape(10, 11, 10, 6, 12, 6),
			Block.makeCuboidShape(0, 0, 0, 16, 0, 16)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
//	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
//	
	public SummonerBlock(Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState());
//		
	}
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}
		//		switch(state.get(FACING)) {
//		case NORTH:
//			//return SHAPE_N;
//		case SOUTH:
//			//return SHAPE_N;
//		case EAST:
//			
//		case WEST:
//			
//		default:
//			return SHAPE_N;
//		}
//	}
@Override
public BlockState getStateForPlacement(BlockItemUseContext context) {
			return this.getDefaultState();
			}
//	
//	@Override
//	public BlockState rotate(BlockState state, Rotation rot) {
//		return state.with(FACING, rot.rotate(state.get(FACING)));
//	}
//	
	@Override
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
//		
	return super.mirror(state, mirrorIn);
	}

@Override
protected void fillStateContainer(Builder<Block, BlockState> builder) {
//	
//	builder.//add(FACING);
}
//
//	
	//public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTrack) {
		@Override
		public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
				Hand handIn, BlockRayTraceResult hit) {
			
		if(!worldIn.isRemote()) {
			ServerWorld serverWorld = (ServerWorld)worldIn;
			LightningBoltEntity entity = new LightningBoltEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), false);
			serverWorld.addLightningBolt(entity);
		}
		return ActionResultType.SUCCESS;
	}
		
		
}

