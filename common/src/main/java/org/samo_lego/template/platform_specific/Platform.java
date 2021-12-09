package org.samo_lego.template.platform_specific;

import net.minecraft.server.level.ServerPlayer;

import java.io.File;

public abstract class Platform {
    /**
     * Gets config directory.
     * @return config directory file.
     */
    public abstract File getConfigDirectory();

    /**
     * Checks whether player has provided permission.
     * @param player player to check.
     * @param permission permission to check.
     * @return true if player has permission, false otherwise.
     */
    public abstract boolean hasPermission(ServerPlayer player, String permission);
}
