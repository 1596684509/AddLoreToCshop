package xiao_student.addloretocshop;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {

            sender.sendMessage(ChatColor.RED + "此命令仅玩家可用");
            return true;
        }

        if(sender.isOp()) {

            if(args[0].equals("help") || args.length == 0) {

                sendHelpMessage(sender);

            }else if(args[0].equals("setitem")) {

                if(args.length < 3) {

                    sender.sendMessage(ChatColor.RED + "缺少参数，请检查命令是否正确");

                }
                LoreAddTool.addItem((Player) sender, Integer.parseInt(args[1]), Integer.parseInt(args[2]));

            }

        }

        return false;
    }

    private void sendHelpMessage(CommandSender sender) {

        sender.sendMessage(ChatColor.YELLOW + "---------AddLoreToCshop-----------");
        sender.sendMessage(ChatColor.YELLOW + "本插件用于快速添加customShop插件命令代码");
        sender.sendMessage(ChatColor.YELLOW + "--------------命令--------------");
        sender.sendMessage(ChatColor.YELLOW + "/addloretocshop(al) setitem <目标位置> <数量>: 添加背包指定位置的物品, 第一格为 1");


    }

}
