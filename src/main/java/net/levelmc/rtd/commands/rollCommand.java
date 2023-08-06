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

    Random random = new Random();

    private final String prefix;
    private final boolean broadcast;

    public rollCommand(String prefix, boolean broadcast){
        this.prefix = prefix;
        this.broadcast = broadcast;
    }





    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            int dice = random.nextInt(6)+1;

            if (broadcast == true){

                p.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', prefix +
                        " §a§l" + p.getDisplayName() + " §erolled a §c§l" + dice + "§e!"
                ));

            }else{
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + "&7: " +
                        "&eYou rolled a &c&l" + dice + "&e!"
                ));
            }



        }else{
            System.out.println("Be online to use this command");
        }



        return true;
    }
}
