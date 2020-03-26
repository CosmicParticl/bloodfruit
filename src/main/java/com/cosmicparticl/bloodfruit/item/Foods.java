package com.cosmicparticl.bloodfruit.item;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;


public class Foods {
    public static final Food blood_fruit = (new Food.Builder()).hunger(2).saturation(0.2F).effect(new EffectInstance(Effects.HEALTH_BOOST,10800, 1), 1F).effect(new EffectInstance(Effects.HUNGER,900, 0), 1F).setAlwaysEdible().build();
        }
