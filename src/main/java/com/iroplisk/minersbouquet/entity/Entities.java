package com.iroplisk.minersbouquet.entity;

import com.iroplisk.minersbouquet.MinersBouquet;
import com.iroplisk.minersbouquet.block.Blocks;
import com.iroplisk.minersbouquet.block.custom.VaseBlock;
import com.iroplisk.minersbouquet.entity.custom.BaseVaseBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Entities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MinersBouquet.MODID);


    public static final RegistryObject<BlockEntityType<BaseVaseBlockEntity>> BASE_VASE_ENTITY =
            BLOCK_ENTITIES.register("base_vase_entity", () ->
                    BlockEntityType.Builder.of(BaseVaseBlockEntity::new,
                            Blocks.BASE_VASE.get()).build(null));


    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
