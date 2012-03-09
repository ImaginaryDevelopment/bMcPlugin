package com.github.imaginarydevelopment.bMcPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class bMcPluginCommandExecutor implements CommandExecutor {

	bMcPlugin plugin;
	
	public bMcPluginCommandExecutor(bMcPlugin plugin){
		this.plugin=plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("bMcPlugin")){ // If the player typed /basic then do the following...
			plugin.get_Logger().info("bMcPlugin pluginCommand activated");
			//if(!(sender instanceof Player))
				sender.sendMessage(ChatColor.BLUE+"bMcPlugin is listening.");
			return true;
		} //If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
		return false;
	}
	
}
