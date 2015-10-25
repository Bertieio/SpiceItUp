package com.SPD.SpiceItUp;
 
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
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = SpiceItUp.MODID, version = SpiceItUp.VERSION)
public class SpiceItUp
{
    //Mod Info!
	public static final String MODID = "SpiceItUp";
    public static final String VERSION = "0.01";
    public static final String NAME = "Spice Of Life";
    public static final String VERSIONNAME = "\"Angry Armadillo\"";
    
    //Blocks!
    public static IWorldGenerator cinnamonTree;
    
    public static Block cinnamonWood;
    public static Block cinnamonSapling;
    public static Block cinnamonLeaf;
    public static Block cinnamonLog;
    //Items!
    public static Item cinnamonBark;
    public static Item cinnamonPowder;  
    
    public static ItemFood cinnamonApple;    
    //Initialisation!
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    //Events!
        MinecraftForge.EVENT_BUS.register(new SpiceItUpEvents());

    	
    //Messages!
    	System.out.println("Started Loading " + SpiceItUp.NAME + " " + SpiceItUp.VERSION + " " + SpiceItUp.VERSIONNAME);
   
    	
   //World Gen
    	cinnamonTree = (IWorldGenerator) new SpiceItUpTree();
    	GameRegistry.registerWorldGenerator(cinnamonTree, 1);
    	
  //Cinnamon   	
    //Blocks!	
    	cinnamonWood = new SpiceItUpLog(Material.wood, "CinnamonWood", CreativeTabs.tabMaterials, 2.0F,  net.minecraft.block.Block.soundTypeWood, "axe", 0);
    	GameRegistry.registerBlock(cinnamonWood, "cinnamonWood");
      	
    	cinnamonLog = new SpiceItUpLog(Material.wood, "CinnamonLog", CreativeTabs.tabMaterials, 2.0F,  net.minecraft.block.Block.soundTypeWood, "axe", 0);
    	GameRegistry.registerBlock(cinnamonLog, "cinnamonLog");
      	
    	
    	cinnamonLeaf = new SpiceItUpLeaf("Cinnamon");
    	GameRegistry.registerBlock(cinnamonLeaf, "cinnamonLeaf");

    	cinnamonSapling = new SpiceItUpSapling("Cinnamon");
    	GameRegistry.registerBlock(cinnamonSapling, "CinnamonSapling");
    	
    //Items!
    	cinnamonBark = new SpiceItUpItem("CinnamonBark",CreativeTabs.tabFood);
    	GameRegistry.registerItem(cinnamonBark, "cinnamonBark");
    	
    	cinnamonPowder = new SpiceItUpItem("CinnamonPowder",CreativeTabs.tabFood);
    	GameRegistry.registerItem(cinnamonPowder, "cinnamonPowder");
    	
    	cinnamonApple = new SpiceItUpFood("CinnamonApple", 4, 0.3F, false, new PotionEffect(Potion.regeneration.id,40,3));
    	GameRegistry.registerItem(cinnamonApple, "cinnamonApple");
    //Recipes
    	GameRegistry.addShapelessRecipe(new ItemStack(SpiceItUp.cinnamonPowder), new Object[]
    			{
    			SpiceItUp.cinnamonBark
    			}
    	
    		);
    	GameRegistry.addRecipe(new ItemStack(SpiceItUp.cinnamonApple), new Object[] {"###","#A#","###", '#', SpiceItUp.cinnamonPowder, 'A', Items.apple});
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	System.out.println("Finished Loading " + SpiceItUp.NAME + " " + SpiceItUp.VERSION + " " + SpiceItUp.VERSIONNAME);
    }
        
   

}