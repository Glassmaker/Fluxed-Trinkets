package com.jared.electrifiedtrinkets.client.render.gui.slot;

import java.util.ArrayList;
import java.util.List;

import com.jared.electrifiedtrinkets.ModInfo;
import com.jared.electrifiedtrinkets.items.ETItems;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

public class SlotCopperNugget extends Slot {

	public SlotCopperNugget(IInventory arg0, int arg1, int arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		List<ItemStack> list = OreDictionary.getOres("nuggetCopper");

		for (int i = 0; i < list.size(); i++) {
			if (OreDictionary.itemMatches(list.get(i), stack, true)) {
				return true;
			}

		}

		return false;
	}
}
