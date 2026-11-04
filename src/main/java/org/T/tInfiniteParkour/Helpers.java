package org.T.tInfiniteParkour;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.time.LocalDateTime;
import java.util.*;

public class Helpers {
    private static Random rand = null;

    public static Map<UUID, Integer> data = null;
    public static Map<UUID, LocalDateTime> dates = null;

    public static void Init(Map<UUID, Integer> dataMap, Map<UUID, LocalDateTime> datesMap) {
        data = dataMap;
        dates = datesMap;
        rand = new Random();
    }

    public static String CFormat(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static void SendFormated(Player p, String s) {
        p.sendMessage(Helpers.CFormat(s));
    }

    public static int GetRandom(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }


    public static ItemStack CreateItem(Material mat, String name, String desc) {
        ItemStack retItem = new ItemStack(mat);

        ItemMeta meta = retItem.getItemMeta();
        meta.setDisplayName(Helpers.CFormat(name));
        List<String> lore = new ArrayList<>();
        lore.add(Helpers.CFormat(desc));
        meta.setLore(lore);
        retItem.setItemMeta(meta);
        return retItem;
    }

    public static String GetItemName(Material material) {
        return material.name().toLowerCase().replace("_", " ");
    }
}
