package eu.blacky62.alwayshp.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PluginListeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        for (Player p : Bukkit.getOnlinePlayers()) {
            player.hidePlayer(p);
            p.hidePlayer(player);
        }
    }
}
