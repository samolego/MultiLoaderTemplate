package org.samo_lego.template;

import org.samo_lego.template.platform_specific.Platform;

public class Template {

    private static Platform PLATFORM_INSTANCE;

    /**
     * Initializes the mod.
     * @param platform platformer instance
     */
    public static void init(Platform platform) {
        PLATFORM_INSTANCE = platform;
        System.out.println("Hello World!");
    }

    /**
     * Gets the platformer instance.
     * @return platformer instance.
     */
    public static Platform getPlatformer() {
        return PLATFORM_INSTANCE;
    }
}
