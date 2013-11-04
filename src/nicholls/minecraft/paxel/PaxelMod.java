package nicholls.minecraft.paxel;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = PaxelMod.modId, name = "Paxel Knockoff", version = "1")
@NetworkMod(clientSideRequired = true)
public class PaxelMod
{
    public static final String modId = "ChrisNicholls_Paxel";
    
    public static Item paxelWood = new PaxelItem(5001, EnumToolMaterial.WOOD).setUnlocalizedName("paxelWood").setTextureName("paxel:wood_paxel");
    public static Item paxelStone = new PaxelItem(5002, EnumToolMaterial.STONE).setUnlocalizedName("paxelStone").setTextureName("paxel:stone_paxel");
    public static Item paxelIron = new PaxelItem(5003, EnumToolMaterial.IRON).setUnlocalizedName("paxelIron").setTextureName("paxel:iron_paxel");
    public static Item paxelGold = new PaxelItem(5004, EnumToolMaterial.GOLD).setUnlocalizedName("paxelGold").setTextureName("paxel:gold_paxel");
    public static Item paxelDiamond = new PaxelItem(5005, EnumToolMaterial.EMERALD).setUnlocalizedName("paxelDiamond").setTextureName("paxel:diamond_paxel");

    @Instance(value = modId)
    public static PaxelMod instance;
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {   
        ItemStack plankStack = new ItemStack(Block.planks);
        ItemStack stickStack = new ItemStack(Item.stick);
        ItemStack stoneStack = new ItemStack(Block.cobblestone);
        ItemStack ironStack = new ItemStack(Item.ingotIron);
        ItemStack goldStack = new ItemStack(Item.ingotGold);
        ItemStack diamondStack = new ItemStack(Item.diamond);
        
        GameRegistry.addRecipe(new ItemStack(paxelWood), "xxx", "xyx", "xyx", 'x', plankStack, 'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(paxelStone), "xxx", "xyx", "xyx", 'x', stoneStack, 'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(paxelIron), "xxx", "xyx", "xyx", 'x', ironStack, 'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(paxelGold), "xxx", "xyx", "xyx", 'x', goldStack, 'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(paxelDiamond), "xxx", "xyx", "xyx", 'x', diamondStack, 'y', stickStack);
      
        LanguageRegistry.addName(paxelWood, "Wood Paxel");
        LanguageRegistry.addName(paxelStone, "Stone Paxel");
        LanguageRegistry.addName(paxelIron, "Iron Paxel");
        LanguageRegistry.addName(paxelGold, "Gold Paxel");
        LanguageRegistry.addName(paxelDiamond, "Diamond Paxel");
    }
}
