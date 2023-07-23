package net.levelmc.rtd.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class rollCommand implements CommandExecutor {


    Random random = new Random();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player){
            Player p = (Player) sender;

            int dice = random.nextInt(6)+1;

            p.sendMessage(ChatColor.translateAlternateColorCodes('&',
                    "&8&l{&e&lR&a&lT&d&lD&8&l}&7: You threw a " + ChatColor.RED + dice
            ));

        }else{
            System.out.println("Be online to use this command");
        }



        return true;
    }
}
