package org.mindustrytool.NewUniverse.content.borealis.content.building;

import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;

import org.mindustrytool.NewUniverse.content.borealis.content.item.BorealisItems;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor(onConstructor_ = @Inject)
public class BorealisDefenseBlocks {
    private final BorealisItems items;

    public Block stoneRampart;
    public Block alloyBulwark;
    public Block tentiasBarrier;

    public void loadContent() {
        stoneRampart = new Wall("stone-rampart") {{
            requirements(Category.defense, ItemStack.with(items.rudis, 6));
            health = 240;
            armor = 2;
            size = 1;
        }};

        alloyBulwark = new Wall("alloy-bulwark") {{
            requirements(Category.defense, ItemStack.with(items.farasAlloy, 6, items.simus, 3));
            health = 480;
            armor = 4;
            size = 1;
        }};

        tentiasBarrier = new Wall("tentias-barrier") {{
            requirements(Category.defense, ItemStack.with(items.tentias, 6, items.duras, 3));
            health = 1200;
            armor = 8;
            size = 1;
        }};
    }
}