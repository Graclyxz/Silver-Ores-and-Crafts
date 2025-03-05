package com.graclyxz.many_more_ores_and_crafts.init;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.List;

import static com.graclyxz.many_more_ores_and_crafts.init.ModMaterials.Armor;
import static com.graclyxz.many_more_ores_and_crafts.init.ModMaterials.Tool;
import static com.graclyxz.many_more_ores_and_crafts.init.ModRegisters.*;


public class ModItems {

    /*-*-*-*-*-*-*-*-* Item and Blocks creation *-*-*-*-*-*-*-*-*/

    /* **** Items Register ****/
    /* 1. Items Name 
       2. Items ToolMaterial 
       3. Items ArmorMaterial 
       4. Tools attributes float[]: sword, pickaxe, axe, hoe, shovel 
       5. Item propeties */

    /* **** Blocks Register ****/
    /* 1. Blocks Name 
       2. Strength ore ottribute 
       3. Ore Sound
       4. BlockBehaviour prpeties
       5. Item propeties */

    public static final List<Item> SILVER_ITEMS = registerAllItems("silver", Tool.SILVER, Armor.SILVER,
            new float[]{5f, -2f}, new float[]{3f, -2.8f}, new float[]{6f, -3.1f}, new float[]{0, 0f}, new float[]{3.5f, -3f},
            new Item.Properties());
    public static final List<Block> SILVER_BLOCKS = registerAllBlocks("silver",  new float[]{4f, 6f}, SoundType.STONE,
            BlockBehaviour.Properties.of(),
            new Item.Properties());

    public static void init() {
    }
}
