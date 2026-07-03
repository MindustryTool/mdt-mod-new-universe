package org.mindustrytool.NewUniverse.content.borealis.content.item;

import arc.graphics.Color;
import mindustry.type.Liquid;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor(onConstructor_ = @Inject)
public class BorealisLiquids {

    public Liquid cryoWater;
    public Liquid plasmaJuice;

    public void loadContent() {
        cryoWater = new Liquid("cryo-water", Color.valueOf("7EC8E3")) {{
            viscosity = 0.8f;
            temperature = 0.1f;
            heatCapacity = 1.2f;
            barColor = Color.valueOf("5090B0");
            effect = mindustry.content.StatusEffects.freezing;
        }};

        plasmaJuice = new Liquid("plasma-juice", Color.valueOf("FF6B35")) {{
            viscosity = 0.3f;
            temperature = 0.9f;
            heatCapacity = 0.4f;
            flammability = 0.8f;
            barColor = Color.valueOf("D04020");
        }};
    }
}
