package com.SPD.SpiceOfLife;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockCinnamonWood extends Block {
	public static final String NAME = "CinnamonWood";
	
	public blockCinnamonWood(){
		super(Material.wood);
		setBlockName(SpiceOfLife.MODID + "_" + blockCinnamonWood.NAME);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(SpiceOfLife.MODID + ":" + blockCinnamonWood.NAME);
	}
}
