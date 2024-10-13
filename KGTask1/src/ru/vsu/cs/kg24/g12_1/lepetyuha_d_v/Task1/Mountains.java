package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;

import java.awt.*;


public class Mountains {
    private int[] xPoints;
    private int[] yPoints;

    public Mountains(int[] xPoints, int[] yPoints) {
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(169, 169, 169));
        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }

    public int[] getxPoints() {
        return xPoints;
    }

    public void setxPoints(int[] xPoints) {
        this.xPoints = xPoints;
    }

    public int[] getyPoints() {
        return yPoints;
    }

    public void setyPoints(int[] yPoints) {
        this.yPoints = yPoints;
    }
}



