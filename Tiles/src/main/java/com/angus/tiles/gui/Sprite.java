package com.angus.tiles.gui;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Sprite {

    private BufferedImage sheet;

    public Sprite(){}

    public Sprite (String file){
        sheet = null;

        ClassLoader classLoader = new Sprite().getClass().getClassLoader();

        try {
            sheet = ImageIO.read(new File(classLoader.getResource(file).getFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public BufferedImage getSprite(int i){
        return sheet.getSubimage(i*50, 0, 50,50);
    }

}
