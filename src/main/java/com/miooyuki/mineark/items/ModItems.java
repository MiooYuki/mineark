package com.miooyuki.mineark.items;

import com.miooyuki.mineark.MineArk;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ORIGINITE_PRIME = registerItem("originite_prime",
            new OriginitePrimeItem(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MineArk.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MineArk.LOGGER.info("Registering Mod Items for " + MineArk.MOD_ID);
    }

}
