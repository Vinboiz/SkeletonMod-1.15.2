package com.vinboiz.skeletonmod.world.gen;

import com.vinboiz.skeletonmod.init.BiomeInit;
import com.vinboiz.skeletonmod.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class SkeletonOreGen {

	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			if (biome == BiomeInit.BONE_YARD.get()) {
				ConfiguredPlacement customConfig = Placement.COUNT_RANGE
					.configure(new CountRangeConfig(10, 20, 20, 25));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
					Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockInit.SKELETON_ORE.get().getDefaultState(), 10)).withPlacement(customConfig));
			}
		}
	}

}
