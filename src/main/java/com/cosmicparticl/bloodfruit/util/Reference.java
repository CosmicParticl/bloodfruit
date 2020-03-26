package com.cosmicparticl.bloodfruit.util;

import net.minecraft.util.ResourceLocation;

public class Reference
{
    public static final String MODID = "bloodfruit";

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(MODID, name);
    }
}