package com.vinboiz.skeletonmod.init;

import com.vinboiz.skeletonmod.SkeletonMod;
import com.vinboiz.skeletonmod.tileentity.ExcavatorTileEntity;
//import com.vinboiz.skeletonmod.tileentity.SkeletonRibcageTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(
			ForgeRegistries.TILE_ENTITIES, SkeletonMod.MOD_ID);

	public static final RegistryObject<TileEntityType<ExcavatorTileEntity>> EXCAVATOR = TILE_ENTITY_TYPES.register("skeleton_excavator",
			() -> TileEntityType.Builder.create(ExcavatorTileEntity::new, BlockInit.SKELETON_EXCAVATOR.get()).build(null));

	//public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, SkeletonMod.MOD_ID);
	
	//public static final RegistryObject<TileEntityType<SkeletonRibcageTileEntity>> SKELETONRIBCAGE = TILE_ENTITY_TYPES.register("skeletonribcage", () -> TileEntityType.Builder.create(SkeletonRibcageTileEntity::new, BlockInit.skeleton_ribcage).build(null));
	
	//public static final RegistryObject<TileEntityType<ExcavatorTileEntity>> SKELETONEXCAVATOR = TILE_ENTITY_TYPES.register("skeletonexcavator", () -> TileEntityType.Builder.create(ExcavatorTileEntity::new, BlockInit.skeleton_excavator).build(null));
}
