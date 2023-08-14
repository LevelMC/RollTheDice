package net.levelmc.rtd.util;

import net.levelmc.rtd.ConfigFiles.languages.FrenchLanguageFile;
import net.levelmc.rtd.ConfigFiles.languages.GermanLanguageFile;

public class GermanLanguageUtils {

    public static void addString(){

        GermanLanguageFile.getLanguageFile().set("BroadcastOn", "&b&l%player% &ehat eine &c&l%roll% &egewürfelt!");
        GermanLanguageFile.getLanguageFile().set("BroadcastOff", "&eDu hast eine &c&l%roll% &egewürfelt!");

        GermanLanguageFile.saveLanguageFile();
    }

    public static String getConfigItem(String key){
        return GermanLanguageFile.getLanguageFile().getString(key);
    }


}
