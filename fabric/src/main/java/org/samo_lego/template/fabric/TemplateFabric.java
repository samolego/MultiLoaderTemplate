package org.samo_lego.template.fabric;

import net.fabricmc.api.ModInitializer;
import org.samo_lego.template.Template;

public class TemplateFabric implements ModInitializer {

    @Override
    public void onInitialize() {
       Template.init(new FabricPlatform());
    }
}
