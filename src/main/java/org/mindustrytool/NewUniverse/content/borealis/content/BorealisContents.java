package org.mindustrytool.NewUniverse.content.borealis.content;

import mindustry.type.Item;
import mindustry.type.UnitType;
import mindustry.world.Block;
import org.mindustrytool.NewUniverse.content.borealis.content.building.BorealisCoreBlocks;
import org.mindustrytool.NewUniverse.content.borealis.content.building.BorealisDefenseBlocks;
import org.mindustrytool.NewUniverse.content.borealis.content.building.BorealisDistributionBlocks;
import org.mindustrytool.NewUniverse.content.borealis.content.building.BorealisDrillBlocks;
import org.mindustrytool.NewUniverse.content.borealis.content.building.BorealisPowerBlocks;
import org.mindustrytool.NewUniverse.content.borealis.content.building.BorealisProductionBlocks;
import org.mindustrytool.NewUniverse.content.borealis.content.building.BorealisTurretBlocks;
import org.mindustrytool.NewUniverse.content.borealis.content.enviroment.BorealisEnvironmentBlocks;
import org.mindustrytool.NewUniverse.content.borealis.content.enviroment.BorealisOres;
import org.mindustrytool.NewUniverse.content.borealis.content.item.BorealisItems;
import org.mindustrytool.NewUniverse.content.borealis.content.item.BorealisLiquids;
import org.mindustrytool.NewUniverse.content.borealis.content.unit.air.BorealisCoreUnitTypes;
import org.mindustrytool.NewUniverse.content.borealis.content.unit.air.BorealisDiphdaUnitTypes;
import org.mindustrytool.NewUniverse.content.borealis.content.unit.air.BorealisJuniorUnitTypes;
import org.mindustrytool.NewUniverse.content.borealis.content.unit.air.BorealisVeggvisUnitTypes;
import org.mindustrytool.NewUniverse.content.borealis.content.unit.ground.BorealisNoaUnitTypes;
import org.mindustrytool.NewUniverse.content.borealis.content.unit.naval.BorealisIndusUnitTypes;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor(onConstructor_ = @Inject)
public class BorealisContents {

    private final BorealisItems items;
    private final BorealisLiquids liquids;
    private final BorealisIndusUnitTypes naval;
    private final BorealisNoaUnitTypes ground;
    private final BorealisCoreUnitTypes core;
    private final BorealisVeggvisUnitTypes veggvis;
    private final BorealisJuniorUnitTypes junior;
    private final BorealisDiphdaUnitTypes air;
    private final BorealisCoreBlocks coreBlocks;
    private final BorealisDefenseBlocks defenseBlocks;
    private final BorealisDistributionBlocks distributionBlocks;
    private final BorealisDrillBlocks drillBlocks;
    private final BorealisPowerBlocks powerBlocks;
    private final BorealisProductionBlocks productionBlocks;
    private final BorealisTurretBlocks turretBlocks;
    private final BorealisEnvironmentBlocks environmentBlocks;
    private final BorealisOres ores;

    // items
    public Item cophalast;

    // liquids
    public mindustry.type.Liquid barbavior;
    public mindustry.type.Liquid fortial;
    public mindustry.type.Liquid horani;

    public Item duras;
    public Item fabris;
    public Item farasAlloy;
    public Item flaxol;
    public Item navitas;
    public Item pausis;
    public Item rudis;
    public Item sand;
    public Item simus;
    public Item temperedGlass;
    public Item tentias;
    public Item vastum;

    // core air units
    public UnitType miles;
    public UnitType caesar;
    public UnitType imperium;

    // attacker units
    public UnitType veggvisUnit;
    public UnitType hermod;
    public UnitType valkyrie;
    public UnitType odin;
    public UnitType ragnarok;

    // supporter units
    public UnitType juniorUnit;
    public UnitType centia;
    public UnitType veralia;
    public UnitType impetuo;
    public UnitType auxiol;
    public UnitType prider;

    // air units
    public UnitType diphda;
    public UnitType procyon;
    public UnitType sirius;
    public UnitType altiar;
    public UnitType spearhead;

    // ground units
    public UnitType noa;
    public UnitType external;
    public UnitType siriusMech;
    public UnitType ion;
    public UnitType xyrus;

    // naval units
    public UnitType indus;
    public UnitType imperi;
    public UnitType sruza;
    public UnitType crater;
    public UnitType cetus;

    // building blocks
    public Block coreBasis;
    public Block coreCentrum;
    public Block corePreatorium;

    // distribution
    public Block conduit;
    public Block conduitRouter;
    public Block conduitJunction;
    public Block conduitBridge;
    public Block liquidContainer;
    public Block liquidTank;
    public Block duct;
    public Block armoredDuct;
    public Block ductRouter;
    public Block ductBridge;
    public Block overflowDuct;
    public Block unoverflowDuct;

    // power (preview)
    public Block pwr2a;
    public Block pwr2b;
    public Block pwr3a;
    public Block pwr3b;
    public Block pwr3c;
    public Block pwr3d;
    public Block pwr4a;

    // production (tier 1-5)
    public Block runeForge;
    public Block alfKiln;
    public Block flaxolCrucible;
    public Block dwarfAnvil;
    public Block farasSmelter;
    public Block seidrCauldron;
    public Block aetherForge;
    public Block aesirResonator;
    public Block odinsForge;
    // drills
    public Block rootDrill;
    public Block dwarfBorer;
    public Block bifrostExtractor;

    // defense
    public Block stoneRampart;
    public Block alloyBulwark;
    public Block tentiasBarrier;

    // power
    public Block runeGenerator;
    public Block crystalReactor;
    public Block bifrostArray;
    public Block yggdrasilCore;
    public Block runeCapacitor;
    public Block powerNode;
    public Block powerNodeLarge;

    // turrets
    public Block ferios;
    public Block augero;
    public Block dustria;
    public Block agatias;
    public Block tormentis;
    public Block pila;
    public Block propius;
    public Block lucis;
    public Block novolary;

    // environment floors
    public Block stoneFloor;
    public Block redFloor;
    public Block iceFloor;
    public Block darkblueFloor;
    public Block darkDirtFloor;
    public Block blueCrystalFloor;
    public Block denseBlueCrystalFloor;
    public Block sandFloor;

    // environment walls
    public Block wallBlock;
    public Block redWall;
    public Block redDirtWall;
    public Block iceWall;
    public Block darkblueWall;
    public Block blueCrystalWall;

    // environment ores
    public Block oreCophalast;
    public Block oreDuras;
    public Block oreNavitas;
    public Block oreVastum;
    public Block oreWallPausis;
    public Block oreRudis;
    public Block oreSand;

    // environment props
    public Block boulder;
    public Block redBoulder;
    public Block iceBoulder;
    public Block darkblueBoulder;
    public Block darkDirtBoulder;
    public Block redCrystalCluster;
    public Block blueCrystalBlocks;

    public void loadContent() {
        items.loadContent();
        cophalast = items.cophalast;
        duras = items.duras;
        fabris = items.fabris;
        farasAlloy = items.farasAlloy;
        flaxol = items.flaxol;
        navitas = items.navitas;
        pausis = items.pausis;
        rudis = items.rudis;
        sand = items.sand;
        simus = items.simus;
        temperedGlass = items.temperedGlass;
        tentias = items.tentias;
        vastum = items.vastum;

        liquids.loadContent();
        barbavior = liquids.barbavior;
        fortial = liquids.fortial;
        horani = liquids.horani;

        core.loadContent();
        miles = core.miles;
        caesar = core.caesar;
        imperium = core.imperium;

        veggvis.loadContent();
        veggvisUnit = veggvis.veggvis;
        hermod = veggvis.hermod;
        valkyrie = veggvis.valkyrie;
        odin = veggvis.odin;
        ragnarok = veggvis.ragnarok;

        junior.loadContent();
        juniorUnit = junior.junior;
        centia = junior.centia;
        veralia = junior.veralia;
        impetuo = junior.impetuo;
        auxiol = junior.auxiol;
        prider = junior.prider;

        air.loadContent();
        diphda = air.diphda;
        procyon = air.procyon;
        sirius = air.sirius;
        altiar = air.altiar;
        spearhead = air.spearhead;

        ground.loadContent();
        noa = ground.noa;
        external = ground.external;
        siriusMech = ground.siriusMech;
        ion = ground.ion;
        xyrus = ground.xyrus;

        naval.loadContent();
        indus = naval.indus;
        imperi = naval.imperi;
        sruza = naval.sruza;
        crater = naval.crater;
        cetus = naval.cetus;

        coreBlocks.loadContent();
        coreBasis = coreBlocks.coreBasis;
        coreCentrum = coreBlocks.coreCentrum;
        corePreatorium = coreBlocks.corePreatorium;

        ores.loadContent();
        oreCophalast = ores.oreCophalast;
        oreDuras = ores.oreDuras;
        oreNavitas = ores.oreNavitas;
        oreVastum = ores.oreVastum;
        oreWallPausis = ores.oreWallPausis;
        oreRudis = ores.oreRudis;
        oreSand = ores.oreSand;

        distributionBlocks.loadContent();
        conduit = distributionBlocks.conduit;
        conduitRouter = distributionBlocks.conduitRouter;
        conduitJunction = distributionBlocks.conduitJunction;
        conduitBridge = distributionBlocks.conduitBridge;
        liquidContainer = distributionBlocks.liquidContainer;
        liquidTank = distributionBlocks.liquidTank;
        duct = distributionBlocks.duct;
        armoredDuct = distributionBlocks.armoredDuct;
        ductRouter = distributionBlocks.ductRouter;
        ductBridge = distributionBlocks.ductBridge;
        overflowDuct = distributionBlocks.overflowDuct;
        unoverflowDuct = distributionBlocks.unoverflowDuct;

        powerBlocks.loadContent();
        runeGenerator = powerBlocks.runeGenerator;
        crystalReactor = powerBlocks.crystalReactor;
        bifrostArray = powerBlocks.bifrostArray;
        yggdrasilCore = powerBlocks.yggdrasilCore;
        runeCapacitor = powerBlocks.runeCapacitor;
        powerNode = powerBlocks.powerNode;
        powerNodeLarge = powerBlocks.powerNodeLarge;

        drillBlocks.loadContent();
        rootDrill = drillBlocks.rootDrill;
        dwarfBorer = drillBlocks.dwarfBorer;
        bifrostExtractor = drillBlocks.bifrostExtractor;

        defenseBlocks.loadContent();
        stoneRampart = defenseBlocks.stoneRampart;
        alloyBulwark = defenseBlocks.alloyBulwark;
        tentiasBarrier = defenseBlocks.tentiasBarrier;

        productionBlocks.loadContent();
        runeForge = productionBlocks.runeForge;
        alfKiln = productionBlocks.alfKiln;
        flaxolCrucible = productionBlocks.flaxolCrucible;
        dwarfAnvil = productionBlocks.dwarfAnvil;
        farasSmelter = productionBlocks.farasSmelter;
        seidrCauldron = productionBlocks.seidrCauldron;
        aetherForge = productionBlocks.aetherForge;
        aesirResonator = productionBlocks.aesirResonator;
        odinsForge = productionBlocks.odinsForge;

        turretBlocks.loadContent();
        ferios = turretBlocks.ferios;
        augero = turretBlocks.augero;
        dustria = turretBlocks.dustria;
        agatias = turretBlocks.agatias;
        tormentis = turretBlocks.tormentis;
        pila = turretBlocks.pila;
        propius = turretBlocks.propius;
        lucis = turretBlocks.lucis;
        novolary = turretBlocks.novolary;

        environmentBlocks.loadContent();
        stoneFloor = environmentBlocks.stoneFloor;
        redFloor = environmentBlocks.redFloor;
        iceFloor = environmentBlocks.iceFloor;
        darkblueFloor = environmentBlocks.darkblueFloor;
        darkDirtFloor = environmentBlocks.darkDirtFloor;
        blueCrystalFloor = environmentBlocks.blueCrystalFloor;
        denseBlueCrystalFloor = environmentBlocks.denseBlueCrystalFloor;
        sandFloor = environmentBlocks.sandFloor;
        wallBlock = environmentBlocks.wallBlock;
        redWall = environmentBlocks.redWall;
        redDirtWall = environmentBlocks.redDirtWall;
        iceWall = environmentBlocks.iceWall;
        darkblueWall = environmentBlocks.darkblueWall;
        blueCrystalWall = environmentBlocks.blueCrystalWall;
        boulder = environmentBlocks.boulder;
        redBoulder = environmentBlocks.redBoulder;
        iceBoulder = environmentBlocks.iceBoulder;
        darkblueBoulder = environmentBlocks.darkblueBoulder;
        darkDirtBoulder = environmentBlocks.darkDirtBoulder;
        redCrystalCluster = environmentBlocks.redCrystalCluster;
        blueCrystalBlocks = environmentBlocks.blueCrystalBlocks;
    }
}
