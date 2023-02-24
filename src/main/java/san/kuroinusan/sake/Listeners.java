package san.kuroinusan.sake;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;


public class Listeners implements Listener {
    @EventHandler
    public void drink_sake(PlayerItemConsumeEvent event){

    }

    @EventHandler
    public void villager_click(PlayerInteractEntityEvent event){
        Player e = event.getPlayer();
        String villager_name = event.getRightClicked().getName();
        //エンティティタイプが村人かつ名前がバーテンダーなら

    }
}
