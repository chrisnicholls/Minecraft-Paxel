package nicholls.minecraft.paxel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;

public class PaxelItem extends ItemTool
{
    public static final Block[] blocksEffectiveAgainst = new Block[] {
            //pickaxe
            Block.cobblestone, Block.stoneDoubleSlab, Block.stoneSingleSlab,
            Block.stone, Block.sandStone, Block.cobblestoneMossy,
            Block.oreIron, Block.blockIron, Block.oreCoal, Block.blockGold,
            Block.oreGold, Block.oreDiamond, Block.blockDiamond, Block.ice,
            Block.netherrack, Block.oreLapis, Block.blockLapis,
            Block.oreRedstone, Block.oreRedstoneGlowing, Block.rail,
            Block.railDetector, Block.railPowered, Block.railActivator,
            //shovel
            Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow,
            Block.blockSnow, Block.blockClay, Block.tilledField,
            //axe
            Block.slowSand, Block.mycelium, Block.planks, Block.bookShelf,
            Block.wood, Block.chest, Block.stoneDoubleSlab,
            Block.stoneSingleSlab, Block.pumpkin, Block.pumpkinLantern };

    public PaxelItem(int itemId, EnumToolMaterial toolMaterial)
    {
        super(itemId, 2.0F, toolMaterial, blocksEffectiveAgainst);

        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("paxelItem");
    }

    @Override
    public boolean canHarvestBlock(Block block)
    {
        // pickaxe stuff
        if (block == Block.obsidian)
        {
            return this.toolMaterial.getHarvestLevel() == 3;
        }

        if (block == Block.blockDiamond || block == Block.oreDiamond)
        {
            return this.toolMaterial.getHarvestLevel() >= 2;
        }

        if (block == block.blockEmerald || block == Block.oreEmerald)
        {
            return this.toolMaterial.getHarvestLevel() >= 2;
        }

        if (block == Block.blockGold || block == Block.oreGold)
        {
            return this.toolMaterial.getHarvestLevel() >= 2;
        }

        if (block == Block.blockIron || block == Block.oreIron)
        {
            return this.toolMaterial.getHarvestLevel() >= 1;
        }

        if (block == Block.blockLapis || block == Block.oreLapis)
        {
            return this.toolMaterial.getHarvestLevel() >= 1;
        }

        if (block == Block.oreRedstone || block == Block.oreRedstoneGlowing)
        {
            return this.toolMaterial.getHarvestLevel() >= 2;
        }

        if (block.blockMaterial == Material.rock)
        {
            return true;
        }

        if (block.blockMaterial == Material.iron)
        {
            return true;
        }

        if (block.blockMaterial == Material.anvil)
        {
            return true;
        }

        // shovel stuff
        if (block == Block.snow)
        {
            return true;
        }

        if (block == Block.blockSnow)
        {
            return true;
        }

        return false;
    }

}
