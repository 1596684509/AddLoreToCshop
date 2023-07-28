package xiao_student.addloretocshop;

import org.bukkit.plugin.java.JavaPlugin;

public final class AddLoreToCshop extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getCommand("addloretocshop").setExecutor(new Command());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
