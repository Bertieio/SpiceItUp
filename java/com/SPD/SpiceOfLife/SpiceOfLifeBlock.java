package com.SPD.SpiceOfLife;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SpiceOfLifeBlock extends Block {

	public SpiceOfLifeBlock(Material material, String unlocalizedName, CreativeTabs creativeTab, Float hardness, Block.SoundType stepSound, String harvestTool, int harvestlevel) {
		super(material);
		this.setBlockName(SpiceOfLife.MODID + "_" + unlocalizedName);
	    this.setBlockTextureName(SpiceOfLife.MODID + ":" + unlocalizedName);
	    this.setCreativeTab(creativeTab);
	    this.setHardness(hardness);
        this.setStepSound(stepSound);
        this.setHarvestLevel(harvestTool, harvestlevel);
	}

}
