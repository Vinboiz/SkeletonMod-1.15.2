package com.vinboiz.skeletonmod.init;

import com.vinboiz.skeletonmod.SkeletonMod;
import com.vinboiz.skeletonmod.world.dimensions.SkeletonModDimension;

import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {
	public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS,SkeletonMod.MOD_ID);
	
	public static final RegistryObject<ModDimension> BONE_ZONE = MOD_DIMENSIONS.register("bone_zone", () -> new SkeletonModDimension());
}
