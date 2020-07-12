//package com.vinboiz.skeletonmod.objects.items;
//
//import java.util.List;
//
//import com.vinboiz.skeletonmod.util.helpers.Keyboardhelper;
//
//import net.minecraft.client.util.ITooltipFlag;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.potion.EffectInstance;
//import net.minecraft.potion.Effects;
//import net.minecraft.util.text.ITextComponent;
//import net.minecraft.util.text.StringTextComponent;
//import net.minecraft.world.World;
//
//public class SkeletonTazor extends Item {
//
//	public SkeletonTazor(Properties properties) {
//		super(properties);
//
//	}
//
//	@Override
//	public boolean hasEffect(ItemStack stack) {
//		return true;
//
//	}
//	
//	@Override
//	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
//		
//		if(Keyboardhelper.IsHoldingShift()) {
//			
//			tooltip.add(new StringTextComponent("When you hit something they get shocked"));
//		} else {
//			tooltip.add(new StringTextComponent("Hold SHIFT for more information"));
//		}
//			
//		super.addInformation(stack, worldIn, tooltip, flagIn);
//	}
//	
//	
//	@Override
//	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) 
//	{
//		return true;
//		target.addPotionEffect(new EffectInstance(Effects.POISON, 100, 255, false, false));
//		target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100, 255, false, false));
//	}
//		
//}
//	
//
