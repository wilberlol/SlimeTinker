package io.github.sefiraat.slimetinker.runnables.event;

import io.github.sefiraat.slimetinker.utils.WorldUtils;
import org.bukkit.entity.Wolf;
import org.bukkit.scheduler.BukkitRunnable;

public class RemoveWolf extends BukkitRunnable {

    private final Wolf wolf;

    public RemoveWolf(Wolf wolf) {
        this.wolf = wolf;
    }

    @Override
    public void run() {
        if (WorldUtils.isDisabled(wolf)) {
            cancel();
            return;
        }
        wolf.remove();
        this.cancel();
    }
}
