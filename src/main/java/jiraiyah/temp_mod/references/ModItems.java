package jiraiyah.temp_mod.references;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static jiraiyah.temp_mod.Reference.identifier;
import static jiraiyah.temp_mod.Reference.log;

public class ModItems
{
    public ModItems()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering Items");
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, identifier(name), item);
    }
}