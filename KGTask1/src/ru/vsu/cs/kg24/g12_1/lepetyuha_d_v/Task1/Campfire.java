package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;
import java.awt.*;

public class Campfire {
    private int x;
    private int y;
    private int width;
    private int height;

    public Campfire(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g) {

        //  дрова
        g.setColor(new Color(139, 69, 19));
        g.fillRect(x, y, width, height);


        g.fillRect(x - 10, y - 10, width + 20, 10);
        g.fillRect(x + 10, y - 20, width - 20, 10);

        // пламя
        g.setColor(Color.ORANGE);
        Polygon flame1 = new Polygon();
        flame1.addPoint(x + width / 2, y - 30);
        flame1.addPoint(x + 10, y);
        flame1.addPoint(x + width - 10, y);

        g.setColor(Color.YELLOW);
        g.fillPolygon(flame1);


        Polygon flame2 = new Polygon();
        flame2.addPoint(x + width / 2, y - 40);
        flame2.addPoint(x + 20, y - 10);
        flame2.addPoint(x + width - 20, y - 10);

        g.setColor(Color.RED);
        g.fillPolygon(flame2);
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

