package jiraiyah.temp_mod.references;

import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reference
{
    public static String ModID = "zxc_tutorial";
    public static final Logger LOGGER = LoggerFactory.getLogger("zxc_tutorial");

    @NotNull
    public static Identifier identifier(@NotNull String path)
    {
        return new Identifier(ModID, path);
    }

    public static MutableText translate(String key, Object ... params)
    {
        return Text.translatable(ModID + "." + key, params);
    }

    public static class ModTags
    {
        public static class Blocks
        {

        }

        public static class Items
        {

        }

        public static class Entities
        {

        }
    }
}