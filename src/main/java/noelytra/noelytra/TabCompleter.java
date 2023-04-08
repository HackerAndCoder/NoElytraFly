package noelytra.noelytra;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;

public class TabCompleter implements org.bukkit.command.TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        List<String> completions = new ArrayList<>();
        List<String> allcommands = new ArrayList<>();
        allcommands.add("on");
        allcommands.add("off");
        allcommands.add("enable");
        allcommands.add("disable");
        for (String i : allcommands) {
            if (i.contains(args[0])) {
                completions.add(i);
            }
        }
        return completions;
    }
}
