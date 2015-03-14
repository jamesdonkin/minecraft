package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TeddyBearItem extends Item
{
	private final String name = "teddy-bear";

	public TeddyBearItem()
	{
		super();
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(JDLearningMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabDecorations);
		this.setMaxStackSize(99);
	}

	public String getName()
	{
		return name;
	}
}
