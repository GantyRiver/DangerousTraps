package org.cake_gr.dangerous_traps.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.cake_gr.dangerous_traps.DangerousTraps;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DangerousTraps.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
