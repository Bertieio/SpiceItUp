package com.SPD.SpiceOfLife;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class SpiceOfLifeEvents {
	  @SubscribeEvent
	    public void onBlockHarvest(HarvestDropsEvent event){
	    
		//CinnamonBark  
		  if (event.block == Blocks.leaves && Math.random() <= 0.5F)
	    		event.drops.add(new ItemStack(SpiceOfLife.cinnamonBark));
	    }
}
