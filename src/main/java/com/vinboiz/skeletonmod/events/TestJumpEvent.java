/*
 * package com.vinboiz.skeletonmod.events;
 * 
 * import com.vinboiz.skeletonmod.SkeletonMod; import
 * com.vinboiz.skeletonmod.init.BlockInit;
 * 
 * import net.minecraft.entity.LivingEntity; import
 * net.minecraft.potion.EffectInstance; import net.minecraft.potion.Effects;
 * import net.minecraft.world.World; import
 * net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent; import
 * net.minecraftforge.eventbus.api.SubscribeEvent; import
 * net.minecraftforge.fml.common.Mod; import
 * net.minecraftforge.fml.common.Mod.EventBusSubscriber; import
 * net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
 * 
 * @Mod.EventBusSubscriber(modid = SkeletonMod.MOD_ID, bus = Bus.FORGE) public
 * class TestJumpEvent {
 * 
 * @SubscribeEvent public static void TestJumpEvent(LivingJumpEvent event) {
 * SkeletonMod.LOGGER.info("TestJumpEvent Fired"); LivingEntity livingEntity =
 * event.getEntityLiving(); World world = livingEntity.getEntityWorld();
 * livingEntity.addPotionEffect(new EffectInstance(Effects.LEVITATION, 3, 255));
 * livingEntity.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 600,
 * 255)); } }
 */