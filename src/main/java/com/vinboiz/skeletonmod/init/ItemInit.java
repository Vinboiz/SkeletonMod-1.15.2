package com.vinboiz.skeletonmod.init;

import com.vinboiz.skeletonmod.SkeletonMod;
import com.vinboiz.skeletonmod.SkeletonMod.SkeletonItemGroup;
import com.vinboiz.skeletonmod.objects.items.Fuel;
import com.vinboiz.skeletonmod.objects.items.SpecialItem;
import com.vinboiz.skeletonmod.util.enums.ModArmorMaterials;
import com.vinboiz.skeletonmod.util.enums.ModItemTiers;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
//import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
//import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
@SuppressWarnings("deprecation")

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			SkeletonMod.MOD_ID);

//items

	public static final RegistryObject<Item> SKELETON_INGOT = ITEMS.register("skeleton_ingot",
			() -> new Item(new Item.Properties().group(SkeletonItemGroup.instance)));

	public static final RegistryObject<SpecialItem> SKELETON_GEM = ITEMS.register("skeleton_gem",
			() -> new SpecialItem(new Item.Properties().group(SkeletonItemGroup.instance)));

	//event.getRegistry().register(new Item(new Item.Properties().group(SkeletonItemGroup.instance).food(new Food.Builder().hunger(3).saturation(1.0f).meat().effect(new EffectInstance(Effects.STRENGTH, 2000, 1), 1.0f).build())).setRegistryName("bone_marrow"));
	public static final RegistryObject<Item> BONE_MARROW = ITEMS.register("bone_marrow",
			() -> new Item(new Item.Properties().group(SkeletonItemGroup.instance).food(new Food.Builder().hunger(3)
					.saturation(1.0f).meat().effect(new EffectInstance(Effects.STRENGTH, 2000, 0), 1.0f).build())));

	public static final RegistryObject<Fuel> BONE_FIRE = ITEMS.register("bone_fire",
			() -> new Fuel (new Item.Properties().group(SkeletonItemGroup.instance)));  //event.getRegistry().register(new Fuel(new Item.Properties().group(SkeletonItemGroup.instance)).setRegistryName("bone_fire"));
		
	//tools
	public static final RegistryObject<SwordItem> SKELETON_SWORD = ITEMS.register("skeleton_sword",
			() -> new SwordItem(ModItemTiers.SKELETON, 6, 4.0f,
					new Item.Properties().group(SkeletonItemGroup.instance)));

	public static final RegistryObject<PickaxeItem> SKELETON_PICKAXE = ITEMS.register("skeleton_pickaxe",
			() -> new PickaxeItem(ModItemTiers.SKELETON, 4, 4.0f,
					new Item.Properties().group(SkeletonItemGroup.instance)));

	public static final RegistryObject<ShovelItem> SKELETON_SHOVEL = ITEMS.register("skeleton_shovel",
			() -> new ShovelItem(ModItemTiers.SKELETON, 3, 4.0f,
					new Item.Properties().group(SkeletonItemGroup.instance)));

	public static final RegistryObject<AxeItem> SKELETON_AXE = ITEMS.register("skeleton_axe",
			() -> new AxeItem(ModItemTiers.SKELETON, 5, 5.0f, new Item.Properties().group(SkeletonItemGroup.instance)));

	public static final RegistryObject<HoeItem> SKELETON_HOE = ITEMS.register("skeleton_hoe",
			() -> new HoeItem(ModItemTiers.SKELETON, 4.0f, new Item.Properties().group(SkeletonItemGroup.instance)));

	//armors
	public static final RegistryObject<ArmorItem> SKELETON_HELMET = ITEMS.register("skeleton_helmet",
			() -> new ArmorItem(ModArmorMaterials.SKELETON, EquipmentSlotType.HEAD,
					new Item.Properties().group(SkeletonItemGroup.instance)));

	public static final RegistryObject<ArmorItem> SKELETON_CHESTPLATE = ITEMS.register("skeleton_chestplate",
			() -> new ArmorItem(ModArmorMaterials.SKELETON, EquipmentSlotType.CHEST,
					new Item.Properties().group(SkeletonItemGroup.instance)));

	public static final RegistryObject<ArmorItem> SKELETON_LEGGINGS = ITEMS.register("skeleton_leggings",
			() -> new ArmorItem(ModArmorMaterials.SKELETON, EquipmentSlotType.LEGS,
					new Item.Properties().group(SkeletonItemGroup.instance)));

	public static final RegistryObject<ArmorItem> SKELETON_BOOTS = ITEMS.register("skeleton_boots",
			() -> new ArmorItem(ModArmorMaterials.SKELETON, EquipmentSlotType.FEET,
					new Item.Properties().group(SkeletonItemGroup.instance)));
	
	public static final RegistryObject<Item> SKELETON_TAZOR = ITEMS.register("skeleton_tazor",
			() -> new Item(new Item.Properties().group(SkeletonItemGroup.instance)));
}


