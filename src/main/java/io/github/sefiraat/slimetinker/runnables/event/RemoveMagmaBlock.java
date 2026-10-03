package io.github.sefiraat.slimetinker.runnables.event;

import io.github.sefiraat.slimetinker.utils.WorldUtils;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.scheduler.BukkitRunnable;

public class RemoveMagmaBlock extends BukkitRunnable {

    private final Block block;

    public RemoveMagmaBlock(Block block) {
        this.block = block;
    }

    @Override
    public void run() {
        if (WorldUtils.isDisabled(block)) {
            cancel();
            return;
        }
        block.setType(Material.LAVA);
    }
}
