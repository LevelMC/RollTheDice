package net.levelmc.rtd.util;

import net.levelmc.rtd.ConfigFiles.languages.EnglishLanguageFile;

public class EnglishLanguageUtils {

    public static void addString(){

        EnglishLanguageFile.getLanguageFile().set("BroadcastOn", "&b&l%player% &ehas rolled a &c&l%roll%&e!");
        EnglishLanguageFile.getLanguageFile().set("BroadcastOff", "&eYou have rolled a &c&l%roll%&e!");

        EnglishLanguageFile.saveLanguageFile();
    }

    public static String getConfigItem(String key){
        return EnglishLanguageFile.getLanguageFile().getString(key);
    }

}
