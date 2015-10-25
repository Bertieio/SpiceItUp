package com.SPD.SpiceItUp;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
	   public boolean hasSubTypes(IBlockAccess world, int x, int y, int z)
	    {
	        return true;
	    }
	   @SideOnly(Side.CLIENT)
	    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
	    {
	        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
	        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
}
}
	   
