package com.vinboiz.skeletonmod.init;

import com.vinboiz.skeletonmod.SkeletonMod;
import com.vinboiz.skeletonmod.objects.blocks.ModPressurePlateBlock;
import com.vinboiz.skeletonmod.objects.blocks.ModWoodButtonBlock;
//import com.vinboiz.skeletonmod.SkeletonMod.SkeletonItemGroup;
import com.vinboiz.skeletonmod.objects.blocks.SkeletonExcavatorBlock;
//import com.vinboiz.skeletonmod.objects.blocks.SkeletonRibcageBlock;
import com.vinboiz.skeletonmod.objects.blocks.SummonerBlock;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
//import net.minecraft.block.Blocks;
//import net.minecraft.block.FenceBlock;
//import net.minecraft.block.LeavesBlock;
//import net.minecraft.block.LogBlock;
//import net.minecraft.block.PressurePlateBlock.Sensitivity;
//import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
//import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
//import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class BlockInit {
	public static final DeferredRegister<Block>	BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,SkeletonMod.MOD_ID);
	
	public static final RegistryObject<Block> SKELETON_BLOCK = BLOCKS.register("skeleton_block", () -> new Block(
			Block.Properties.create(Material.IRON).hardnessAndResistance(4.0f, 15.0f)
			.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

	public static final RegistryObject<Block> SKELETON_ORE = BLOCKS.register("skeleton_ore", () -> new Block(
			Block.Properties.create(Material.IRON).hardnessAndResistance(4.0f, 15.0f)
			.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> SKELEON_SUMMONER = BLOCKS.register("skeleton_summoner",
			() -> new SummonerBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0f, 15.0f)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));

	public static final RegistryObject<Block> SKELETON_EXCAVATOR = BLOCKS.register("skeleton_excavator", 
			() -> new SkeletonExcavatorBlock(
			Block.Properties.create(Material.IRON).hardnessAndResistance(4.0f, 15.0f)
			.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> SKELETON_STAIRS = BLOCKS.register("skeleton_stairs",
			() -> new StairsBlock(() -> BlockInit.SKELETON_BLOCK.get().getDefaultState(), 
					Block.Properties.create(Material.IRON, MaterialColor.QUARTZ)));
	
	public static final RegistryObject<Block> SKELETON_FENCE = BLOCKS.register("skeleton_fence",
			() -> new FenceBlock(Block.Properties.create(Material.IRON, MaterialColor.QUARTZ)));

	public static final RegistryObject<Block> SKELETON_BUTTON = BLOCKS.register("skeleton_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.IRON, MaterialColor.QUARTZ)));

	public static final RegistryObject<Block> SKELETON_Pressure_Plate = BLOCKS.register("skeleton_pressure_plate",
			() -> new ModPressurePlateBlock(Block.Properties.create(Material.IRON, MaterialColor.QUARTZ)));

	public static final RegistryObject<Block> ANCIENT_GRASS = BLOCKS.register("ancient_grass", 
			() -> new Block(Block.Properties.create(Material.EARTH).hardnessAndResistance(1.0f, 5.0f)
			.harvestLevel(0).harvestTool(ToolType.SHOVEL).sound(SoundType.PLANT)));
	
}
	
