package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;

import java.awt.*;
import java.util.Random;

public class Snowflake {
    int x, y;
    int size;
    int speed;

    public Snowflake(int x, int y, int size, int speed) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
    }

    public void update(int height) {
        y += speed;
        if (y > height) {
            y = 0;
            x = new Random().nextInt(800); // Перезаписываем координату x
        }
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, size, size);
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}