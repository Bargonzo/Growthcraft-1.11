package growthcraft.cellar.api.processing.brewing;

import javax.annotation.Nullable;

import growthcraft.cellar.api.processing.common.IProcessingRecipe;
import growthcraft.core.api.definition.IMultiItemStacks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public interface IBrewingRecipe extends IProcessingRecipe  {
	IMultiItemStacks getInputItemStack();
	FluidStack getInputFluidStack();
	boolean matchesRecipe(@Nullable FluidStack fluidStack, @Nullable ItemStack itemStack);
	boolean matchesIngredient(@Nullable FluidStack fluidStack);
	boolean matchesIngredient(@Nullable ItemStack stack);
	boolean isItemIngredient(@Nullable ItemStack stack);
}
