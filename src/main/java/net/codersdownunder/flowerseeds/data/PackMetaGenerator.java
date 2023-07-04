package net.codersdownunder.flowerseeds.data;

import com.google.common.collect.ImmutableMap;
import net.minecraft.DetectedVersion;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;

import static net.minecraft.server.packs.PackType.CLIENT_RESOURCES;
import static net.minecraft.server.packs.PackType.SERVER_DATA;

public class PackMetaGenerator {
    public static PackMetadataGenerator create(final PackOutput output, String pack_text) {
        return new PackMetadataGenerator(output)
                .add(
                        PackMetadataSection.TYPE,
                        new PackMetadataSection(Component.literal(pack_text),
                                DetectedVersion.BUILT_IN.getPackVersion(CLIENT_RESOURCES),
                                ImmutableMap.<net.minecraft.server.packs.PackType, Integer>builder()
                                        .put(SERVER_DATA, DetectedVersion.BUILT_IN.getPackVersion(SERVER_DATA))
                                        .put(CLIENT_RESOURCES, DetectedVersion.BUILT_IN.getPackVersion(CLIENT_RESOURCES))
                                        .build()
                        )
                );
    }

    public static PackMetadataGenerator createServer(final PackOutput output, String pack_text) {
        return new PackMetadataGenerator(output)
                .add(
                        PackMetadataSection.TYPE,
                        new PackMetadataSection(Component.literal(pack_text),
                                DetectedVersion.BUILT_IN.getPackVersion(CLIENT_RESOURCES),
                                ImmutableMap.<net.minecraft.server.packs.PackType, Integer>builder()
                                        .put(SERVER_DATA, DetectedVersion.BUILT_IN.getPackVersion(SERVER_DATA))
                                        .build()
                        )
                );
    }

}
