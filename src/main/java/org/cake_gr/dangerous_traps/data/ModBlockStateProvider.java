package org.cake_gr.dangerous_traps.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.cake_gr.dangerous_traps.DangerousTraps;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DangerousTraps.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
