package growthcraft.milk.api.processing.cheesepress;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import growthcraft.core.api.item.ItemTest;
import growthcraft.milk.GrowthcraftMilk;
import net.minecraft.item.ItemStack;

public class CheesePressRegistry
{
	private List<ICheesePressRecipe> recipes = new ArrayList<ICheesePressRecipe>();

	public void addRecipe(@Nonnull ICheesePressRecipe recipe)
	{
		GrowthcraftMilk.logger.debug("Adding new cheese press recipe {%s}", recipe);
		recipes.add(recipe);
	}

	public void addRecipe(@Nonnull ItemStack stack, @Nonnull ItemStack output, int time)
	{
		addRecipe(new CheesePressRecipe(stack, output, time));
	}

	public ICheesePressRecipe findRecipe(@Nullable ItemStack stack)
	{
		if (ItemTest.isValid(stack))
		{
			for (ICheesePressRecipe recipe : recipes)
			{
				if (recipe.isMatchingRecipe(stack)) return recipe;
			}
		}
		return null;
	}
}
