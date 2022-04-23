package fr.nekotine.fnafxy;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FNAFXY extends JavaPlugin {

	public static FNAFXY instance;
	
	private EventDispatcher dispatcher;
	
	@Override
	public void onEnable() {
		super.onEnable();
		instance = this;
		dispatcher = new EventDispatcher();
		Bukkit.getPluginManager().registerEvents(dispatcher, instance);
	}
}
