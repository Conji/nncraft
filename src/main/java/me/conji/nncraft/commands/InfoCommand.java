package me.conji.nncraft.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;

import me.conji.nncraft.api.NNCommand;

public class InfoCommand extends NNCommand {
  private static Permission permission = new Permission("nn.info");

  public Permission getPermission() {
    return permission;
  }

  public String getUsage() {
    return "/<command>";
  }

  public String getDescription() {
    return "Returns data about the current server instance";
  }

  public boolean execute(CommandSender sender, String[] args) {
    return true;
  }
}
