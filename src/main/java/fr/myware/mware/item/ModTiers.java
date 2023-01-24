package fr.myware.mware.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier FORGED_STEEL = new ForgeTier(4, 80000, 1.5f,
            7f, 18,BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.FORGED_STEEL.get()));
}