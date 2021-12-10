package org.samo_lego.template.forge;

import net.minecraftforge.fml.common.Mod;
import org.samo_lego.template.Template;

@Mod(Template.MOD_ID)
public class TemplateForge {

    public TemplateForge() {
       Template.init(new ForgePlatform());
    }
}
