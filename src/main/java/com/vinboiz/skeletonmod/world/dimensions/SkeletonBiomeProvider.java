package com.vinboiz.skeletonmod.world.dimensions;

import java.util.Random;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.vinboiz.skeletonmod.init.BiomeInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

public class SkeletonBiomeProvider extends BiomeProvider{

	private Random rand;
	
	public SkeletonBiomeProvider(SkeletonBiomeProviderSettings settings) {
		super(biomeList);
		rand = new Random();
	}
	
	private static final Set<Biome> biomeList = ImmutableSet.of(BiomeInit.BONE_YARD.get());
	
	@Override
	public Biome getNoiseBiome(int x, int y, int z) {
	return BiomeInit.BONE_YARD.get();
	}
}
