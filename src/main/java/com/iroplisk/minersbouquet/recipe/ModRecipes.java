package com.iroplisk.minersbouquet.recipe;

import com.iroplisk.minersbouquet.MinersBouquet;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MinersBouquet.MODID);

    public static final RegistryObject<RecipeSerializer<BaseVaseRecipe>> BASE_VASE_SERIALIZER =
            SERIALIZERS.register("base_vase", () -> BaseVaseRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
