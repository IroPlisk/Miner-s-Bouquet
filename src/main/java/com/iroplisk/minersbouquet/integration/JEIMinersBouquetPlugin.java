package com.iroplisk.minersbouquet.integration;

import com.iroplisk.minersbouquet.MinersBouquet;
import com.iroplisk.minersbouquet.recipe.BaseVaseRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIMinersBouquetPlugin implements IModPlugin {

    public static RecipeType<BaseVaseRecipe> RECIPE_TYPE =
        new RecipeType<>(BaseVaseRecipeCategory.UID, BaseVaseRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(MinersBouquet.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                BaseVaseRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<BaseVaseRecipe> baseVaseRecipes = rm.getAllRecipesFor(BaseVaseRecipe.Type.INSTANCE);
        registration.addRecipes(RECIPE_TYPE, baseVaseRecipes);
    }
}
