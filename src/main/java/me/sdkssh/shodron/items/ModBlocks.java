package me.sdkssh.shodron.items;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;

import static me.sdkssh.shodron.registeries.BlockRegisteries.*;

public class ModBlocks {
    public static final RegistryObject<Block> SHODRITE_ORE = registerBlock("shodrite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(16F)));
}
