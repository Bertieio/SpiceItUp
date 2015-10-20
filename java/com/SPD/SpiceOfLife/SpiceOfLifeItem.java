package com.SPD.SpiceOfLife;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SpiceOfLifeItem extends Item {
	public SpiceOfLifeItem(String  unlocalizedName, CreativeTabs creativeTab){
	    this.setUnlocalizedName(SpiceOfLife.MODID + "_" + unlocalizedName);
	    this.setTextureName(SpiceOfLife.MODID + ":" + unlocalizedName);
	    this.setCreativeTab(creativeTab);
		
	}
}
