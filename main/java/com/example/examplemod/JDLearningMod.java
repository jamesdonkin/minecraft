package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = JDLearningMod.MODID, version = JDLearningMod.VERSION)
public class JDLearningMod
{

	public static final String MODID = "jd_mod";
	public static final String VERSION = "1.0";

	private Item jamesItem;
	private TeddyBearItem bearItem;
	private TriforceBlock triforceBlock;
	private CeriBlock ceriBlock;
	private TorBlock torBlock;
	private MudBlock mudBlock;
	private Excalibur sword;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		jamesItem = new ModItem();
		bearItem = new TeddyBearItem();
		triforceBlock = new TriforceBlock();
		ceriBlock = new CeriBlock();
		torBlock = new TorBlock();
		mudBlock = new MudBlock();
		sword = new Excalibur();
	}
	

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		if (event.getSide() == Side.CLIENT)
		{
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

			renderItem.getItemModelMesher().register(
					sword,
					0,
					new ModelResourceLocation(MODID + ":"
							+ sword.getName(), "inventory"));

			renderItem.getItemModelMesher().register(
					jamesItem,
					0,
					new ModelResourceLocation(MODID + ":"
							+ ((ModItem) jamesItem).getName(), "inventory"));
			
			renderItem.getItemModelMesher().register(
					bearItem,
					0,
					new ModelResourceLocation(MODID + ":"
							+ bearItem.getName(), "inventory"));

			renderItem.getItemModelMesher().register(
					Item.getItemFromBlock(triforceBlock),
					0,
					new ModelResourceLocation(MODID + ":"
							+ triforceBlock.getName(),
							"inventory"));
			
			renderItem.getItemModelMesher().register(
					Item.getItemFromBlock(ceriBlock),
					0,
					new ModelResourceLocation(MODID + ":"
							+ ceriBlock.getName(),
							"inventory"));			

			renderItem.getItemModelMesher().register(
					Item.getItemFromBlock(torBlock),
					0,
					new ModelResourceLocation(MODID + ":"
							+ torBlock.getName(),
							"inventory"));		
			
			renderItem.getItemModelMesher().register(
					Item.getItemFromBlock(mudBlock),
					0,
					new ModelResourceLocation(MODID + ":"
							+ mudBlock.getName(),
							"inventory"));			
		}
	}

}
