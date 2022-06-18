package net.codersdownunder.flowerseeds.utils.flags;

import net.codersdownunder.flowerseeds.FlowerSeeds;

public class FlowerSeedsModFlags {
	
	private static final FlagManager FLAG_MANAGER = new FlagManager(FlowerSeeds.MODID);

    public static FlagManager manager() {

        return FLAG_MANAGER;
    }

    public static void setFlag(String flag, boolean enable) {

        FLAG_MANAGER.putFlag(flag, enable);
    }

    public static boolean getFlag(String flag) {

        return FLAG_MANAGER.getFlag(flag);
    }

    public static String FLAG_DANDELION = "dandelion";
    public static String FLAG_POPPY = "poppy";
    public static String FLAG_ORCHID = "orchid";
    public static String FLAG_ALLIUM = "allium";
    public static String FLAG_AZURE = "azure";
    public static String FLAG_TULIP_RED = "tulip_red";
    public static String FLAG_TULIP_ORANGE = "tulip_orange";
    public static String FLAG_TULIP_WHITE = "tulip_white";
    public static String FLAG_TULIP_PINK = "tulip_pink";
    public static String FLAG_OXEYE = "oxeye";
    public static String FLAG_LILY = "lily";
    public static String FLAG_WITHERROSE = "witherrose";
    public static String FLAG_CORNFLOWER = "cornflower";
    
    //Cyclic
    public static String FLAG_CYANROSE = "cyanrose";



    
    /*static {
        setFlag(FLAG_COBBLESTONE, () -> FLAG_COBBLESTONE );
        setFlag(FLAG_STONE, () -> getFlag(FLAG_STONE));
        setFlag(FLAG_STONE2, () -> getFlag(FLAG_STONE2).getAsBoolean());
        setFlag(FLAG_OBSIDIAN, () -> getFlag(FLAG_OBSIDIAN).getAsBoolean());
        setFlag(FLAG_GLOWSTONE, () -> getFlag(FLAG_GLOWSTONE).getAsBoolean());
    }*/

}
