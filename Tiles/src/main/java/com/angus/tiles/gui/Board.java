package com.angus.tiles.gui;

import com.angus.tiles.logic.Level;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener{
    static int timerDelay = 250;
    int tick = 0;
    Timer t;

    public Board(){
        initFrame();
        setBackground(new Color(30,30,30));
        t = new Timer(timerDelay, this);
        t.start();
    }

    Level level;
    TileMap tm;
    public void loadLevel(Level level){
        this.level = level;
        tm = new TileMap(level.getUsed());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int col;
        int row;

        for(row = 0; row<6; row++){
            for(col = 0; col<10; col++){
                char h = level.getMap()[row][col];
                Sprite s = tm.getTile(h);
                g.drawImage(s.getSprite(tick%4),60+(60*col),60+(60*row),null);
            }
        }
        g.drawString(this.getSize().toString(),0,30);
    }

    private void initFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Tiles");
        this.setPreferredSize(new Dimension(720,480));
        frame.getContentPane().add( this );
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tick++;
        if (tick%12==0) {
            tm.shuffle();
        }
        this.repaint();
    }
}
