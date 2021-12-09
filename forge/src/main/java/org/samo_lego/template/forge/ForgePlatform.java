package org.samo_lego.template.forge;

import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.fml.loading.FMLPaths;
import org.samo_lego.template.platform_specific.Platform;

import java.nio.file.Path;

public class ForgePlatform extends Platform {
    @Override
    public Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }

    @Override
    public boolean hasPermission(ServerPlayer player, String permission) {
        return false;
    }
}
