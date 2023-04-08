package noelytra.noelytra;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.plugin.Plugin;

public class Handler implements Listener {
    @EventHandler
    public void disableElytra(EntityToggleGlideEvent event) {
        Plugin plugin = Bukkit.getPluginManager().getPlugin("noelytra");
        if (event.isGliding()) {
            if (!plugin.getConfig().getBoolean("allow-elytra-flying")) {
                event.setCancelled(true);
            }
        }
    }
}
