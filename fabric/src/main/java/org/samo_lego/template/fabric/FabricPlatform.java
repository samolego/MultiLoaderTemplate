package org.samo_lego.template.fabric;

import net.minecraft.server.level.ServerPlayer;
import org.samo_lego.template.platform_specific.Platform;

import java.io.File;

public class FabricPlatform extends Platform {
    @Override
    public File getConfigDirectory() {
        return null;
    }

    @Override
    public boolean hasPermission(ServerPlayer player, String permission) {
        return false;
    }
}
