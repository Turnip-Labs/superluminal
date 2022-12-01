package turniplabs.superluminal;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Superluminal implements ModInitializer {
    public static final String MOD_ID = "superluminal";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static String name(String name) {
        return Superluminal.MOD_ID + "." + name;
    }

    @Override
    public void onInitialize() {
        LOGGER.info("Superluminal initialized.");
    }
}
