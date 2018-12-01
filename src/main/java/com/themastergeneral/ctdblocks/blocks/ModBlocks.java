package com.themastergeneral.ctdblocks.blocks;

import com.themastergeneral.ctdcore.block.RegisterBlock;

import net.minecraft.block.material.Material;

public class ModBlocks extends RegisterBlock {
	public static BlockClass black_cobble;
	public static BlockClass blue_tile;
	public static BlockClass cable_mess;
	public static BlockClass carpet;
	public static BlockClass dense_ice;
	public static BlockClass gray_dense_bricks;
	public static BlockClass gray_planks;
	public static BlockClass gray_planks_2;
	public static BlockClass gray_tile;
	public static BlockClass green_tile;
	public static BlockClass industrial_lamp;
	public static BlockClass lush_grass;
	public static BlockClass metal_drain;
	public static BlockClass metal_siding;
	public static BlockClass red_planks;
	public static BlockClass red_tile;
	public static BlockClass rustic_hatch;
	public static BlockClass snow_drift;
	public static BlockClass steel_box;
	public static BlockClass stone_bricks_grey;
	public static BlockClass stone_bricks_tight;
	public static BlockClass white_brick;
	public static BlockClass white_tile;
	public static BlockClass wood_flooring;

	public static void loadBlocks() {
		industrial_lamp = register(new BlockClass(Material.IRON, "industrial_lamp"));
		black_cobble = register(new BlockClass(Material.GROUND, "black_cobble"));
		rustic_hatch = register(new BlockClass(Material.IRON, "rustic_hatch"));
		steel_box = register(new BlockClass(Material.IRON, "steel_box"));
		cable_mess = register(new BlockClass(Material.CIRCUITS, "cable_mess"));
		blue_tile = register(new BlockClass(Material.GROUND, "blue_tile"));
		carpet = register(new BlockClass(Material.CARPET, "carpet"));
		dense_ice = register(new BlockClass(Material.ICE, "dense_ice"));
		gray_dense_bricks = register(new BlockClass(Material.GROUND, "gray_dense_bricks"));
		gray_planks = register(new BlockClass(Material.WOOD, "gray_planks"));
		gray_planks_2 = register(new BlockClass(Material.WOOD, "gray_planks_2"));
		gray_tile = register(new BlockClass(Material.GROUND, "gray_tile"));
		lush_grass = register(new BlockClass(Material.GROUND, "lush_grass"));
		metal_drain = register(new BlockClass(Material.IRON, "metal_drain"));
		metal_siding = register(new BlockClass(Material.IRON, "metal_siding"));
		red_planks = register(new BlockClass(Material.WOOD, "red_planks"));
		red_tile = register(new BlockClass(Material.GROUND, "red_tile"));
		snow_drift = register(new BlockClass(Material.SNOW, "snow_drift"));
		stone_bricks_grey = register(new BlockClass(Material.GROUND, "stone_bricks_grey"));
		stone_bricks_tight = register(new BlockClass(Material.GROUND, "stone_bricks_tight"));
		white_brick = register(new BlockClass(Material.GROUND, "white_brick"));
		white_tile = register(new BlockClass(Material.GROUND, "white_tile"));
		wood_flooring = register(new BlockClass(Material.GROUND, "wood_flooring"));
	}
}
