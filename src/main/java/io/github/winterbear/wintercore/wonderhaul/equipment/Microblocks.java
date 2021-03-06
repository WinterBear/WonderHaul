package io.github.winterbear.wintercore.wonderhaul.equipment;

import io.github.winterbear.wintercore.wonderhaul.equipment.microblocks.essencecollector.EssenceCollector;
import io.github.winterbear.wintercore.wonderhaul.equipment.microblocks.relic.Relic;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by WinterBear on 30/08/2020.
 */
public class Microblocks {

    private static final Set<Microblock> MICROBLOCKS = new HashSet<>();

    public static void registerAll(JavaPlugin plugin){
        MICROBLOCKS.add(new Relic(plugin));
        MICROBLOCKS.add(new EssenceCollector(plugin));
    }


}
