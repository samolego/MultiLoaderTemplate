package org.samo_lego.template.forge;

import net.minecraftforge.fml.common.Mod;
import org.samo_lego.template.Template;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

@Mod(MOD_ID)
public class TemplateForge {

    public TemplateForge() {
       Template.init(new ForgePlatform());
    }
}
