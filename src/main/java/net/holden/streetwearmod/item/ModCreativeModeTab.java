package net.holden.streetwearmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab STREETWEAR_TAB = new CreativeModeTab("streetweartab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HYPE_FRAGMENT.get());
        }
    };
}
