package com.vinboiz.skeletonmod.init;

import com.vinboiz.skeletonmod.SkeletonMod;
import com.vinboiz.skeletonmod.world.biomes.BoneYard;
import com.vinboiz.skeletonmod.world.biomes.BoneYardSurfaceBuilder;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.BiomeManager;

public class BiomeInit {

	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES,
			SkeletonMod.MOD_ID);

	public static final RegistryObject<Biome> BONE_YARD = BIOMES
			.register("bone_yard", 
			() -> new BoneYard(
					new Biome.Builder().precipitation(RainType.RAIN).scale(1.0f).waterColor(17709).waterFogColor(41075).temperature(-1f)
					.surfaceBuilder(
							new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
							register("skeleton_surface",
									new BoneYardSurfaceBuilder(
											SurfaceBuilderConfig::deserialize)), 
									new SurfaceBuilderConfig(BlockInit.ANCIENT_GRASS.get().getDefaultState(),
											BlockInit.ANCIENT_GRASS.get().getDefaultState(),
											BlockInit.ANCIENT_GRASS.get().getDefaultState())))
					.category(Category.SWAMP)
					.downfall(0.25f)
					.depth(0.125f)
					.parent(null)));
	

	public static void registerBiomes() {
		registerBiome(BONE_YARD.get(), Type.SWAMP, Type.OVERWORLD);
	}

	private static void registerBiome(Biome biome, Type... types) {
		// the line below will make it spawn in the overworld
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100));
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}

	@SuppressWarnings("deprecation")
	private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn) {
		return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));
	}
}