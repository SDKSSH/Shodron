package me.sdkssh.shodron.registeries;

import lombok.Getter;
import me.sdkssh.shodron.ShodronMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ItemRegisteries {
    @Getter
    private static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, ShodronMod.MOD_ID);

    public static <T extends Item>RegistryObject<Item> registerItem(String name, Supplier<T> it){
        return items.register(name, it);
    }
}
