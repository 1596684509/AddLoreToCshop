package xiao_student.addloretocshop;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class LoreAddTool {

    public static void addItem(Player player, int index, int kazu) {

        try {

            if(player.getInventory().getItemInMainHand() == null) {

                player.sendMessage(ChatColor.RED + "请将想要添加命令的物品放在主手");

            }

            ItemMeta itemMeta = player.getInventory().getItemInMainHand().getItemMeta();
            List<String> lore = itemMeta.getLore();

            String targetName = player.getOpenInventory().getBottomInventory().getItem(index + 8).getItemMeta().getDisplayName();
            lore.add("b~item~" + targetName + "~" + kazu);
            itemMeta.setLore(lore);
            player.getInventory().getItemInMainHand().setItemMeta(itemMeta);

        }catch (NullPointerException e) {

            player.sendMessage(ChatColor.RED + "指定位置物品为空!");

        }

    }

}
