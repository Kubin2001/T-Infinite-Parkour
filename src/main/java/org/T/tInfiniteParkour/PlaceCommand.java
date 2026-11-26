package org.T.tInfiniteParkour;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.nio.Buffer;

public class PlaceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sen, Command command, String label,
			     String[] args){
	if(!(sen instanceof Player p)){
	    Bukkit.getLogger ().info ("Must be called as player aborting");
	    return true;
	}

	World world = p.getWorld ();
	Location loc = p.getLocation ();
	int x = loc.getBlockX ();
	int y = loc.getBlockY ();
	int z = loc.getBlockZ ();

	int xDiff = Helpers.GetRandom (2,3);
	int zDiff = Helpers.GetRandom (2,3);
	int revX = Helpers.GetRandom (0,1);
	int revZ = Helpers.GetRandom (0,1);
	if(revX == 0){
	    xDiff -= xDiff*2;
	}
	if(revZ == 0){
	    zDiff -= zDiff*2;
	}

	x += xDiff;
	z += zDiff;

	loc.setX (x);
	loc.setZ (z);

	Block block = world.getBlockAt (loc);
	block.setType (Material.STONE);

	return true;

    }

}
