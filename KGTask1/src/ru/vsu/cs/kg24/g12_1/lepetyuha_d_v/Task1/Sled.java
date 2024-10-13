package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;

import java.awt.*;

public class Sled {
    private int x;
    private int y;
    private int width;
    private int height;

    public Sled(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    // что-то похожее на сани :)

    public void draw(Graphics2D g) {

        g.setColor(new Color(139, 69, 19));
        g.fillRect(x, y, width, height); // корпус


        g.setColor(Color.BLACK);
        g.drawArc(x - 20, y + height - 15, 40, 30, 0, -180); // левый полоз
        g.drawArc(x + width - 20, y + height - 15, 40, 30, 0, -180); // правый полоз


        g.setColor(Color.GRAY);
        g.drawLine(x + width / 2, y, x + width / 2, y - 20); // Верёвка ( нужно переделать)
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

