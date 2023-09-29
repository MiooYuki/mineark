package com.miooyuki.mineark;

import com.miooyuki.mineark.items.ModItems;
import net.fabricmc.api.ModInitializer;
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
