package org.T.tInfiniteParkour;

import org.bukkit.plugin.java.JavaPlugin;

public final class TInfiniteParkour extends JavaPlugin {

    @Override
    public void onEnable () {
	// Plugin startup logic
        Helpers.Init ();
        getCommand ("place").setExecutor (new PlaceCommand ());

    }

    @Override
    public void onDisable () {
	// Plugin shutdown logic
    }
}
