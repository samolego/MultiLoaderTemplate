package org.samo_lego.template;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.samo_lego.template.platform_specific.Platform;

public class Template {

    private static final String MOD_ID = "template";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    private static Platform PLATFORM_INSTANCE;

    /**
     * Initializes the mod.
     * @param platform platformer instance
     */
    public static void init(Platform platform) {
        PLATFORM_INSTANCE = platform;
        LOGGER.info("Hello World!");
    }

    /**
     * Gets the platformer instance.
     * @return platformer instance.
     */
    public static Platform getPlatform() {
        return PLATFORM_INSTANCE;
    }
}
