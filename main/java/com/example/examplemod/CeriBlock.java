package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CeriBlock extends Block
{
	private final String name = "ceriBlock";

	public CeriBlock()
	{
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		System.out.println("Registered Triforce Block");
		setUnlocalizedName(JDLearningMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);		
		}
	

	public String getName()
	{
		return name;
	}	
}
