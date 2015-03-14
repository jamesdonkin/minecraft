package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TorBlock extends Block
{
	private final String name = "torBlock";

	public TorBlock()
	{
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(JDLearningMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);		
	}
	

	public String getName()
	{
		return name;
	}
}
