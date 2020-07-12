//package com.vinboiz.skeletonmod.objects.blocks;
//
//import com.vinboiz.skeletonmod.init.ModTileEntityTypes;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockState;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.world.IBlockReader;
//
//public class SkeletonRibcageBlock extends Block{
//
//	public SkeletonRibcageBlock(Properties properties) {
//		super(properties);
//		
//	}
//	@Override
//	public boolean hasTileEntity(BlockState state) {
//		return true;
//	}
//	@Override
//	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
//		return ModTileEntityTypes.SKELETONRIBCAGE.get().create();
//	}
//}
