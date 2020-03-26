package com.cosmicparticl.bloodfruit.util;

import com.cosmicparticl.bloodfruit.block.BlockHolder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)


public class clientsetup {
    @SubscribeEvent
    public static void clientRegistry(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockHolder.meatflower, RenderType.getCutout());
    }
}
