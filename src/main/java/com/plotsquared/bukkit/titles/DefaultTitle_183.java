package com.plotsquared.bukkit.titles;

import com.intellectualcrafters.plot.object.PlotPlayer;
import com.plotsquared.bukkit.object.BukkitPlayer;
import org.bukkit.ChatColor;

public class DefaultTitle_183 extends AbstractTitle {
    @Override
    public void sendTitle(final PlotPlayer player, final String head, final String sub, final ChatColor head_color, final ChatColor sub_color, int in, int delay, int out) {
        try {
            final DefaultTitleManager_183 title = new DefaultTitleManager_183(head, sub, in, delay, out);
            title.setTitleColor(head_color);
            title.setSubtitleColor(sub_color);
            title.send(((BukkitPlayer) player).player);
        } catch (final Throwable e) {
            AbstractTitle.TITLE_CLASS = new HackTitle();
            AbstractTitle.TITLE_CLASS.sendTitle(player, head, sub, head_color, sub_color, in, delay, out);
        }
    }
}
