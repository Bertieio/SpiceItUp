package com.SPD.SpiceOfLife;
 
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
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
    public static Block cinnamonSapling;
    public static Block cinnamonLeaf;
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
   
    	
    	
    	
  //Cinnamon   	
    //Blocks!	
    	cinnamonWood = new SpiceOfLifeBlock(Material.wood, "CinnamonWood", CreativeTabs.tabMaterials, 2.0F,  net.minecraft.block.Block.soundTypeWood, "axe", 0);
    	GameRegistry.registerBlock(cinnamonWood, "cinnamonWood");
      	
    	cinnamonLeaf = new SpiceOfLifeLeaf("CinnamonLeaf");
    	GameRegistry.registerBlock(cinnamonLeaf, "cinnamonLeaf");

    	cinnamonSapling = new SpiceOfLifeSapling(0);
    	
    //Items!
    	cinnamonBark = new SpiceOfLifeItem("CinnamonBark",CreativeTabs.tabFood);
    	GameRegistry.registerItem(cinnamonBark, "cinnamonBark");
    	
    	cinnamonPowder = new SpiceOfLifeItem("CinnamonPowder",CreativeTabs.tabFood);
    	GameRegistry.registerItem(cinnamonPowder, "cinnamonPowder");
    	
    	cinnamonApple = new SpiceOfLifeFood("CinnamonApple", 4, 0.3F, false, new PotionEffect(Potion.regeneration.id,40,3));
    	GameRegistry.registerItem(cinnamonApple, "cinnamonApple");
    //Recipes
    	GameRegistry.addShapelessRecipe(new ItemStack(SpiceOfLife.cinnamonPowder), new Object[]
    			{
    			SpiceOfLife.cinnamonBark
    			}
    	
    		);
    	GameRegistry.addRecipe(new ItemStack(SpiceOfLife.cinnamonApple), new Object[] {"###","#A#","###", '#', SpiceOfLife.cinnamonPowder, 'A', Items.apple});
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