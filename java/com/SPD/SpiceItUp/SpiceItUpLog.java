package com.SPD.SpiceItUp;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class SpiceItUpLog extends SpiceItUpBlock{

	public SpiceItUpLog(Material material, String unlocalizedName, CreativeTabs creativeTab, Float hardness,
			SoundType stepSound, String harvestTool, int harvestlevel) {
		super(material, unlocalizedName, creativeTab, hardness, stepSound, harvestTool, harvestlevel);
		// TODO Auto-generated constructor stub
	}
	 public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
	    {
	        return true;
	    }

	    @Override
	   public boolean isWood(IBlockAccess world, int x, int y, int z)
	    {
	        return true;
	    }

}