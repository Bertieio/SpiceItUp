package com.SPD.SpiceOfLife;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class SpiceOfLifeLeaf extends BlockLeaves{
	
	public SpiceOfLifeLeaf(String type)
	{
		//super(Material.leaves);
		this.setBlockTextureName(SpiceOfLife.MODID + ":" + type + "Leaves");	
		setBlockName(SpiceOfLife.MODID +"_"+ type + "Leaves");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeGrass);
		this.setTickRandomly(true);
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
		
		@Override
		 public int quantityDropped(Random p_149745_1_)
		 {
		       return p_149745_1_.nextInt(20) == 0 ? 1 : 0;
		 }
		
		  public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
		  {
		      return Item.getItemFromBlock(Blocks.sapling);
		  }

		@Override
		public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public String[] func_150125_e() {
			// TODO Auto-generated method stub
			return null;
		}
		
		}