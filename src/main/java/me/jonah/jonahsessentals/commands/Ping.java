package me.jonah.jonahsessentals.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ping implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        int ping = player.getPing();

        if (!(sender instanceof Player)) {
            // Command can only be used by players
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players!");
            return true;
        }else {
            // Display ping information based on different ranges
            if (ping <= 60) {
                player.sendMessage(ChatColor.GREEN + "Ping: " + ping + "ms");
            } else if (ping > 60 && ping <= 120) {
                player.sendMessage(ChatColor.YELLOW + "Ping: " + ping + "ms");
            } else {
                player.sendMessage(ChatColor.RED + "Ping: " + ping + "ms");
            }
        }
        return true;
    }
}
