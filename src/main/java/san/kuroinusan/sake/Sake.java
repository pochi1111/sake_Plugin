package san.kuroinusan.sake;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class Sake extends JavaPlugin {
    public static JavaPlugin plugin;
    public static Economy econ;
    public static String prefix = ChatColor.AQUA + "[Bank]" + ChatColor.RESET;
    private Listeners listeners;
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        this.listeners = new Listeners();
        if (!setupEconomy()){
            Bukkit.broadcastMessage("Vaultが入っていないかも?・。・");
        }
        Bukkit.getPluginManager().registerEvents(this.listeners, this);
        super.onEnable();
        plugin.saveDefaultConfig();
    }

    private boolean setupEconomy() {
        //vaultが入っているか
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        //取得できるか
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }
    public static JavaPlugin getPlugin(){return plugin;}
}
