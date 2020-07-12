package com.vinboiz.skeletonmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vinboiz.skeletonmod.init.BiomeInit;
import com.vinboiz.skeletonmod.init.BlockInit;
import com.vinboiz.skeletonmod.init.DimensionInit;
import com.vinboiz.skeletonmod.init.ItemInit;
import com.vinboiz.skeletonmod.init.ModTileEntityTypes;
import com.vinboiz.skeletonmod.world.gen.SkeletonOreGen;

import net.minecraft.block.Block;
//import net.minecraft.block.ComposterBlock;
//import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.Dimension;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.world.WorldType;
//import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@SuppressWarnings("deprecation")
@Mod("skeletonmod")
@Mod.EventBusSubscriber(modid = SkeletonMod.MOD_ID, bus = Bus.MOD)
public class SkeletonMod
{

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "skeletonmod";
    public static SkeletonMod instance;
    public static final ResourceLocation BONE_YARD_TYPE = new ResourceLocation(MOD_ID, "skeleton");
    
    
    public SkeletonMod() {

    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        ////modEventBus.addListener(this::doClientStuff);
    
		//ParticleInit.PARTICLE_TYPES.register(modEventBus);
		//SoundInit.SOUNDS.register(modEventBus);
		//PotionInit.POTIONS.register(modEventBus);
		//PotionInit.POTION_EFFECTS.register(modEventBus);
		//EnchantmentInit.ENCHANTMENTS.register(modEventBus);
		ItemInit.ITEMS.register(modEventBus);
		//FluidInit.FLUIDS.register(modEventBus);
		BlockInit.BLOCKS.register(modEventBus);
		ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
	
		//ModContainerTypes.CONTAINER_TYPES.register(modEventBus);
		//ModEntityTypes.ENTITY_TYPES.register(modEventBus);
		BiomeInit.BIOMES.register(modEventBus);
		DimensionInit.MOD_DIMENSIONS.register(modEventBus);


        
        instance = this; 
        
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		BlockInit.BLOCKS.getEntries().stream()
				.map(RegistryObject::get).forEach(block -> {
					final Item.Properties properties = new Item.Properties().group(SkeletonItemGroup.instance);
					final BlockItem blockItem = new BlockItem(block, properties);
					blockItem.setRegistryName(block.getRegistryName());
					registry.register(blockItem);
				});
		
				LOGGER.debug("Registered BlockItems!");
	}
    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
    	BiomeInit.registerBiomes();
    }
  

    private void setup(final FMLCommonSetupEvent event)
    {
    	DeferredWorkQueue.runLater(SkeletonOreGen::generateOre);
    }

    /*
    private void doClientStuff(final FMLClientSetupEvent event) {
    }
*/

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    	//TurtyWurty: this doesn't work anymore
    	//SkeletonModOreGen.generateOre();
    }
    
    
    public static class SkeletonItemGroup extends ItemGroup {
    	public static final SkeletonItemGroup instance = new SkeletonItemGroup(ItemGroup.GROUPS.length, "skeletontab");
    	
    	private SkeletonItemGroup(int index, String label) {
    		super(index, label);
    		
    	}
    	@Override
    	public ItemStack createIcon() {
    		return new ItemStack(ItemInit.SKELETON_GEM.get());
    		
    		
    	}
    	
	}
    
}
