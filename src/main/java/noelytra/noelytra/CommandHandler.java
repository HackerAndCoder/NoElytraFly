package noelytra.noelytra;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Objects;

public class CommandHandler implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (Objects.equals(args[0], "enable") || Objects.equals(args[0], "on")) {
            Bukkit.getPluginManager().getPlugin("noelytra").getConfig().set("allow-elytra-flying", true);
            sender.sendMessage(ChatColor.YELLOW + "Elytra flying has been enabled");
        } else if (Objects.equals(args[0], "disable") || Objects.equals(args[0], "off")) {
            Bukkit.getPluginManager().getPlugin("noelytra").getConfig().set("allow-elytra-flying", false);
            sender.sendMessage(ChatColor.YELLOW + "Elytra flying has been disabled");
        } else {
            sender.sendMessage(ChatColor.RED + "The correct usage of the command is /elytra enable/disable/on/off");
        }
        return true;
    }
}
