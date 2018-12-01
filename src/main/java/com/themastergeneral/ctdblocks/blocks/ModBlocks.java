package com.themastergeneral.ctdblocks.blocks;

import com.themastergeneral.ctdcore.block.RegisterBlock;

import net.minecraft.block.material.Material;

public class ModBlocks extends RegisterBlock {
	public static BlockClass industrial_lamp;

	public static void loadBlocks() {
		industrial_lamp = register(new BlockClass(Material.IRON, "industrial_lamp"));
	}
}
