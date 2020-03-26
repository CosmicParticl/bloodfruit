package com.cosmicparticl.bloodfruit.block;

import net.minecraft.block.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


    public class tendrilstone extends Block {

        public tendrilstone() {
            super(Properties.create(Material.ROCK)
                    .sound(SoundType.CORAL)
                    .hardnessAndResistance(1.5F)



            );
            setRegistryName("tendrilstone");

        }
    }
