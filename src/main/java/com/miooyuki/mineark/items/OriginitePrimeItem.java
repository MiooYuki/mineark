package com.miooyuki.mineark.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OriginitePrimeItem extends Item {

    public OriginitePrimeItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText(ModItems.ORIGINITE_PRIME.getTranslationKey() + ".tooltip_1"));
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText(ModItems.ORIGINITE_PRIME.getTranslationKey() + ".tooltip_2").formatted(Formatting.GRAY));
            tooltip.add(new TranslatableText(ModItems.ORIGINITE_PRIME.getTranslationKey() + ".tooltip_3").formatted(Formatting.GRAY));
            tooltip.add(new TranslatableText(ModItems.ORIGINITE_PRIME.getTranslationKey() + ".tooltip_4").formatted(Formatting.GRAY));
            tooltip.add(new TranslatableText(ModItems.ORIGINITE_PRIME.getTranslationKey() + ".tooltip_5").formatted(Formatting.GRAY));
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (hand == Hand.MAIN_HAND) {
            user.playSound(BlockSoundGroup.ANVIL.getPlaceSound(), 10f, 10f);
        }
        return super.use(world, user, hand);
    }

}
