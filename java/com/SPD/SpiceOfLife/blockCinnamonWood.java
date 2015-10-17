package com.SPD.SpiceOfLife;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockCinnamonWood extends Block {
	
	public blockCinnamonWood(){
		super(Material.wood);
		setBlockName(SpiceOfLife.MODID + "_CinnamonWood");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(SpiceOfLife.MODID + ":CinnamonWood");
	}
}
