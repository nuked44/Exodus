package com.nuked.exodus.core.init;

import com.nuked.exodus.Exodus;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Exodus.MOD_ID);
	
	//Items #################################
	
	public static final RegistryObject<Item> DABABY_CAR = ITEMS.register("dababy_car", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	//Tools #################################
	
	
	
	//Armor #################################
	
	}
