package com.iroplisk.minersbouquet.block;

import com.iroplisk.minersbouquet.MinersBouquet;
import com.iroplisk.minersbouquet.block.custom.VaseBlock;
import com.iroplisk.minersbouquet.creativetabs.BlockCreativeTab;
import com.iroplisk.minersbouquet.creativetabs.ItemCreativeTab;
import com.iroplisk.minersbouquet.item.Items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

import java.util.function.Supplier;

public class Blocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MinersBouquet.MODID);

    public static final RegistryObject<Block> BASE_VASE = registerBlock("base_vase",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(1.0f).sound(SoundType.BONE_BLOCK).noOcclusion()), BlockCreativeTab.MINERS_BOUQUET_CREATIVE_BLOCK_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
