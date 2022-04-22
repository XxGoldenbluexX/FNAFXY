package fr.nekotine.fnafxy;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import fr.nekotine.fnafxy.animatronics.Animatronic;
import fr.nekotine.fnafxy.animatronics.Hub;
import fr.nekotine.fnafxy.map.Map;

public class FNAFXY extends JavaPlugin {

	public static FNAFXY instance;
	
	private EventDispatcher dispatcher;
	
	private Map map;
	private ArrayList<Animatronic> animatronics;
	private Hub hub;
	
	@Override
	public void onEnable() {
		super.onEnable();
		instance = this;
		dispatcher = new EventDispatcher();
		Bukkit.getPluginManager().registerEvents(dispatcher, instance);
	}
	
}
