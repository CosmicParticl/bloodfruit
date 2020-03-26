package com.cosmicparticl.bloodfruit.block;

import com.cosmicparticl.bloodfruit.registries.bloodfruitsounds;
import com.cosmicparticl.bloodfruit.tags.bloodfruittags;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.SoundType;
import net.minecraft.block.BushBlock;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import com.cosmicparticl.bloodfruit.item.ItemHolder;



public class meatflower extends BushBlock {



    public meatflower() {
        super(Properties.create(Material.ORGANIC)
                .sound(SoundType.CORAL)
                .hardnessAndResistance(0F, 0F)
                .doesNotBlockMovement()
                .notSolid()


        );
        setRegistryName("meatflower");

    }


    @SuppressWarnings("deprecation")
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity entity, Hand hand, BlockRayTraceResult p_225533_6_) {
        ItemStack itemstack = entity.getHeldItem(hand);
        if (itemstack.getItem() == Items.ROTTEN_FLESH) {
            worldIn.playSound(entity,
                    entity.getPosX(),
                    entity.getPosY(),
                    entity.getPosZ(),
                    bloodfruitsounds.meat_chomp,
                    SoundCategory.NEUTRAL,
                    1.0F,
                    1.0F);
            IItemProvider tendril = ItemHolder.tendril;
            spawnAsEntity(worldIn, pos, new ItemStack(tendril,1));
            itemstack.shrink(1);
            return ActionResultType.SUCCESS;

        }
       else if (itemstack.getItem() == Items.WITHER_ROSE) {
            worldIn.playSound(entity,
                    entity.getPosX(),
                    entity.getPosY(),
                    entity.getPosZ(),
                    bloodfruitsounds.meat_scream,
                    SoundCategory.NEUTRAL,
                    1.0F,
                    1.0F);

            spawnAsEntity(worldIn, pos, new ItemStack(Items.WITHER_SKELETON_SKULL,1));
            itemstack.shrink(1);
            return ActionResultType.SUCCESS;


        }
        else if (itemstack.getItem() == Items.CAKE) {
            worldIn.playSound(entity,
                    entity.getPosX(),
                    entity.getPosY(),
                    entity.getPosZ(),
                    bloodfruitsounds.meat_scream,
                    SoundCategory.NEUTRAL,
                    1.0F,
                    1.0F);

            spawnAsEntity(worldIn, pos, new ItemStack(Items.PLAYER_HEAD,1));
            itemstack.shrink(1);
            return ActionResultType.SUCCESS;


        }
        else if (bloodfruittags.meatflower_eat.contains(itemstack.getItem())) {
            worldIn.playSound(entity,
                    entity.getPosX(),
                    entity.getPosY(),
                    entity.getPosZ(),
                    bloodfruitsounds.meat_chomp,
                    SoundCategory.NEUTRAL,
                    1.0F,
                    1.0F);

            spawnAsEntity(worldIn, pos, new ItemStack(Items.BONE,3));
            itemstack.shrink(1);
            return ActionResultType.SUCCESS;


        }
        else if (itemstack.getItem() == Items.RABBIT) {
            worldIn.playSound(entity,
                    entity.getPosX(),
                    entity.getPosY(),
                    entity.getPosZ(),
                    bloodfruitsounds.meat_chomp,
                    SoundCategory.NEUTRAL,
                    1.0F,
                    1.0F);

            spawnAsEntity(worldIn, pos, new ItemStack(Items.RABBIT_HIDE,12));
            itemstack.shrink(1);
            return ActionResultType.SUCCESS;


        }
        else {
            return super.onBlockActivated(state, worldIn, pos, entity, hand, p_225533_6_);
        }
    }


    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return bloodfruittags.meatflower_sustain.contains(block);
    }



    }