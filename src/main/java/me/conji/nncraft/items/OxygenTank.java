package me.conji.nncraft.items;

import com.logisticscraft.logisticsapi.item.LogisticItem;
import org.bukkit.inventory.ItemStack;
import me.conji.nncraft.NNCraft;

public class OxygenTank extends LogisticItem {

  public OxygenTank(ItemStack baseStack) {
    super(NNCraft.getInstance(), "oxygen_tank", baseStack);
  }

}