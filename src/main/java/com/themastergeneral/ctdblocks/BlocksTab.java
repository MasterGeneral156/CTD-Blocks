package com.themastergeneral.ctdblocks;

import com.themastergeneral.ctdblocks.blocks.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksTab extends CreativeTabs
{

    public BlocksTab()
    {
        super(CTDBlocks.MODID);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModBlocks.industrial_lamp);
    }

    @Override
    public boolean hasSearchBar()
    {
        return false;
    }

}

