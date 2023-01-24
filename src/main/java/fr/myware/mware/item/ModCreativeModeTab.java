package fr.myware.mware.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MY_WARE_TAB = new CreativeModeTab("mywaretab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ICON.get());
        }
    };
}

