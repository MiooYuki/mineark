package com.miooyuki.mineark;

import com.miooyuki.mineark.items.ModItems;
import com.miooyuki.mineark.items.OriginitePrimeItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MineArk implements ModInitializer {

	public static final String MOD_ID = "mineark";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}

}
