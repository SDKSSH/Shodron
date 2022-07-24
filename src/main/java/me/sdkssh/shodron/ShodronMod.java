package me.sdkssh.shodron;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("shodron")
public class ShodronMod
{
    public ShodronMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
