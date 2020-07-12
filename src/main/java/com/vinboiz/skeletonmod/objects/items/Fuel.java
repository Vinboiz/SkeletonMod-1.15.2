package com.vinboiz.skeletonmod.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
//import net.minecraft.item.Item.Properties;

public class Fuel extends Item {
	
	public Fuel(Properties properties) {
		super(properties);

	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 2000;
	}
}
