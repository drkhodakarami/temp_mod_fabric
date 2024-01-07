package jiraiyah.temp_mod.references;

import jiraiyah.temp_mod.datagen.world.ModOreGeneration;

public class ModWorldGeneration
{
    public ModWorldGeneration()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        Reference.LOGGER.info(">>> Registering World Generation");

        ModOreGeneration.generateOres();
    }
}