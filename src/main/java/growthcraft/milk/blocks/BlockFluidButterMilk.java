package growthcraft.milk.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

import growthcraft.core.common.block.GrowthcraftBlockFluid;

public class BlockFluidButterMilk extends GrowthcraftBlockFluid {

    public BlockFluidButterMilk(Fluid fluidButterMilk) {
        super(fluidButterMilk, Material.WATER);
//        this.setUnlocalizedName(unlocalizedName);
//        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
//        this.setCreativeTab(tabGrowthcraft);
        refreshColor();
    }

/*    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    } */

}
