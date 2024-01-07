package jiraiyah.temp_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static jiraiyah.temp_mod.references.Reference.LOGGER;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg)
    {
        LOGGER.info(">>> Generating Block Tag Data");

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4"))); // Netherite

        getOrCreateTagBuilder(BlockTags.LOGS);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN);

        getOrCreateTagBuilder(BlockTags.COPPER_ORES);
        getOrCreateTagBuilder(BlockTags.REDSTONE_ORES);
        getOrCreateTagBuilder(BlockTags.LAPIS_ORES);
        getOrCreateTagBuilder(BlockTags.IRON_ORES);
        getOrCreateTagBuilder(BlockTags.DIAMOND_ORES);
        getOrCreateTagBuilder(BlockTags.GOLD_ORES);
        getOrCreateTagBuilder(BlockTags.COAL_ORES);
        getOrCreateTagBuilder(BlockTags.EMERALD_ORES);
    }
}