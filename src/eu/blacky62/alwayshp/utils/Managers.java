package eu.blacky62.alwayshp.utils;

import eu.blacky62.alwayshp.Main;
import org.bukkit.Bukkit;

public class Managers {

    private Main instance;
    private Managers managers;

    public void load(Main instance) {
        this.instance = instance;
        this.managers = this;

        Bukkit.getConsoleSender().sendMessage("§2[§bAlwaysHP§2] §aPlugin succesfully loaded !"); // Sending a console message when the plugin is succesfully loaded.
    }

    public void unload() {
        Bukkit.getConsoleSender().sendMessage("§2[§bAlwaysHP§2] §aPlugin succesfully unloaded !"); // Sending a console message when the plugin is succesfully unloaded.
    }
}
