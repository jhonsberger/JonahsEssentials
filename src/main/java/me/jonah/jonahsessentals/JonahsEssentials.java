package me.jonah.jonahsessentals;

import me.jonah.jonahsessentals.commands.*;
import org.bukkit.plugin.java.JavaPlugin;


public final class JonahsEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EventListener(), this);

        getCommand("kill").setExecutor(new Kill());
        getCommand("ping").setExecutor(new Ping());
    }
}
