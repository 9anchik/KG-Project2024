package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;

import java.awt.*;

public class Moon {
    private Color color;
    private int x;
    private int y;
    private int diameter;

    public Moon(Color color, int x, int y, int diameter) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x,y,diameter,diameter);
    }
}
