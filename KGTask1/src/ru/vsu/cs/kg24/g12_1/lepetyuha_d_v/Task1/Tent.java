package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;


import java.awt.*;

public class Tent {
    private int x; // X-координата вигвама
    private int y; // Y-координата вигвама
    private int width; // Ширина вигвама
    private int height; // Высота вигвама

    public Tent(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g) {


        g.setColor(new Color(139, 69, 19));

        // Стены вигвама
        g.fillPolygon(new int[]{x, x + width, x + width / 2}, new int[]{y + height, y + height, y}, 3);

        // Основной цвет
        g.setColor(new Color(255, 228, 196)); // Цвет вигвама
        g.fillPolygon(new int[]{x + 5, x + width - 5, x + width / 2}, new int[]{y + height - 5, y + height - 5, y + 5}, 3);

        // Вход
        g.setColor(new Color(121,85,61));
        int entranceHeight = 80; // Высота входа
        int entranceY = y + height - entranceHeight; // Положение Y для входа
        g.fillRect(x + width / 4, entranceY, width / 2, entranceHeight);

        g.setColor(new Color(139, 69, 19)); // Цвет палки
        g.drawLine(x + width / 2, y, x + width / 2, y - 30); // Центральная палка

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

