package wtf.schlosser.JoinQuitLogger;

import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onLoad() {
		System.out.println("Logger Plugin Loaded!");
	}
	
	@Override
	public void onEnable() {
		try {
			func.file_put_contents(this,"%srv", "Plugin_Enabled,Probably a Server Restart/Reload");
		} catch (IOException ioe) {
			System.out.println("IOException Error:");
			ioe.printStackTrace();
		}
		
		if(this.getConfig().getBoolean("Log_Join")) new Handler_Join(this);
		if(this.getConfig().getBoolean("Log_Quit")) new Handler_Quit(this);
	}

	@Override
	public void onDisable() {
		try {
			func.file_put_contents(this,"%srv", "Plugin_Disabled,Probably a Server Restart/Reload");
		} catch (IOException ioe) {
			System.out.println("IOException Error:");
			ioe.printStackTrace();
		}
	}
}
