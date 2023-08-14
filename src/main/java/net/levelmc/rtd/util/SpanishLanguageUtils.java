package net.levelmc.rtd.util;


import net.levelmc.rtd.ConfigFiles.languages.SpanishLanguageFile;

public class SpanishLanguageUtils {

    public static void addString(){

        SpanishLanguageFile.getLanguageFile().set("BroadcastOn", "&b&l%player% &eha rodado un &c&l%roll%&e!");
        SpanishLanguageFile.getLanguageFile().set("BroadcastOff", "&eHas rodado un &c&l%roll%&e!");

        SpanishLanguageFile.saveLanguageFile();
    }

    public static String getConfigItem(String key){
        return SpanishLanguageFile.getLanguageFile().getString(key);
    }



}
