package com.SPD.SpiceOfLife;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class itemCinnamonApple extends ItemFood {

	private PotionEffect[] effects;

	public itemCinnamonApple(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects) {
	    super(healAmount, saturationModifier, wolvesFavorite);
	    this.setUnlocalizedName(unlocalizedName);
	    this.setTextureName(SpiceOfLife.MODID + ":" + unlocalizedName);
	    this.setCreativeTab(CreativeTabs.tabFood);
	    this.effects = effects;
	}

}
