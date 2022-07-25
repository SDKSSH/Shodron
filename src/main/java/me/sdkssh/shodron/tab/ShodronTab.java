package me.sdkssh.shodron.tab;

import me.sdkssh.shodron.ShodronMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ShodronTab extends CreativeModeTab {
    public ShodronTab() {
        super(ShodronMod.MOD_ID);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.NETHERITE_AXE);
    }
}
