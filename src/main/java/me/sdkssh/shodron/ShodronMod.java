package me.sdkssh.shodron;

import me.sdkssh.shodron.registeries.BlockRegisteries;
import me.sdkssh.shodron.registeries.ItemRegisteries;
import me.sdkssh.shodron.tab.ShodronTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("shodron")
public class ShodronMod {
    public static final String MOD_ID = "shodron";
    public static final CreativeModeTab TAB = new ShodronTab();
    public ShodronMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegisteries.getItems().register(bus);
        BlockRegisteries.getBlocks().register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
