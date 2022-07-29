package me.sdkssh.shodron.registeries;

import lombok.Getter;
import me.sdkssh.shodron.ShodronMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockRegisteries {
    @Getter
    private static final DeferredRegister<Block> blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, ShodronMod.MOD_ID);

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> s){
        RegistryObject<T> tor = blocks.register(name, s);
        ItemRegisteries.registerItem(name, () -> new BlockItem(s.get(), new Item.Properties().tab(ShodronMod.TAB)));
        return tor;


    }
}
