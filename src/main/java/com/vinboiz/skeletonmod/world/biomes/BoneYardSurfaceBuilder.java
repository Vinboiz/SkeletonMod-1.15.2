package com.vinboiz.skeletonmod.world.biomes;

import java.util.Random;
import java.util.function.Function;

import com.mojang.datafixers.Dynamic;
import com.vinboiz.skeletonmod.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class BoneYardSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {

	public BoneYardSurfaceBuilder(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> function) {
			super(function);		}

	@Override
	public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise,
			BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
		Random rd = new Random();
		int i = rd.nextInt(3);
		if (i == 0) {
			SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock,
					defaultFluid, seaLevel, seed,
					new SurfaceBuilderConfig(BlockInit.ANCIENT_GRASS.get().getDefaultState(),
							BlockInit.ANCIENT_GRASS.get().getDefaultState(), BlockInit.ANCIENT_GRASS.get().getDefaultState()));
		} else {
			SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock,
					defaultFluid, seaLevel, seed,
					new SurfaceBuilderConfig(
							i == 1 ? Blocks.GRASS_BLOCK.getDefaultState()
									: BlockInit.ANCIENT_GRASS.get().getDefaultState(),
							BlockInit.ANCIENT_GRASS.get().getDefaultState(), BlockInit.ANCIENT_GRASS.get().getDefaultState()));
		}
	}
}

