package org.example;

import java.awt.*;

class Player {
    int x, y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx) {
        x += dx;
        if (x < 0) x = 0;
        if (x > 760) x = 760;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 30, 30);
    }
}
