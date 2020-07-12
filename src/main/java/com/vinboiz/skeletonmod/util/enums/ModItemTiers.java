	
package com.vinboiz.skeletonmod.util.enums;

import java.util.function.Supplier;

import com.vinboiz.skeletonmod.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTiers implements IItemTier {
		
		SKELETON(4, 500, 15.0f, 6.0f, 200, () -> {
			return Ingredient.fromItems(ItemInit.SKELETON_INGOT.get());
		
		});
		
		private final int harvestlevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage; 
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial; 
		
		private ModItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
			this.harvestlevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
			
		}

		@Override
		public int getMaxUses() {		
			
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
		
			return this.harvestlevel;
		}

		@Override
		public int getEnchantability() {
			
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			
			return this.repairMaterial.getValue();
		}
	
	}