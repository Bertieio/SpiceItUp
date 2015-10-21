package com.SPD.SpiceOfLife;

import java.util.Arrays;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class SpiceOfLifeSapling extends BlockFlower {
	public static final String[] Trees = new String[] {"Cinnamon"};
	public SpiceOfLifeSapling(int j)
	{
		super(j);
		float var3 = 0.4f;
	this.setBlockBounds(0.5f - var3, 0.0f, 0.5f - var3, 0.5f + var3, 2.5f * var3, 0.5f + var3);
	this.setCreativeTab(CreativeTabs.tabDecorations);
		}
	/**
	* Ticks the block if it's been scheduled
	*/
	public void updateTick(World world, int x, int y, int z, Random random)
	{
		if (!world.isRemote)
		{
			super.updateTick(world, x, y, z, random);
			if (world.getBlockLightValue(x, y+ 1, z) >= 9 && random.nextInt(7) == 0)
				{
				this.func_96477_c(world, x, y,z, random);
				}
				}
		}
	
	public void func_96477_c(World world, int x, int y, int z, Random random)
	{
		Block l = world.getBlock(x, y -1, z);
		int m = world.getBlockMetadata(x, y, z);
		if (Arrays.asList(Blocks.dirt, Blocks.farmland, Blocks.grass).contains(l))
		{
			world.setBlockMetadataWithNotify(x, y, z, m | 8, 4);
		}
		else
		{
			this.growTree(world, x, y ,z, random)
		}
	}
	
}
	

