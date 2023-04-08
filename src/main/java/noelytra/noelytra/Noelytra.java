package noelytra.noelytra;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Noelytra extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("[NoElytra] Plugin started");
        Bukkit.getPluginManager().registerEvents(new Handler(), this);
        saveDefaultConfig();
        Bukkit.getPluginCommand("elytra").setExecutor(new CommandHandler());
        this.getCommand("elytra").setTabCompleter(new TabCompleter());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
