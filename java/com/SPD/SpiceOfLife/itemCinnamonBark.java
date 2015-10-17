package com.SPD.SpiceOfLife;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemCinnamonBark extends Item {
	public itemCinnamonBark()
	{
		setUnlocalizedName(SpiceOfLife.MODID + "_CinnamonBark");
		setCreativeTab(CreativeTabs.tabFood);
		setTextureName(SpiceOfLife.MODID + ":CinnamonBark");
	}

}
