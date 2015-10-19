package com.SPD.SpiceOfLife;
 
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = SpiceOfLife.MODID, version = SpiceOfLife.VERSION)
public class SpiceOfLife
{
    //Mod Info!
	public static final String MODID = "SpiceOfLife";
    public static final String VERSION = "0.01";
    public static final String NAME = "Spice Of Life";
    public static final String VERSIONNAME = "\"Angry Armadillo\"";
    
    //Blocks!
    public static Block cinnamonWood;
    
    //Items!
    public static Item cinnamonBark;
    public static Item cinnamonPowder;  
    
    public static ItemFood cinnamonApple;    
    //Initialisation!
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    //Events!
        MinecraftForge.EVENT_BUS.register(new SpiceOfLifeEvents());

    	
    //Messages!
    	System.out.println("Started Loading " + SpiceOfLife.NAME + " " + SpiceOfLife.VERSION + " " + SpiceOfLife.VERSIONNAME);
    
    //Blocks!	
    	cinnamonWood = new blockCinnamonWood();
    //	GameRegistry.registerBlock(cinnamonWood, "cinnamonWood");
   
    //Items!
    	cinnamonBark = new itemCinnamonBark();
    	GameRegistry.registerItem(cinnamonBark, "cinnamonBark");
    	
    	cinnamonPowder = new itemCinnamonPowder();
    	GameRegistry.registerItem(cinnamonPowder, "cinnamonPowder");
    	
    	cinnamonApple = new itemCinnamonApple("cinnamonApple", 4, 4, false, null);
    	GameRegistry.registerItem(cinnamonApple, "cinnamonApple");
    //Recipes
    	GameRegistry.addShapelessRecipe(new ItemStack(SpiceOfLife.cinnamonPowder), new Object[]
    			{
    			SpiceOfLife.cinnamonBark
    			}
    	);
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
    
    //Drops!
    
   

}