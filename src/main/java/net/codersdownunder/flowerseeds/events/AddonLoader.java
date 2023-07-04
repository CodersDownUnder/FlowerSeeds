package net.codersdownunder.flowerseeds.events;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.minecraft.SharedConstants;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.resource.PathPackResources;

import java.nio.file.Path;

public final class AddonLoader {

    public static final String CYCLIC_PACK_NAME = "flowerseeds_addon_cyclic";
    public static final String OTBYG_PACK_NAME = "flowerseeds_addon_otbyg";


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
        event.addRepositorySource(packConsumer -> {
            // create pack data
            final String packId = FlowerSeeds.MODID + ":" + packName;
            final Component packTitle = Component.literal(packName);
            final Path path = ModList.get().getModFileById(FlowerSeeds.MODID).getFile().findResource("/" + packName);
            final Pack.Info info = new Pack.Info(packTitle, SharedConstants.DATA_PACK_FORMAT, FeatureFlagSet.of());
            // create the pack
            Pack pack = Pack.create(packId, packTitle, true, s -> new PathPackResources(packName, false, path), info,
                    PackType.SERVER_DATA, Pack.Position.TOP, true, PackSource.DEFAULT);
            // consume the pack
            packConsumer.accept(pack);
        });
    }

}
