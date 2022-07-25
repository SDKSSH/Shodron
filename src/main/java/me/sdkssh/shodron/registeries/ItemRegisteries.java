package me.sdkssh.shodron.registeries;

import lombok.Getter;
import me.sdkssh.shodron.ShodronMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegisteries {
    @Getter
    private static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, ShodronMod.MOD_ID);
}
