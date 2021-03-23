package wtf.schlosser.JoinQuitLogger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.bukkit.entity.Player;

public class func {

	public static void file_put_contents(Main plugin, String TYPE, String log) throws IOException {
		
		plugin.getConfig().getString("FileName");
		
		String LogPath = plugin.getDataFolder().getAbsolutePath();
		Path path = Paths.get(LogPath + "/JoinQuit_log.csv");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		String txt = dtf.format(now) + "," + TYPE + "," + log + "\n";
		BufferedWriter fh = new BufferedWriter(new FileWriter(path.toString(), true));
		fh.write(txt);
		fh.close();
    }
	
	public static String name_uuid_pos(Player p) {
		String n = p.getName();
		String u = p.getUniqueId().toString();
		String w = p.getWorld().getName();
		String x = String.valueOf(p.getLocation().getBlockX());
		String y = String.valueOf(p.getLocation().getBlockY());
		String z = String.valueOf(p.getLocation().getBlockZ());
		String r = n + "," + u + "," + w + "," + x + "," + y + "," + z;		
		return r;
	}
	
}
