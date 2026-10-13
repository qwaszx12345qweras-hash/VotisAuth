package ru.example.telegramauth;

import org.bukkit.plugin.java.JavaPlugin;

public final class TelegramAuthPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("TelegramAuth включён!");
    }

    @Override
    public void onDisable() {
        getLogger().info("TelegramAuth выключен.");
    }
}
