package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;

import java.awt.*;

public class Snow {
    private Color color;
    private int width;
    private int height;

    public Snow(Color color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(0, 300, width, height - 300);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
