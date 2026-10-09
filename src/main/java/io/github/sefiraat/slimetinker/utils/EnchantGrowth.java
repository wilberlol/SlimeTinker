package io.github.sefiraat.slimetinker.utils;

import io.github.sefiraat.slimetinker.SlimeTinker;

/**
 * Central switch for every SlimeTinker mechanic that raises enchantment levels on an item
 * (silver "Enchanting" traits and the Infinity plate "Infinite Power" trait).
 * Controlled by {@code disable-enchant-growth} in config.yml (default: true = growth disabled).
 */
public final class EnchantGrowth {

    private EnchantGrowth() {
    }

    public static boolean isDisabled() {
        SlimeTinker plugin = SlimeTinker.getInstance();
        return plugin == null || plugin.getConfig().getBoolean("disable-enchant-growth", true);
    }

    /** Lore helper: strikes the line through and appends a note when the mechanic is disabled. */
    public static String lore(String text) {
        return isDisabled() ? "§m" + text + "§r §c(已停用)" : text;
    }
}
