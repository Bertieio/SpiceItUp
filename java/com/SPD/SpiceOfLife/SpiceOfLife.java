package com.SPD.SpiceOfLife;
 
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = SpiceOfLife.MODID, version = SpiceOfLife.VERSION)
public class SpiceOfLife
{
    //Mod Info!
	public static final String MODID = "SpiceOfLife";
    public static final String VERSION = "0.01";
    public static final String NAME = "Spice Of Life";
    public static final String VERSIONNAME = "\"Anyone Here?\"";
    
    //Blocks!
    public static Block cinnamonWood;
    
    //Items!
    public static Item cinnamonBark;
    public static Item cinnamonPowder;    
    
    //Initialization!
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    //Messages!
    	System.out.println("Started Loading " + SpiceOfLife.NAME + " " + SpiceOfLife.VERSION + " " + SpiceOfLife.VERSIONNAME);
    
    //Blocks!	
    	cinnamonWood = new blockCinnamonWood();
    	GameRegistry.registerBlock(cinnamonWood, "cinnamonWood");
   
    //Items!
    	cinnamonBark = new itemCinnamonBark();
    	GameRegistry.registerItem(cinnamonBark, "cinnamonBark");
    	
    	cinnamonPowder = new itemCinnamonPowder();
    	GameRegistry.registerItem(cinnamonPowder, "cinnamonPowder");
    
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
 
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	System.out.println("Finished Loading " + SpiceOfLife.NAME + " " + SpiceOfLife.VERSION + " " + SpiceOfLife.VERSIONNAME);
    }
}