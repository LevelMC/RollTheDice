package net.levelmc.rtd.ConfigFiles.languages;

import net.levelmc.rtd.RTD;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class GermanLanguageFile {

    private static File file;
    private static FileConfiguration languageFile;

    public static void setLanguageFile() {
        file = new File(RTD.getCustomDirectory(),  "germanLanguage.yml");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        languageFile = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration getLanguageFile() {
        return languageFile;
    }

    public static void saveLanguageFile() {
        try {
            languageFile.save(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void reloadLanguageFile() {
        languageFile = YamlConfiguration.loadConfiguration(file);
    }
}
