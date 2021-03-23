package wtf.schlosser.JoinQuitLogger;

import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Handler_Quit implements Listener {
	
	private Main plugin;
	
	public Handler_Quit(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	//Quit
	@EventHandler
	public void onJoin(PlayerQuitEvent event) {
		try {
			func.file_put_contents(plugin, "Quit", func.name_uuid_pos(event.getPlayer()));
		} catch (IOException ioe) {
			System.out.println("IOException Error:");
			ioe.printStackTrace();
		}
	}
}
