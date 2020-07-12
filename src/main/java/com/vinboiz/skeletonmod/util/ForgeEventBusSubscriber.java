package com.vinboiz.skeletonmod.util;

import com.vinboiz.skeletonmod.SkeletonMod;
import com.vinboiz.skeletonmod.init.DimensionInit;

import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = SkeletonMod.MOD_ID, bus = Bus.FORGE)
public class ForgeEventBusSubscriber {
	
	@SubscribeEvent
	public static void registerDimensions(final RegisterDimensionsEvent event) {
		if(DimensionType.byName(SkeletonMod.BONE_YARD_TYPE) == null) {
			DimensionManager.registerDimension(SkeletonMod.BONE_YARD_TYPE, DimensionInit.BONE_ZONE.get(), null, true);
			
		}
		SkeletonMod.LOGGER.info("Dimensions Registered");
	}

}
