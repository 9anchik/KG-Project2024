package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;


import java.awt.*;

public class Tree {
    private Color treeColor;
    private Color trunkColor;

    public Tree(Color treeColor, Color trunkColor) {
        this.treeColor = treeColor;
        this.trunkColor = trunkColor;
    }

    public void draw(Graphics2D g) {
        // Отрисовка деревьев слева
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 100; j += 100) {
                if ((i + j / 100) % 2 == 0) {
                    int x = i * 100;
                    // Ствол
                    g.setColor(trunkColor);
                    g.fillRect(x + 20, j + 300, 20, 60);
                    // Крона (треугольник)
                    g.setColor(treeColor);
                    g.fillPolygon(new int[]{x + 0, x + 30, x + 60}, new int[]{j + 300, j + 200, j + 300}, 3);
                    g.fillPolygon(new int[]{x + 10, x + 30, x + 50}, new int[]{j + 240, j + 180, j + 240}, 3);
                    g.fillPolygon(new int[]{x + 20, x + 30, x + 40}, new int[]{j + 180, j + 150, j + 180}, 3);
                }
            }
        }

        // Отрисовка деревьев справа
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 100; j += 100) {
                if ((i + j / 100) % 2 == 0) {
                    int x = 800 - (i * 100 + 40);
                    // Ствол
                    g.setColor(trunkColor);
                    g.fillRect(x + 20, j + 300, 20, 60);
                    // Крона (треугольник)
                    g.setColor(treeColor);
                    g.fillPolygon(new int[]{x , x + 30, x + 60}, new int[]{j + 300, j + 200, j + 300}, 3);
                    g.fillPolygon(new int[]{x + 10, x + 30, x + 50}, new int[]{j + 240, j + 180, j + 240}, 3);
                    g.fillPolygon(new int[]{x + 20, x + 30, x + 40}, new int[]{j + 180, j + 150, j + 180}, 3);
                }
            }
        }
    }

    public Color getTreeColor() {
        return treeColor;
    }

    public void setTreeColor(Color treeColor) {
        this.treeColor = treeColor;
    }

    public Color getTrunkColor() {
        return trunkColor;
    }

    public void setTrunkColor(Color trunkColor) {
        this.trunkColor = trunkColor;
    }
}



