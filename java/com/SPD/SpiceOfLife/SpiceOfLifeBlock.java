package com.SPD.SpiceOfLife;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SpiceOfLifeBlock extends Block {

	public SpiceOfLifeBlock(Material material, String unlocalizedName, CreativeTabs creativeTab) {
		super(material);
		setBlockName(SpiceOfLife.MODID + "_" + unlocalizedName);
	    setBlockTextureName(SpiceOfLife.MODID + ":" + unlocalizedName);
	    setCreativeTab(creativeTab);
		// TODO Auto-generated constructor stub
	}

}
