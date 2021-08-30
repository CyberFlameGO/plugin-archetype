#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.bukkit.Bukkit;

import ${groupId}.${artifactId}.${mainClass};

public class Task implements Runnable {
    @Override
    public void run() {
        final String message = ExamplePlugin.getInstance().getConfig().getString("messages.from-task");
        Bukkit.getServer().broadcastMessage(message);
    }
}