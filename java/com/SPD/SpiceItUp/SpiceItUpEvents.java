package com.SPD.SpiceItUp;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class SpiceItUpEvents {
	  @SubscribeEvent
	    public void onBlockHarvest(HarvestDropsEvent event){
	    
		//CinnamonBark  
		  if (event.block == SpiceItUp.cinnamonLog)
			//  event.drops.clear();
		  		event.drops.add(new ItemStack(SpiceItUp.cinnamonWood));
	    		event.drops.add(new ItemStack(SpiceItUp.cinnamonBark));
	  //  if (event.block == SpiceItUp.cinnamonWood)
	    //	  event.drops.clear();
  		//event.drops.add(new ItemStack(SpiceItUp.cinnamonWood));
	
	  }
}
