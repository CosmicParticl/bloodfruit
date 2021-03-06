package com.cosmicparticl.bloodfruit.util;

import com.cosmicparticl.bloodfruit.bloodfruit;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.server.ServerLifecycleHooks;


@Mod.EventBusSubscriber(modid = bloodfruit.MODID)

public class LootHandler {

    @SubscribeEvent

    public static void lootLoad(LootTableLoadEvent evt) {

        String prefix = "minecraft:chests/";
        String name = evt.getName().toString();


		if (name.startsWith(prefix)) {
        String file = name.substring(name.indexOf(prefix) + prefix.length());
        switch (file) {




            case "nether_bridge":
             evt.getTable().addPool(getInjectPool(file));
             break;
            default: break;
        }
    }
}

    public static LootPool getInjectPool(String entryName) {
        return LootPool.builder()

                .addEntry(getInjectEntry(entryName, 1))
                .bonusRolls(0, 1)
                .name("bloodfruit_inject")
                .build();
    }

    private static LootEntry.Builder getInjectEntry(String name, int weight) {

        ResourceLocation table = new ResourceLocation(bloodfruit.MODID, "inject/" + name);
        return TableLootEntry.builder(table)
                .weight(weight);
    }

}
