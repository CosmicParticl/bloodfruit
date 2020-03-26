package com.cosmicparticl.bloodfruit.registries;

import com.cosmicparticl.bloodfruit.bloodfruit;
import com.google.common.base.Preconditions;
import com.cosmicparticl.bloodfruit.item.Foods;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(bloodfruit.MODID)
public class ItemRegistry {
    @Mod.EventBusSubscriber(modid = bloodfruit.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register {

        @SubscribeEvent
        public static void RegisterItems(final RegistryEvent.Register<Item> event) {
            final Item[] items = {

                    new Item((new Item.Properties()).group(bloodfruit.GROUP).maxStackSize(64).food(Foods.blood_fruit).rarity(Rarity.COMMON)).setRegistryName(bloodfruit.location("blood_fruit")),
                    new Item((new Item.Properties()).group(bloodfruit.GROUP).maxStackSize(64).rarity(Rarity.COMMON)).setRegistryName(bloodfruit.location("tendril"))
            };

            for (final Item item: items) {
                Preconditions.checkNotNull(item.getRegistryName(), "Block: %s has a NULL registry name", item);
                event.getRegistry().register(item);
            }
        }

    }
}
