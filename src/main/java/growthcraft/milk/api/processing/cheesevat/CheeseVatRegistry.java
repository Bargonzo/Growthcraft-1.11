package growthcraft.milk.api.processing.cheesevat;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import growthcraft.core.api.definition.IMultiFluidStacks;
import growthcraft.core.api.definition.IMultiItemStacks;
import growthcraft.core.api.fluids.FluidTest;
import growthcraft.core.api.item.ItemTest;
import growthcraft.milk.GrowthcraftMilk;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class CheeseVatRegistry
{
	private List<ICheeseVatRecipe> recipes = new ArrayList<ICheeseVatRecipe>();

	public void addRecipe(ICheeseVatRecipe recipe)
	{
		recipes.add(recipe);
		GrowthcraftMilk.logger.debug("Added Cheese Vat recipe {%s}", recipe);
	}

	public void addRecipe(@Nonnull List<FluidStack> outputFluids, @Nonnull List<ItemStack> outputItems, @Nonnull List<IMultiFluidStacks> inputFluids, @Nonnull List<IMultiItemStacks> inputItems)
	{
		final CheeseVatRecipe recipe = new CheeseVatRecipe(outputFluids, outputItems, inputFluids, inputItems);
		addRecipe(recipe);
	}

	public boolean isFluidIngredient(@Nullable Fluid fluid)
	{
		if (!FluidTest.isValid(fluid)) return false;
		for (ICheeseVatRecipe recipe : recipes)
		{
			if (recipe.isFluidIngredient(fluid)) return true;
		}
		return false;
	}

	public boolean isFluidIngredient(@Nullable FluidStack fluid)
	{
		if (!FluidTest.isValid(fluid)) return false;
		for (ICheeseVatRecipe recipe : recipes)
		{
			if (recipe.isFluidIngredient(fluid)) return true;
		}
		return false;
	}

	public boolean isItemIngredient(@Nullable ItemStack item)
	{
		if (!ItemTest.isValid(item)) return false;
		for (ICheeseVatRecipe recipe : recipes)
		{
			if (recipe.isItemIngredient(item)) return true;
		}
		return false;
	}

	@Nullable
	public ICheeseVatRecipe findRecipe(@Nonnull List<FluidStack> fluids, @Nonnull List<ItemStack> stacks)
	{
		for (ICheeseVatRecipe recipe : recipes)
		{
			if (recipe.isMatchingRecipe(fluids, stacks))
			{
				return recipe;
			}
		}
		return null;
	}
}
