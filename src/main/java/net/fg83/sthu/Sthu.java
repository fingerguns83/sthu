package net.fg83.sthu;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Sthu extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage("");
    }
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        event.setQuitMessage("");
    }
}
