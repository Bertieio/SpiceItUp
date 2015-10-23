package com.SPD.SpiceItUp;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SpiceItUpBlock extends Block {

	public SpiceItUpBlock(Material material, String unlocalizedName, CreativeTabs creativeTab, Float hardness, Block.SoundType stepSound, String harvestTool, int harvestlevel) {
		super(material);
		this.setBlockName(SpiceItUp.MODID + "_" + unlocalizedName);
	    this.setBlockTextureName(SpiceItUp.MODID + ":" + unlocalizedName);
	    this.setCreativeTab(creativeTab);
	    this.setHardness(hardness);
        this.setStepSound(stepSound);
        this.setHarvestLevel(harvestTool, harvestlevel);
	}

}
