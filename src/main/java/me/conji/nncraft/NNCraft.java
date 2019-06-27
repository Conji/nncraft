package me.conji.nncraft;

import com.bergerkiller.bukkit.common.Common;
import com.bergerkiller.bukkit.common.PluginBase;
import com.bergerkiller.bukkit.common.config.FileConfiguration;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class NNCraft extends PluginBase {
    private static NNCraft instance;

    private FileConfiguration config;

    @Override
    public void enable() {
        instance = this;
        this.config = new FileConfiguration(this, "config.yml");
    }

    @Override
    public void disable() {

    }

    @Override
    public boolean command(CommandSender sender, String command, String[] args) {
        // don't need to switch case the label because only one command
        if (args.length == 0) {

        }
        return true;
    }

    @Override
    public int getMinimumLibVersion() {
        return Common.VERSION;
    }

    public static NamespacedKey getNamespacedKey(String key) {
        return new NamespacedKey(instance, key);
    }

    public static NNCraft getInstance() {
        return instance;
    }
}
