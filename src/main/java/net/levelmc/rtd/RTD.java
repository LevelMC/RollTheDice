package net.levelmc.rtd;

import net.levelmc.rtd.commands.rollCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class RTD extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&', "&e&lR&a&lT&d&lD &eActivated")
        );

        getConfig().options().copyDefaults();
        saveDefaultConfig();


        //Commands
        getCommand("roll").setExecutor(new rollCommand());



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&', "&e&lR&a&lT&d&lD &cDeactivated")
        );

    }
}
