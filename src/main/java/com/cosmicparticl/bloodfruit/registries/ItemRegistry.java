package com.cosmicparticl.bloodfruit.registries;

import com.cosmicparticl.bloodfruit.bloodfruit;
import com.cosmicparticl.bloodfruit.item.parasitemark;
import com.google.common.base.Preconditions;
import com.cosmicparticl.bloodfruit.item.Foods;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(bloodfruit.MODID)
public class ItemRegistry {
    @Mod.EventBusSubscriber(modid = bloodfruit.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

    public static class Register {

        public static final IArmorMaterial parasitematerial = new IArmorMaterial() {
            @Override
            public int getDurability(EquipmentSlotType slotIn) {
                return 1000;
            }

            @Override
            public int getDamageReductionAmount(EquipmentSlotType slotIn) {
                return 4;
            }

            @Override
            public int getEnchantability() {
                return 20;
            }

            @Override
            public SoundEvent getSoundEvent() {
                return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return Ingredient.fromItems(Items.ROTTEN_FLESH);
            }

            @Override
            public String getName() {
                return "bloodfruit:parasitematerial";
            }

            @Override
            public float getToughness() {
                return 2;
            }
        };

        @SubscribeEvent
        public static void RegisterItems(final RegistryEvent.Register<Item> event) {
            final Item[] items = {

                    new Item((new Item.Properties()).group(bloodfruit.GROUP).maxStackSize(64).food(Foods.blood_fruit).rarity(Rarity.COMMON)).setRegistryName(bloodfruit.location("blood_fruit")),
                    new Item((new Item.Properties()).group(bloodfruit.GROUP).maxStackSize(64).rarity(Rarity.COMMON)).setRegistryName(bloodfruit.location("tendril")),
                    new parasitemark(parasitematerial,
                            EquipmentSlotType.CHEST,
                            (new Item.Properties()).group(bloodfruit.GROUP).rarity(Rarity.COMMON)).setRegistryName(bloodfruit.location("parasitemark"))




            };

            for (final Item item: items) {
                Preconditions.checkNotNull(item.getRegistryName(), "Item: %s has a NULL registry name", item);
                event.getRegistry().register(item);
            }
        }
    }
}
