package com.vinboiz.skeletonmod.world.dimensions;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class SkeletonBiomeProviderSettings implements IBiomeProviderSettings {

	private final long seed;
	private final WorldType worldType;
	private SkeletonGenSettings generatorSettings = new SkeletonGenSettings();

	public SkeletonBiomeProviderSettings(WorldInfo info) {
		this.seed = info.getSeed();
		this.worldType = info.getGenerator();
	}

	public SkeletonBiomeProviderSettings setGeneratorSettings(SkeletonGenSettings settings) {
		this.generatorSettings = settings;
		return this;
	}

	public long getSeed() {
		return this.seed;
	}

	public WorldType getWorldType() {
		return this.worldType;
	}

	public SkeletonGenSettings getGeneratorSettings() {
		return this.generatorSettings;
	}
}