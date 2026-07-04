package org.mindustrytool.NewUniverse.content.borealis.content.building;

import mindustry.content.Liquids;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.Drill;

import org.mindustrytool.NewUniverse.content.borealis.content.item.BorealisItems;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor(onConstructor_ = @Inject)
public class BorealisDrillBlocks {
    private final BorealisItems items;

    public Block rootDrill;
    public Block dwarfBorer;
    public Block bifrostExtractor;

    public void loadContent() {
        rootDrill = new Drill("root-drill") {{
            requirements(Category.production, ItemStack.with(items.rudis, 12));
            size = 2;
            health = 160;
            tier = 2;
            drillTime = 360f;
            hasPower = false;
        }};

        dwarfBorer = new Drill("dwarf-borer") {{
            requirements(Category.production, ItemStack.with(items.simus, 20, items.farasAlloy, 10));
            size = 3;
            health = 320;
            tier = 3;
            drillTime = 240f;
            hasPower = true;
            hasLiquids = true;
            consumePower(1.5f);
            consumeLiquid(Liquids.water, 0.1f).boost();
        }};

        bifrostExtractor = new Drill("bifrost-extractor") {{
            requirements(Category.production, ItemStack.with(items.farasAlloy, 40, items.navitas, 30));
            size = 4;
            health = 640;
            tier = 5;
            drillTime = 180f;
            hasPower = true;
            drawRim = true;
            rotateSpeed = 4f;
            consumePower(4f);
        }};
    }
}