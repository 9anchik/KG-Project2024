package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;


import java.awt.*;
import java.util.Random;

public class Cloud {
    private Color color;
    private CloudShape[] cloudShapes;
    private int[] cloudX;
    private int[] speeds;
    private Random random;

    public Cloud(Color color) {
        this.color = color;
        cloudShapes = new CloudShape[3];
        cloudX = new int[3];
        speeds = new int[3];
        random = new Random();

        // инициализация облаков с уникальными скоростями и начальными координатами
        for (int i = 0; i < cloudShapes.length; i++) {
            cloudX[i] = random.nextInt(400) - 200;
            speeds[i] = random.nextInt(3) + 1;


            int y = random.nextInt(50) * 2 + 30;
            cloudShapes[i] = new CloudShape(color, 0, y, 80 + random.nextInt(40), 50);
        }
    }



    public void update() {
        for (int i = 0; i < cloudShapes.length; i++) {
            cloudX[i] += speeds[i]; // перемещение облаков

            // проверка на выход облака за пределы окна
            if (cloudX[i] > 800) {
                cloudX[i] = -200;
            }
        }
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < cloudShapes.length; i++) {
            CloudShape shape = cloudShapes[i];
            shape.draw(g2d, cloudX[i]);
        }
    }

    private static class CloudShape {
        private Color color;
        private int y;
        private int width;
        private int height;

        public CloudShape(Color color, int x, int y, int width, int height) {
            this.color = color;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public void draw(Graphics2D g, int x) {

            g.setColor(color);
            g.fillOval(x, y, width, height);
            g.fillOval(x + 30, y - 20, 100, 60);
            g.fillOval(x + 70, y, 80, 50);
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CloudShape[] getCloudShapes() {
        return cloudShapes;
    }

    public void setCloudShapes(CloudShape[] cloudShapes) {
        this.cloudShapes = cloudShapes;
    }

    public int[] getCloudX() {
        return cloudX;
    }

    public void setCloudX(int[] cloudX) {
        this.cloudX = cloudX;
    }

    public int[] getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int[] speeds) {
        this.speeds = speeds;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}


