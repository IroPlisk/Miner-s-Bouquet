package com.iroplisk.minersbouquet.creativetabs;

import com.iroplisk.minersbouquet.block.Blocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class BlockCreativeTab extends CreativeModeTab {

    public static final BlockCreativeTab MINERS_BOUQUET_CREATIVE_BLOCK_TAB = new BlockCreativeTab(CreativeModeTab.TABS.length, "minersbouquet_blocks");

    private BlockCreativeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Blocks.BASE_VASE.get());
    }
}
