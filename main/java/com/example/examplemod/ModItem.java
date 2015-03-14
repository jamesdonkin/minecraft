package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItem extends Item
{
	private final String name = "jamesItem";

	public ModItem()
	{
		super();
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(JDLearningMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabMisc);
	}

	public String getName()
	{
		return name;
	}

}
