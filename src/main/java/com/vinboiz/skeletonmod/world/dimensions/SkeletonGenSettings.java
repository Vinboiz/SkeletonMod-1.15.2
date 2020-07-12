package com.vinboiz.skeletonmod.world.dimensions;

import net.minecraft.world.gen.GenerationSettings;

public class SkeletonGenSettings extends GenerationSettings{

	public int getBiomeSize() {
		return 4;
	}
	
	public int getRiverSize() {
		return 4;
	}
	
	public int getBiomeId() {
		return -1;
	}
	
	public int getBedrockFloorHeight() {
		return 0;
	}
}
