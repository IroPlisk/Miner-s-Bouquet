package com.iroplisk.minersbouquet.item;

import com.iroplisk.minersbouquet.MinersBouquet;
import com.iroplisk.minersbouquet.creativetabs.ItemCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, MinersBouquet.MODID);

        // Items
        public static final RegistryObject<Item> TROWEL = ITEMS.register("trowel",
                () -> new Item(new Item.Properties().tab(ItemCreativeTab.MINERS_BOUQUET_CREATIVE_ITEM_TAB)));

        // Soils
        public static final RegistryObject<Item> BASE_SOIL = ITEMS.register("base_soil",
                () -> new Item(new Item.Properties().stacksTo(4).tab(ItemCreativeTab.MINERS_BOUQUET_CREATIVE_ITEM_TAB)));

        // Seeds
        public static final RegistryObject<Item> LAVANDER_SEEDS = ITEMS.register("lavander_seeds",
                () -> new Item(new Item.Properties().stacksTo(1).tab(ItemCreativeTab.MINERS_BOUQUET_CREATIVE_ITEM_TAB)));

        public static final RegistryObject<Item> MARIGOLD_SEEDS = ITEMS.register("marigold_seeds",
                () -> new Item(new Item.Properties().stacksTo(1).tab(ItemCreativeTab.MINERS_BOUQUET_CREATIVE_ITEM_TAB)));

        // Fruits/Flowers
        public static final RegistryObject<Item> LAVANDER = ITEMS.register("lavander",
                () -> new Item(new Item.Properties().tab(ItemCreativeTab.MINERS_BOUQUET_CREATIVE_ITEM_TAB)));
        public static final RegistryObject<Item> MARIGOLD = ITEMS.register("marigold",
                () -> new Item(new Item.Properties().stacksTo(1).tab(ItemCreativeTab.MINERS_BOUQUET_CREATIVE_ITEM_TAB)));

        public static final RegistryObject<Item> MARIGOLD = ITEMS.register("marigold",
                () -> new Item(new Item.Properties().stacksTo(1).tab(ItemCreativeTab.MINERS_BOUQUET_CREATIVE_ITEM_TAB)));


        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
