package net.codersdownunder.flowerseeds.data.client.lang;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class FlowerSeedsUK_UA extends LanguageProvider {

    public FlowerSeedsUK_UA(final DataGenerator gen) {
        super(gen, FlowerSeeds.MODID, "uk_ua");
    }

    @Override
    protected void addTranslations() {

        addBlocks();
        addItemGroups();

    }

    private void addBlocks() {
        //Vanilla
        addBlock(BlockInit.CROP_DANDELION, "Насіння кульбаби");
        addBlock(BlockInit.CROP_POPPY, "Насіння маку");
        addBlock(BlockInit.CROP_ORCHID, "Насіння блакитної орхідеї");
        addBlock(BlockInit.CROP_ALLIUM, "Насіння різанця");
        addBlock(BlockInit.CROP_AZURE, "Насіння черемши");
        addBlock(BlockInit.CROP_TULIP_RED, "Насіння червоного тюльпану");
        addBlock(BlockInit.CROP_TULIP_ORANGE, "Насіння помаранчевого тюльпану");
        addBlock(BlockInit.CROP_TULIP_WHITE, "Насіння білого тюльпану");
        addBlock(BlockInit.CROP_TULIP_PINK, "Насіння рожевого тюльпану");
        addBlock(BlockInit.CROP_OXEYE, "Насіння ромашки");
        addBlock(BlockInit.CROP_LILY, "Насіння конвалії");
        addBlock(BlockInit.CROP_WITHERROSE, "Насіння троянди візера");
        addBlock(BlockInit.CROP_CORNFLOWER, "Насіння волошки");

        //Cyclic
        addBlock(BlockInit.CROP_CYANROSE, "Насіння бірюзової троянди");
        addBlock(BlockInit.CROP_LIME_CARNATION, "Насіння лаймової гвоздики");
        addBlock(BlockInit.CROP_PURPLE_TULIP_CYCLIC, "Насіння фіолетового тюльпана (cyclic)");
        addBlock(BlockInit.CROP_ABSALON_TULIP, "Насіння тюльпанів абсалон");

        //BYG
        addBlock(BlockInit.CROP_HORSEWEED, "Насіння конячої трави");
        addBlock(BlockInit.CROP_WINTER_SUCCULENT, "Насіння зимового сукулента");
        addBlock(BlockInit.CROP_ALPINE_BELLFLOWER, "Насіння альпійських дзвоників");
        addBlock(BlockInit.CROP_ANGELICA, "Насіння дягеля");
        addBlock(BlockInit.CROP_HYDRANGEA_BUSH, "Насіння гортензії");
        addBlock(BlockInit.CROP_BEGONIA, "Насіння бегонії");
        addBlock(BlockInit.CROP_BISTORT, "Насіння гірчака зміїного");
        addBlock(BlockInit.CROP_BLUE_SAGE, "Насіння шавлії блакитної");
        addBlock(BlockInit.CROP_CALIFORNIA_POPPY, "Насіння ешольції каліфорнійської");
        addBlock(BlockInit.CROP_CROCUS, "Насіння крокуса");
        addBlock(BlockInit.CROP_BLACK_ROSE, "Насіння чорної троянди");
        addBlock(BlockInit.CROP_CYAN_ROSE, "Насіння бірюзової троянди");
        addBlock(BlockInit.CROP_CYAN_TULIP, "Насіння бірюзового тюльпана");
        addBlock(BlockInit.CROP_DAFFODIL, "Насіння нарцису");
        addBlock(BlockInit.CROP_FIRECRACKER_FLOWER_BUSH, "Насіння кроссандри лійкоподібної");
        addBlock(BlockInit.CROP_GREEN_TULIP, "Насіння зеленого тюльпана");
        addBlock(BlockInit.CROP_GUZMANIA, "Насіння гузманії");
        addBlock(BlockInit.CROP_INCAN_LILY, "Насіння альстромерії");
        addBlock(BlockInit.CROP_IRIS, "Насіння ірису");
        addBlock(BlockInit.CROP_JAPANESE_ORCHID, "Насіння японської орхідеї");
        addBlock(BlockInit.CROP_KOVAN_FLOWER, "Насіння ковану");
        addBlock(BlockInit.CROP_LAZARUS_BELLFLOWER, "Насіння рябчика шахового");
        addBlock(BlockInit.CROP_LOLLIPOP_FLOWER, "Насіння пахістахіса");
        addBlock(BlockInit.CROP_MAGENTA_TULIP, "Насіння пурпурового тюльпана");
        addBlock(BlockInit.CROP_ORANGE_DAISY, "Насіння помаранчевої маргаритки");
        addBlock(BlockInit.CROP_OSIRIA_ROSE, "Насіння троянди осіріа");
        addBlock(BlockInit.CROP_PEACH_LEATHER_FLOWER, "Насіння персикового повитника");
        addBlock(BlockInit.CROP_PINK_ALLIUM, "Насіння рожевого різанця");
        addBlock(BlockInit.CROP_PINK_ANEMONE, "Насіння рожевої анемони");
        addBlock(BlockInit.CROP_PINK_DAFFODIL, "Насіння рожевого нарциса");
        addBlock(BlockInit.CROP_PROTEA_FLOWER, "Насіння протеї");
        addBlock(BlockInit.CROP_PURPLE_SAGE, "Насіння фіолетової шавлії");
        addBlock(BlockInit.CROP_PURPLE_TULIP, "Насіння фіолетового тюльпана");
        addBlock(BlockInit.CROP_RICHEA, "Насіння ричеї");
        addBlock(BlockInit.CROP_ROSE, "Насіння троянди");
        addBlock(BlockInit.CROP_SILVER_VASE_FLOWER, "Насіння ехмеї смугастої");
        addBlock(BlockInit.CROP_TORCH_GINGER, "Насіння етлінгери");
        addBlock(BlockInit.CROP_VIOLET_LEATHER_FLOWER, "Насіння фіолетового повитника");
        addBlock(BlockInit.CROP_WHITE_ANEMONE, "Насіння білої анемони");
        addBlock(BlockInit.CROP_WHITE_SAGE, "Насіння білої шавлії");
        addBlock(BlockInit.CROP_YELLOW_DAFFODIL, "Насіння жовтого нарциса");
        addBlock(BlockInit.CROP_YELLOW_TULIP, "Насіння жовтого тюльпана");

    }

    private void addItemGroups() {
        add("itemGroup.flowerseeds", "Насіння квітів");
    }

}