package com.SPD.SpiceOfLife;

import java.util.Arrays;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class SpiceOfLifeSapling extends BlockSapling 
{
	private static SpiceOfLifeTree treeGen = new SpiceOfLifeTree(true);
	
	public SpiceOfLifeSapling(String type)
	{
		setHardness(0.0F);
		setStepSound(soundTypeGrass);
		setBlockName(SpiceOfLife.MODID +"_"+ type + "Sapling");
		//setCreativeTab(CreativeTabs.tabDecorations);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		String name = this.getUnlocalizedName().substring(17) ; 
		blockIcon = par1IconRegister.registerIcon(SpiceOfLife.MODID +":"+name);
	}

	@Override
	public IIcon getIcon(int side, int metadata)
	{
		return blockIcon;
	}

	@Override
	public void func_149878_d(World world, int x, int y, int z, Random rand)
	{
		if (world.isRemote || !TerrainGen.saplingGrowTree(world, rand, x, y, z))
			return;

		int meta = damageDropped(world.getBlockMetadata(x, y, z));
		world.setBlockToAir(x, y, z);

		switch (meta)
		{
	
		default:
			if (treeGen.growTree(world, rand, x, y, z))
				return;
			break;
		}
		world.setBlock(x, y, z, this, meta, 4);
	}

	@Override
	public int damageDropped(int par1)
	{
		return par1 & 7;
	}
	
}

