package com.SPD.SpiceOfLife;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SpiceOfLifeLeaf extends Block{
	
	public SpiceOfLifeLeaf(String name)
	{
		super(Material.leaves);
		this.setBlockName(SpiceOfLife.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeGrass);
		this.setHardness(0.2F);
		}


		public boolean isOpaqueCube()
		{
		return false;
		}
		/**
		* Returns the ID of the items to drop on destruction.
		*/
		public String NameDropped(int par1, Random par2Random, int par3)
		{
		return this.getUnlocalizedName();
		}
		/**
		* Returns the quantity of items to drop on block destruction.
		*/
		public int quantityDropped(Random par1Random)
		{
		return 1;
		}
		}