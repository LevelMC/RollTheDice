package net.levelmc.rtd.commands;

import net.levelmc.rtd.RTD;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.Random;

public class rollCommand implements CommandExecutor {

    Plugin plugin = RTD.getPlugin(RTD.class);


    Random random = new Random();



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String prefix = plugin.getConfig().getString("prefix");

        if (sender instanceof Player){
            Player p = (Player) sender;

            int dice = random.nextInt(6)+1;

            p.sendMessage( prefix + ChatColor.translateAlternateColorCodes('&',
                    "&7: &eYou threw a " + ChatColor.RED + dice
            ));

        }else{
            System.out.println("Be online to use this command");
        }



        return true;
    }
}
