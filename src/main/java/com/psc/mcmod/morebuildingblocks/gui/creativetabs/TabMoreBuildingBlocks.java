package com.psc.mcmod.morebuildingblocks.gui.creativetabs;

import com.psc.mcmod.morebuildingblocks.MoreBuildingBlocks;
import com.psc.mcmod.morebuildingblocks.blocks.BlocksInstance;
import com.psc.mcmod.morebuildingblocks.items.ItemsInstance;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TabMoreBuildingBlocks extends CreativeTabs {

	public TabMoreBuildingBlocks() {
		super("mbbTabMain");
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(BlocksInstance.blockSmallStoneBrick);
	}

}
