package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class BubbleShooter extends JPanel implements ActionListener, KeyListener {
//    private Timer timer;
//    private ArrayList<Bubble> bubbles;
//    private Player player;
//    private boolean shooting = false;
//    private Bullet bullet;

//    public BubbleShooter() {
//        setPreferredSize(new Dimension(800, 600));
//        setBackground(Color.BLACK);
//        bubbles = new ArrayList<>();
//        player = new Player(400, 550);
//        bullet = new Bullet(player.x + 10, player.y - 10);
//
//        addBubbles();
//        timer = new Timer(10, this);
//        timer.start();
//
//        setFocusable(true);
//        addKeyListener(this);
//    }

//    private void addBubbles() {
//        Random rand = new Random();
//        for (int i = 0; i < 10; i++) {
//            bubbles.add(new Bubble(rand.nextInt(750), rand.nextInt(300), 30));
//        }
//    }

//    @Override
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        player.draw(g);
//        for (Bubble b : bubbles) {
//            b.draw(g);
//        }
//        if (shooting) {
//            bullet.draw(g);
//        }
//@Override
//public void actionPerformed(ActionEvent e) {
//    if (shooting) {
//        bullet.move();
//        if (bullet.y < 0) {
//            shooting = false;
//        }
//    }
//
//    Iterator<Bubble> iterator = bubbles.iterator();
//    while (iterator.hasNext()) {
//        Bubble b = iterator.next();
//        if (shooting && b.contains(bullet.x, bullet.y)) {
//            iterator.remove();
//            shooting = false;
//        }
//    }
//
//    repaint();
//}

//    @Override
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//            player.move(-10);
//        }
//        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            player.move(10);
//        }
//        if (e.getKeyCode() == KeyEvent.VK_SPACE && !shooting) {
//            shooting = true;
//            bullet = new Bullet(player.x + 10, player.y - 10);
//        }
//    }

//    }

//    @Override
//    public void keyReleased(KeyEvent e) {
//    }

//    @Override
//    public void keyTyped(KeyEvent e) {
//    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Bubble Shooter");
//        BubbleShooter game = new BubbleShooter();
//        frame.add(game);
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
//    }
//}

//class Player {
//    int x, y;
//
//    public Player(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public void move(int dx) {
//        x += dx;
//        if (x < 0) x = 0;
//        if (x > 760) x = 760;
//    }
//
//    public void draw(Graphics g) {
//        g.setColor(Color.WHITE);
//        g.fillRect(x, y, 30, 30);
//    }
}

class Bullet {
    int x, y;

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        y -= 10;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 10, 10);
    }
}

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