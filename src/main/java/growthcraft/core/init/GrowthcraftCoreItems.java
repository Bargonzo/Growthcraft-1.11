package growthcraft.core.init;

import growthcraft.core.common.definition.ItemDefinition;
import growthcraft.core.handlers.EnumHandler;
import growthcraft.core.items.ItemCrowbar;
import growthcraft.core.items.ItemRope;
import growthcraft.core.items.ItemSalt;
import net.minecraftforge.oredict.OreDictionary;

import static growthcraft.core.GrowthcraftCore.tabGrowthcraft;

public class GrowthcraftCoreItems {

    public static ItemDefinition crowbar;
    public static ItemDefinition salt;
    public static ItemDefinition rope;

    public static void preInit() {
        crowbar = new ItemDefinition( new ItemCrowbar("crowbar") );
        salt = new ItemDefinition( new ItemSalt("salt") );
        rope = new ItemDefinition( new ItemRope("rope") );
    }

    public static void register() {
    	crowbar.getItem().setCreativeTab(tabGrowthcraft);
    	crowbar.register();
    	salt.getItem().setCreativeTab(tabGrowthcraft);
        salt.register();
        rope.getItem().setCreativeTab(tabGrowthcraft);
        rope.register();
        
        registerOres();
    }
    
    private static void registerOres() {
		OreDictionary.registerOre("materialSalt", salt.getItem());
		OreDictionary.registerOre("foodSalt", salt.getItem());
		OreDictionary.registerOre("dustSalt", salt.getItem());
		OreDictionary.registerOre("itemSalt", salt.getItem());
		OreDictionary.registerOre("lumpSalt", salt.getItem());
    }

    public static void registerRenders() {
    	salt.registerRender();
    	rope.registerRender();
    	crowbar.registerRenders(EnumHandler.CrowbarTypes.class);
    }
}
