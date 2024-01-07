package jiraiyah.temp_mod;

import jiraiyah.temp_mod.references.ModWorldGeneration;
import jiraiyah.temp_mod.references.*;
import net.fabricmc.api.ModInitializer;

import static jiraiyah.temp_mod.references.Reference.*;

// This is the flat world gen custom preset I always use
// 5*minecraft:bedrock,30*minecraft:light_blue_wool,minecraft:light_blue_carpet;minecraft:plains;village

public class Main implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        LOGGER.info(">>> Initializing");

        ModItems.register();
        ModBlocks.register();
        ModItemGroups.register();
        ModCommands.register();
        ModBlockEntities.register();
        ModScreenHandlers.register();
        ModRecipes.register();
        ModWorldGeneration.register();
        ModMessages.registerC2SPackets();
        ModEffects.register();
    }
}