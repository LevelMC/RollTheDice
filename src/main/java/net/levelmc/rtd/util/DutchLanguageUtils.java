package net.levelmc.rtd.util;

import net.levelmc.rtd.ConfigFiles.languages.DutchLanguageFile;
import net.levelmc.rtd.ConfigFiles.languages.EnglishLanguageFile;

public class DutchLanguageUtils {

    public static void addString(){

        DutchLanguageFile.getLanguageFile().set("BroadcastOn", "&b&l%player% &eheeft een &c&l%roll% &egegooid!");
        DutchLanguageFile.getLanguageFile().set("BroadcastOff", "&eJe hebt een &c&l%roll% &egegooid!");

        DutchLanguageFile.saveLanguageFile();
    }

    public static String getConfigItem(String key){
        return DutchLanguageFile.getLanguageFile().getString(key);
    }

}
