package wtf.schlosser.JoinQuitLogger;

import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Handler_Join implements Listener {
	
	private Main plugin;
	
	public Handler_Join(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	//Join
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		try {
			func.file_put_contents(plugin, "Join", func.name_uuid_pos(event.getPlayer()) + "," + event.getPlayer().getAddress().toString());
		} catch (IOException ioe) {
			System.out.println("IOException Error:");
			ioe.printStackTrace();
		}
	}
}
