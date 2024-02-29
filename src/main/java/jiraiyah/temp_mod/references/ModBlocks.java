package jiraiyah.temp_mod.references;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static jiraiyah.temp_mod.Reference.identifier;
import static jiraiyah.temp_mod.Reference.log;

public class ModBlocks
{
    public ModBlocks()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering Blocks");
    }

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, identifier(name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, identifier(name),
                                 new BlockItem(block, new FabricItemSettings()));
    }
}