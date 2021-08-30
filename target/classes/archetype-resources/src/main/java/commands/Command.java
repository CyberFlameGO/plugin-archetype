#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import ${groupId}.${artifactId}.${mainClass};

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final String message = ExamplePlugin.getInstance().getConfig().getString("messages.from-command");
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        return true;
    }
}