package eu.blacky62.alwayshp;

import eu.blacky62.alwayshp.utils.Managers;
import eu.blacky62.alwayshp.utils.PluginListeners;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    Managers managers = new Managers();

    @Override
    public void onEnable() {
        managers.load(this);
        getServer().getPluginManager().registerEvents(new PluginListeners(), this);
    }

    @Override
    public void onDisable() {
        managers.unload();
    }
}
