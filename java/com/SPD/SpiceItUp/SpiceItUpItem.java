package com.SPD.SpiceItUp;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SpiceItUpItem extends Item {
	public SpiceItUpItem(String  unlocalizedName, CreativeTabs creativeTab){
	    this.setUnlocalizedName(SpiceItUp.MODID + "_" + unlocalizedName);
	    this.setTextureName(SpiceItUp.MODID + ":" + unlocalizedName);
	    this.setCreativeTab(creativeTab);
		
	}
}
