package org.mindustrytool.NewUniverse;

import arc.util.CommandHandler;
import arc.util.Log;
import mindustry.mod.Mod;
import org.mindustrytool.NewUniverse.content.NewUniverseBlocks;
import org.mindustrytool.NewUniverse.content.NewUniverseItems;
import org.mindustrytool.NewUniverse.content.NewUniversePlanets;
import org.mindustrytool.NewUniverse.content.NewUniverseTechTree;
import org.mindustrytool.NewUniverse.content.NewUniverseUnitTypes;

/**
 * Main entry point for the New Universe Mindustry mod.
 *
 * HJSON content files in content/{items,units,...}/ are auto-loaded by
 * the game's Mods.loadContent() — no Java code needed to register them.
 *
 * Use loadContent() only for content that requires programmatic logic
 * (custom AI, conditional stats, dynamic effects, etc.).
 */
public class NewUniverseMod extends Mod {

    public NewUniverseMod() {
        Log.info("New Universe mod loaded.");
        // Events.on(EventType.ClientLoadEvent.class, e -> { ... });
    }

    @Override
    public void loadContent() {
        Log.info("New Universe: loading custom content.");

        // Load static content classes — static field initializers auto-register
        NewUniverseItems.load();
        NewUniverseBlocks.load();
        NewUniverseUnitTypes.load();
        NewUniversePlanets.load();
        NewUniverseTechTree.load();
    }

    @Override
    public void init() {
    }

    @Override
    public void registerServerCommands(CommandHandler handler) {
        // Register server-side commands.
    }

    @Override
    public void registerClientCommands(CommandHandler handler) {
        // Register client-side commands.
    }
}
