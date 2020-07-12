package com.vinboiz.skeletonmod.world.dimensions;

import java.util.function.BiFunction;

import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.ModDimension;

public class SkeletonModDimension extends ModDimension{
	@Override
	public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
		
		return BoneZone::new;
	}
}
