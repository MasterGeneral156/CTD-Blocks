package com.themastergeneral.ctdblocks.blocks;

import com.themastergeneral.ctdblocks.CTDBlocks;
import com.themastergeneral.ctdcore.block.CTDBlock;

import net.minecraft.block.material.Material;

public class BlockClass extends CTDBlock
{

    public BlockClass(Material materialIn, String name)
    {
        super(materialIn, name, CTDBlocks.MODID);
        this.setCreativeTab(CTDBlocks.creativeTab);
    }

}
