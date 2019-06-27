package me.conji.nncraft.api;

import me.conji.nncraft.managers.CommandManager;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;

public abstract class NNCommand {
    private CommandManager commandManager;

    public abstract Permission getPermission();
    public abstract String getUsage();
    public abstract String getDescription();
    public abstract boolean execute(CommandSender sender, String[] args);

    public void register(CommandManager commandManager) {
        this.commandManager = commandManager;
    }
}
