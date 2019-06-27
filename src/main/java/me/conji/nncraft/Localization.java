package me.conji.nncraft;

import com.bergerkiller.bukkit.common.localization.LocalizationEnum;
import org.bukkit.ChatColor;

/**
 * Contains all locals for NN.
 */
public class Localization extends LocalizationEnum {
    public static final Localization NOPERM = new Localization("noperm", ChatColor.RED + "You don't have permission to do that!");

    private Localization(String name, String defValue) {
        super(name, defValue);
    }

    @Override
    public String get(String... arguments) {
        return NNCraft.getInstance().getLocale(this.getName(), arguments);
    }
}
