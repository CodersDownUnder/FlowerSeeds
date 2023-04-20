package net.codersdownunder.flowerseeds.events;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.resource.PathPackResources;

import java.nio.file.Path;

public final class AddonLoader {

    private static final String CYCLIC_PACK_NAME = "flowerseeds_addon_cyclic";
    private static final String OTBYG_PACK_NAME = "flowerseeds_addon_otbyg";


    public static boolean isModLoaded(String modid) {
        return ModList.get().isLoaded(modid);
    }

    public static void onAddPackFinders(final AddPackFindersEvent event) {
        if(event.getPackType() == PackType.SERVER_DATA) {
            // register Quark data pack
            if(isModLoaded("cyclic")) {
                FlowerSeeds.LOGGER.info("Flowerseeds detected Cyclic, registering data pack now");
                registerAddon(event, CYCLIC_PACK_NAME);
            }
            // register Mekanism data pack
            if(isModLoaded("byg")) {
                FlowerSeeds.LOGGER.info("Flowerseeds detected Oh The Biomes You'll Go, registering data pack now");
                registerAddon(event, OTBYG_PACK_NAME);
            }
        }
    }

    private static void registerAddon(final AddPackFindersEvent event, final String packName) {
        event.addRepositorySource((packConsumer, constructor) -> {
            Pack pack = Pack.create(FlowerSeeds.MODID + ":" + packName, true, () -> {
                Path path = ModList.get().getModFileById(FlowerSeeds.MODID).getFile().findResource("/" + packName);
                return new PathPackResources(packName, path);
            }, constructor, Pack.Position.TOP, PackSource.DEFAULT);

            if (pack != null) {
                packConsumer.accept(pack);
            } else {
                FlowerSeeds.LOGGER.error(FlowerSeeds.MODID + ": Failed to register data pack \"" + packName + "\"");
            }
        });
    }

}
