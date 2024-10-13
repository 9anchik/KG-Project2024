package ru.vsu.cs.kg24.g12_1.lepetyuha_d_v.Task1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawPanel extends JPanel implements ActionListener {

    private final Sky sky;
    private final List<Mountains> mountain = new ArrayList<>();
    private final Snow snow;
    private final List<Tree> tree = new ArrayList<>();
    private final Moon moon;
    private final Cloud cloud ;
    private final Tent tent;
    private final List<Snowflake> snowflakes = new ArrayList<>();
    private final Aurora aurora;
    private final Sled sled;
    private final Campfire fire;

    public DrawPanel() {
        Random rand = new Random();

        sky = new Sky(new Color(0, 33, 55), 800, 600);

        mountain.add(new Mountains(new int[]{150, 300, 450}, new int[]{300, 100, 300}));

        mountain.add(new Mountains(new int[]{350, 500, 650}, new int[]{300, 120, 300}));

        mountain.add(new Mountains(new int[]{50, 150, 250}, new int[]{300, 150, 300}));

        mountain.add(new Mountains(new int[]{550, 700, 850}, new int[]{300, 180, 300}));

        snow = new Snow(new Color(255, 255, 255), 800, 600);

        tree.add(new Tree(new Color(0, 128, 0), new Color(139, 69, 19)));

        moon = new Moon(new Color(226, 238, 200), 600, 50, 80);

        cloud = new Cloud(new Color(255, 255, 255));

        tent = new Tent(330, 300, 200, 200);

        aurora = new Aurora(new Color(0, 255, 0, 128), new Color(255, 0, 255, 128), 300);

        sled = new Sled(200, 450, 80, 30);

        fire = new Campfire(410, 550, 30, 10);

        for (int i = 0; i < 100; i++) {
            snowflakes.add(new Snowflake(rand.nextInt(800), rand.nextInt(600), rand.nextInt(5) + 2, rand.nextInt(3) + 1));
        }


        Timer timer = new Timer(30, this);
        timer.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);



        sky.draw((Graphics2D) g);
        aurora.draw((Graphics2D) g,getWidth());
        moon.draw((Graphics2D) g);

        snow.draw((Graphics2D) g);

        for (Snowflake snowflake : snowflakes) {
            snowflake.draw((Graphics2D) g);
        }

        for (Mountains mountain : mountain){
            mountain.draw(g);
        }

        for (Tree tree : tree){
            tree.draw((Graphics2D) g);
        }

        cloud.draw(g);
        tent.draw((Graphics2D) g);

        sled.draw((Graphics2D) g);
        fire.draw((Graphics2D) g);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cloud.update();

        for (Snowflake snowflake : snowflakes) {
            snowflake.update(getHeight());
        }

        repaint();
    }
}

