package org.example;

import java.awt.*;

class Bubble {
    int x, y, size;

    public Bubble(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void draw(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillOval(x, y, size, size);
    }

    public boolean contains(int bx, int by) {
        int dx = bx - (x + size / 2);
        int dy = by - (y + size / 2);
        return dx * dx + dy * dy < (size / 2) * (size / 2);
    }


}
