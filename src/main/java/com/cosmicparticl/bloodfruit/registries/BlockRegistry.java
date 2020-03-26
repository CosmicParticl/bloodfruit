package com.cosmicparticl.bloodfruit.registries;
import com.cosmicparticl.bloodfruit.block.BlockHolder;
import com.cosmicparticl.bloodfruit.block.meatflower;
import com.cosmicparticl.bloodfruit.block.tendrilstone;
import com.cosmicparticl.bloodfruit.bloodfruit;
import com.google.common.base.Preconditions;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

public class BlockRegistry {
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {

            event.getRegistry().register(new meatflower());
            event.getRegistry().register(new tendrilstone());
        }


        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {

            event.getRegistry().register(new BlockItem(BlockHolder.meatflower, new Item.Properties().group(bloodfruit.GROUP)).setRegistryName("meatflower"));
            event.getRegistry().register(new BlockItem(BlockHolder.tendrilstone, new Item.Properties().group(bloodfruit.GROUP)).setRegistryName("tendrilstone"));
        }

    }
}
