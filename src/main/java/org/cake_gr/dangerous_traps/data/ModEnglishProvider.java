package org.cake_gr.dangerous_traps.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.cake_gr.dangerous_traps.DangerousTraps;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ModEnglishProvider extends LanguageProvider {
    public ModEnglishProvider(PackOutput output) {
        super(output, DangerousTraps.MODID, "en_us");
    }

    private static String toTitleCase(String raw) {
        return Arrays.stream(raw.split("_"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    @Override
    protected void addTranslations() {

    }
}
