package org.samo_lego.template.platform_specific;

import net.minecraft.server.level.ServerPlayer;

import java.nio.file.Path;

public abstract class Platform {
    /**
     * Gets config directory path.
     * @return config directory path.
     */
    public abstract Path getConfigDirectory();

    /**
     * Checks whether player has provided permission.
     * @param player player to check.
     * @param permission permission to check.
     * @return true if player has permission, false otherwise.
     */
    public abstract boolean hasPermission(ServerPlayer player, String permission);
}
