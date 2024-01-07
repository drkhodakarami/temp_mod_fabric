package jiraiyah.temp_mod;

import jiraiyah.temp_mod.references.ModMessages;
import jiraiyah.temp_mod.references.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;

public class Client implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        ModMessages.registerS2CPackets();

        ModModelPredicateProvider.register();
    }
}