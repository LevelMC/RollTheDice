package net.levelmc.rtd.commands;

import net.levelmc.rtd.RTD;
import org.bukkit.Bukkit;
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
    private final String language;
    private final boolean broadcast;
    private final String englishBCMessage;
    private final String englishMessage;
    private final String DutchBCMessage;
    private final String DutchMessage;
    private final String FrenchBCMessage;
    private final String FrenchMessage;
    private final String GermanBCMessage;
    private final String GermanMessage;
    private final String SpanishBCMessage;
    private final String SpanishMessage;

    public rollCommand(String prefix, String language, boolean broadcast, String EngBCMessageOn, String EngBCMessageOff, String DutchBCMessageOn, String DutchBCMessageOff, String FrenchBCMessageOn,
                       String FrenchBCMessageOff, String GermanBCMessageOn, String GermanBCMessageOff, String SpanishBCMessageOn, String SpanishBCMessageOff){
        this.prefix = prefix;
        this.language = language;
        this.broadcast = broadcast;
        this.englishBCMessage = EngBCMessageOn;
        this.englishMessage = EngBCMessageOff;
        this.DutchBCMessage = DutchBCMessageOn;
        this.DutchMessage = DutchBCMessageOff;
        this.FrenchBCMessage = FrenchBCMessageOn;
        this.FrenchMessage = FrenchBCMessageOff;
        this.GermanBCMessage = GermanBCMessageOn;
        this.GermanMessage = GermanBCMessageOff;
        this.SpanishBCMessage = SpanishBCMessageOn;
        this.SpanishMessage = SpanishBCMessageOff;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            int dice = random.nextInt(6)+1;


            if (language.equalsIgnoreCase("english")){

                if (broadcast){
                    String englishBcMessage = englishBCMessage.replace("%player%", p.getDisplayName()).replace("%roll%", "" + dice);
                    p.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + englishBcMessage));
                }else{
                    String englishmessage = englishMessage.replace("%roll%", "" + dice);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + englishmessage));
                }
            } else if (language.equalsIgnoreCase("dutch")) {
                if (broadcast){
                    String dutchBcMessage = DutchBCMessage.replace("%player%", p.getDisplayName()).replace("%roll%", "" + dice);
                    p.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + dutchBcMessage));
                }else{
                    String dutchmessage = DutchMessage.replace("%roll%", "" + dice);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + dutchmessage));
                }
            }else if (language.equalsIgnoreCase("french")){
                if (broadcast){
                    String frenchBcMessage = FrenchBCMessage.replace("%player%", p.getDisplayName()).replace("%roll%", "" + dice);
                    p.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + frenchBcMessage));
                }else{
                    String frenchmessage = FrenchMessage.replace("%roll%", "" + dice);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + frenchmessage));
                }
            }else if (language.equalsIgnoreCase("german")){
            if (broadcast){
                String germanBcMessage = GermanBCMessage.replace("%player%", p.getDisplayName()).replace("%roll%", "" + dice);
                p.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + germanBcMessage));
            }else{
                String germanmessage = GermanMessage.replace("%roll%", "" + dice);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + germanmessage));
            }
            }else if (language.equalsIgnoreCase("spanish")){
            if (broadcast){
                String spanishBcMessage = SpanishBCMessage.replace("%player%", p.getDisplayName()).replace("%roll%", "" + dice);
                p.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + spanishBcMessage));
            }else{
                String spanishmessage = SpanishMessage.replace("%roll%", "" + dice);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + spanishmessage));
            }
        }


        }else{
            System.out.println("Be online to use this command");
        }



        return true;
    }
}
