package main.java.br.com.alsupreme.shomes;

import java.io.File;

import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public abstract class SoundManager {
	
	static Plugin plugin = SupremeHomes.getPlugin(SupremeHomes.class);
	
	static Sound home = Sound.ENTITY_EXPERIENCE_ORB_PICKUP;
	static Sound homes = null; //Sound.BLOCK_BEEHIVE_ENTER;
	static Sound sethome = Sound.ENTITY_PLAYER_LEVELUP;
	static Sound delhome = Sound.BLOCK_ANVIL_BREAK; //Sound.BLOCK_NETHERITE_BLOCK_BREAK; 
	static Sound error = Sound.ENTITY_PLAYER_BIG_FALL;
	static Sound waitfortp = Sound.BLOCK_GRASS_HIT;//Sound.BLOCK_SOUL_SOIL_BREAK;
	
	static float f1 = 0.5f;
	static float f2 = 0.5f;
	
	static File soundfile = new File(plugin.getServer().getPluginManager().getPlugin("SupremeHomes").getDataFolder(), "sounds.yml");
	static FileConfiguration soundconfig;
	
	//Soundconfig
	public static void genConfig() {
		if(!soundfile.exists()) {
			plugin.saveResource("sounds.yml", false);
		}else {
			reloadSoundsConfig();
		}
	}
	
	public static FileConfiguration getSoundsConfig() {
		return soundconfig;
	}
	
	public static void reloadSoundsConfig() {
		soundconfig = YamlConfiguration.loadConfiguration(soundfile);
	}
	
	public static void playSoundSetHome(Player player) {
		
		 player.playSound(player.getLocation(), sethome, f1, f2);
	}
	
	public static void playSoundHome(Player player) {
		 player.playSound(player.getLocation(), home, f1, f2);
	}
	
	public static void playSoundHomes(Player player) {
		 player.playSound(player.getLocation(), homes, f1, f2);
	}
	
	public static void playSoundDelhomes(Player player) {
		 player.playSound(player.getLocation(), delhome, f1, f2);
	}
	
	public static void playSoundError(Player player) {
		player.playSound(player.getLocation(), error, f1, f2);
	}
	
	public static void playSoundWaitForTp(Player player) {
		player.playSound(player.getLocation(), waitfortp, f1, f2);
	}
	

}
