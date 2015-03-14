package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TriforceBlock extends Block
{
	private final String name = "triforceBlock";
	
	public TriforceBlock()
	{
		super(Material.glass);
		GameRegistry.registerBlock(this, name);
		System.out.println("Registered Triforce Block");
		setUnlocalizedName(JDLearningMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);		
		this.setHardness(20);
		this.setLightOpacity(1);
		this.setStepSound(Block.soundTypeGlass);
		this.setLightLevel(10000);
		this.translucent = true;
		
	}
	
	public String getName()
	{
		return name;
	}
}
