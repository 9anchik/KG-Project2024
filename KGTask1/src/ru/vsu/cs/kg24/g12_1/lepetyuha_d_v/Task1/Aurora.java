package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;

import java.awt.*;

public class Aurora {
    private Color color1;
    private Color color2;
    private int height;

    public Aurora(Color color1, Color color2, int height) {
        this.color1 = color1;
        this.color2 = color2;
        this.height = height;
    }


    public void draw(Graphics2D g, int width) {


        GradientPaint gradient = new GradientPaint(0, 0, color1, 0, height, color2);
        g.setPaint(gradient);
        g.fillRect(0, 0, width, height);
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

