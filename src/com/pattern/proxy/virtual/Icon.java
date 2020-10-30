package com.pattern.proxy.virtual;

import java.awt.*;

/**
 * @author liupeng
 * @date 2020/10/30
 */
public interface Icon {

    int getIconWidth();

    int getIconHeight();

    void paintIcon(final Component c, Graphics g, int x, int y);
}
