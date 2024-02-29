package jiraiyah.temp_mod.references.world;

import static jiraiyah.temp_mod.Reference.log;

public class ModWorldGeneration
{
    public ModWorldGeneration()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering World Generation");

        ModGeodeGeneration.generate();
        ModOreGeneration.generate();
        ModTreeGeneration.generate();
        ModFlowerGeneration.generate();
        ModEntitySpawns.addSpawns();
    }
}