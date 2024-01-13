package me.jonah.jonahsessentals;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.util.ChatPaginator;

public class EventListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent joinEvent){
        Player player = joinEvent.getPlayer();
        if(player.hasPlayedBefore()){
            joinEvent.setJoinMessage(ChatColor.GREEN + " Welcome back to the server, " + ChatColor.RESET + player.getDisplayName() + "!");
        }else {
            joinEvent.setJoinMessage(ChatColor.LIGHT_PURPLE + "Welcome to the server, " + ChatColor.RESET + player.getDisplayName() + "!");
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent quitEvent){
        Player player = quitEvent.getPlayer();
        quitEvent.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + " has left :(");
    }
}
