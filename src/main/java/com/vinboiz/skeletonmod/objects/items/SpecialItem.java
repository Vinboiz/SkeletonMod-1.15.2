package com.vinboiz.skeletonmod.objects.items;

import java.util.List;

import com.vinboiz.skeletonmod.util.helpers.Keyboardhelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class SpecialItem extends Item {

	public SpecialItem(Properties properties) {
		super(properties);

	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;

	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		
		if(Keyboardhelper.IsHoldingShift()) {
			
			tooltip.add(new StringTextComponent("Right Click to turn invisible"));
		} else {
			tooltip.add(new StringTextComponent("Hold SHIFT for more information"));
		}
			
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		playerIn.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 100, 255));
			
		return super.onItemRightClick(worldIn, playerIn, handIn);
		
		
	}
	
}
