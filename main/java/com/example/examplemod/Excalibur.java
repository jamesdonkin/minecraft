package com.example.examplemod;

import com.google.common.collect.Multimap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Excalibur extends ItemSword
{
	private final String name = "excalibur";
	private final static int EXCALIBUR_DAMAGE = 100;
    
	public Excalibur()
	{
		super(Item.ToolMaterial.EMERALD);		
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(JDLearningMod.MODID + "_" + name);	
	}	 

    /**
     * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
     */
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double)EXCALIBUR_DAMAGE, 0));
        return multimap;
    }
    
	public String getName()
	{
		return name;
	}
}
