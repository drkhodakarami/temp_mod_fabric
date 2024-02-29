package jiraiyah.temp_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

import static jiraiyah.temp_mod.Reference.logRGB256;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        logRGB256("Generating Block Model Data", 0, 255, 0);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        logRGB256("Generating Item Model Data", 0, 255, 0);
    }
}