package com.cosmicparticl.bloodfruit.registries;

import com.cosmicparticl.bloodfruit.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.cosmicparticl.bloodfruit.bloodfruit.MODID;


@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class bloodfruitsounds {
    public static final SoundEvent meat_chomp = makeSoundEvent("meat_chomp");
    public static final SoundEvent meat_scream = makeSoundEvent("meat_scream");
    @SubscribeEvent
    public static void onRegisterSounds(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().registerAll(
               meat_chomp,
                meat_scream
        );
    }

    private static SoundEvent makeSoundEvent(String name) {
        SoundEvent sound = new SoundEvent(new ResourceLocation(MODID,name));
        sound.setRegistryName(new ResourceLocation(MODID, name));
        return sound;
    }
}