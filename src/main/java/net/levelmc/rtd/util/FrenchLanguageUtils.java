package net.levelmc.rtd.util;

import net.levelmc.rtd.ConfigFiles.languages.FrenchLanguageFile;

public class FrenchLanguageUtils {

    public static void addString(){

        FrenchLanguageFile.getLanguageFile().set("BroadcastOn", "&b&l%player% &ea roulé un &c&l%roll%&e!");
        FrenchLanguageFile.getLanguageFile().set("BroadcastOff", "&eTu as roulé un &c&l%roll%&e!");

        FrenchLanguageFile.saveLanguageFile();
    }

    public static String getConfigItem(String key){
        return FrenchLanguageFile.getLanguageFile().getString(key);
    }


}
