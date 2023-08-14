package net.levelmc.rtd;

import net.levelmc.rtd.ConfigFiles.languages.*;
import net.levelmc.rtd.commands.rollCommand;
import net.levelmc.rtd.util.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class RTD extends JavaPlugin {

    private static File customDirectory;
    private static RTD instance;

    @Override
    public void onEnable() {

        instance = this;
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&', "&8&l{&e&lR&a&lT&d&lD&8&l}&7: &eActivated")
        );
        getServer().getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&', "&8&l{&e&lR&a&lT&d&lD&8&l}&7: &eAll languages are translated by google.")
        );
        getServer().getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&', "&8&l{&e&lR&a&lT&d&lD&8&l}&7: &eProblems? Ask your question in our discord.")
        );

        //customFileDirectory
        // Create a custom directory
        customDirectory = new File(getDataFolder(), "languages");
        if (!customDirectory.exists()) {
            customDirectory.mkdirs();
        }

        //register custom files
        //language files
        createLanguageFiles();

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //config
        String prefix = this.getConfig().getString("prefix");
        String language = this.getConfig().getString("language");
        String EnglishBroadCastOn = EnglishLanguageUtils.getConfigItem("BroadcastOn");
        String EnglishBroadcastOff = EnglishLanguageUtils.getConfigItem("BroadcastOff");
        String DutchBroadcastOn = DutchLanguageUtils.getConfigItem("BroadcastOn");
        String DutchBroadcastOff = DutchLanguageUtils.getConfigItem("BroadcastOff");
        String FrenchBroadcastOn = FrenchLanguageUtils.getConfigItem("BroadcastOn");
        String FrenchBroadcastOff = FrenchLanguageUtils.getConfigItem("BroadcastOff");
        String GermanBCOn = GermanLanguageUtils.getConfigItem("BroadcastOn");
        String GermanBCOff = GermanLanguageUtils.getConfigItem("BroadcastOff");
        String SpanishBCOn = SpanishLanguageUtils.getConfigItem("BroadcastOn");
        String SpanishBCOff = SpanishLanguageUtils.getConfigItem("BroadcastOff");
        boolean broadcast = this.getConfig().getBoolean("broadcast-roll");

        //adding strings to configs
        addStringsToConfigs();

        //Commands
        getCommand("roll").setExecutor(new rollCommand(prefix, language, broadcast, EnglishBroadCastOn, EnglishBroadcastOff, DutchBroadcastOn, DutchBroadcastOff,
                FrenchBroadcastOn, FrenchBroadcastOff, GermanBCOn, GermanBCOff, SpanishBCOn, SpanishBCOff));

    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&', "&e&lR&a&lT&d&lD &cDeactivated")
        );

    }

    private void addStringsToConfigs(){
        EnglishLanguageUtils.addString();
        DutchLanguageUtils.addString();
        FrenchLanguageUtils.addString();
        GermanLanguageUtils.addString();
        SpanishLanguageUtils.addString();
    }

    private void createLanguageFiles() {
        EnglishLanguageFile.setLanguageFile();
        EnglishLanguageFile.getLanguageFile().options().copyDefaults(true);
        EnglishLanguageFile.saveLanguageFile();

        DutchLanguageFile.setLanguageFile();
        DutchLanguageFile.getLanguageFile().options().copyDefaults(true);
        DutchLanguageFile.saveLanguageFile();

        GermanLanguageFile.setLanguageFile();
        GermanLanguageFile.getLanguageFile().options().copyDefaults(true);
        GermanLanguageFile.saveLanguageFile();

        FrenchLanguageFile.setLanguageFile();
        FrenchLanguageFile.getLanguageFile().options().copyDefaults(true);
        FrenchLanguageFile.saveLanguageFile();

        SpanishLanguageFile.setLanguageFile();
        SpanishLanguageFile.getLanguageFile().options().copyDefaults(true);
        SpanishLanguageFile.saveLanguageFile();
    }

    public static File getCustomDirectory() {
        return customDirectory;
    }


    public static RTD getInstance() {
        return instance;
    }
}
