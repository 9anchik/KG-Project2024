package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;


import java.awt.*;
import java.util.List;
import java.util.Random;

import java.util.ArrayList;

public class Snowfall {
    private List<Snowflake> snowflakes; // Список снежинок

    public Snowfall(int numberOfSnowflakes, int width, int height) {
        snowflakes = new ArrayList<>();
        Random rand = new Random();

        // Инициализация снежинок
        for (int i = 0; i < numberOfSnowflakes; i++) {
            int x = rand.nextInt(width); // Случайное начальное x
            int y = rand.nextInt(height); // Случайное начальное y
            int size = rand.nextInt(5) + 2; // Случайный размер
            int speed = rand.nextInt(3) + 1; // Случайная скорость
            snowflakes.add(new Snowflake(x, y, size, speed));
        }
    }

    // Метод обновления состояния снежинок
    public void update(int height) {
        for (Snowflake snowflake : snowflakes) {
            snowflake.update(height); // Обновление каждой снежинки
        }
    }

    // Метод отрисовки снежинок
    public void draw(Graphics2D g) {
        for (Snowflake snowflake : snowflakes) {
            snowflake.draw(g); // Отрисовка каждой снежинки
        }
    }
}



