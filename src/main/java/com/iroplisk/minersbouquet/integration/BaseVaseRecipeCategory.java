package com.iroplisk.minersbouquet.integration;

import com.iroplisk.minersbouquet.MinersBouquet;
import com.iroplisk.minersbouquet.block.Blocks;
import com.iroplisk.minersbouquet.recipe.BaseVaseRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class BaseVaseRecipeCategory implements IRecipeCategory<BaseVaseRecipe> {

    public final static ResourceLocation UID = new ResourceLocation(MinersBouquet.MODID, "base_vase");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(MinersBouquet.MODID, "textures/gui/base_vase.png");

    private final IDrawable background;
    private final IDrawable icon;

    public BaseVaseRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 166);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(Blocks.BASE_VASE.get()));
    }

    @Override
    public RecipeType<BaseVaseRecipe> getRecipeType() {
        return JEIMinersBouquetPlugin.RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Base Vase");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, BaseVaseRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 79, 28).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 142, 38).addItemStack(recipe.getResultItem());
    }
}
