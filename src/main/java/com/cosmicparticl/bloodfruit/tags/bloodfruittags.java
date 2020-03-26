package com.cosmicparticl.bloodfruit.tags;


import com.cosmicparticl.bloodfruit.bloodfruit;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class bloodfruittags {

    public static final Tag<Block> meatflower_sustain = BlockTags.getCollection().getOrCreate(new ResourceLocation(bloodfruit.MODID, "meatflower_sustain"));

    public static final Tag<Item> meatflower_eat = ItemTags.getCollection().getOrCreate(new ResourceLocation(bloodfruit.MODID, "meatflower_eat"));

}
