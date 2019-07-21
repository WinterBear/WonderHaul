package io.github.winterbear.wintercore.wonderhaul.Equipment.Generators;

import io.github.winterbear.wintercore.utils.RandomUtils;
import io.github.winterbear.wintercore.wonderhaul.Equipment.Tier;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

/**
 * Created by WinterBear on 17/06/2019.
 */
public class JunkGenerator implements Generator {

    private Tier TIER = Tier.JUNK;

    private List<Material> mats = Arrays.asList(
            Material.STONE_PICKAXE,
            Material.STONE_AXE,
            Material.STONE_HOE,
            Material.STONE_SHOVEL,
            Material.STONE_SWORD,
            Material.LEATHER_BOOTS,
            Material.LEATHER_CHESTPLATE,
            Material.LEATHER_HELMET,
            Material.LEATHER_HELMET
    );


    @Override
    public ItemStack create()  {
        Material mat = RandomUtils.getRandomElementOf(mats);
        return GeneratorCommons.generateDefault(mat, TIER);
    }

    @Override
    public String getName() {
        return "Junk Generator";
    }

}