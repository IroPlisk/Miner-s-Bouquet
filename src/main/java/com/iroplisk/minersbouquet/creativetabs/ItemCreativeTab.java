package com.iroplisk.minersbouquet.creativetabs;

import com.iroplisk.minersbouquet.item.Items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemCreativeTab extends CreativeModeTab {

    public static final ItemCreativeTab MINERS_BOUQUET_CREATIVE_ITEM_TAB = new ItemCreativeTab(CreativeModeTab.TABS.length, "minersbouquet_items");

    private ItemCreativeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.BASE_SOIL.get());
    }

}
