#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

import ${package}.commands.Command;
import ${package}.listeners.PlayerJoinListener;
import ${package}.tasks.Task;

public class ${mainClass} extends JavaPlugin {

    private static Plugin instance;

    public static Plugin getInstance () {
            return Plugin.instance;
    }
    // This code is called after the server starts and after the /reload command
    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "{0}.onEnable()", this.getClass().getName());
        this.saveDefaultConfig();

        Plugin.instance = this;

        this.getCommand("command").setExecutor(new Command());

        Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);

        final long taskRepeatEvery = this.getConfig().getInt("task-repeat-every") * 20L;
        this.getServer().getScheduler().runTaskTimer(this, new Task(), taskRepeatEvery, taskRepeatEvery);
    }

    // This code is called before the server stops and after the /reload command
    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "{0}.onDisable()", this.getClass().getName());
    }
}