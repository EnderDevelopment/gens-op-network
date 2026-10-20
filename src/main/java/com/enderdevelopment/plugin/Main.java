package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Gens OP Generator Network plugin has been enabled!");
        // Initialize plugin components
    }

    @Override
    public void onDisable() {
        getLogger().info("Gens OP Generator Network plugin has been disabled!");
        // Clean up plugin components
    }
}