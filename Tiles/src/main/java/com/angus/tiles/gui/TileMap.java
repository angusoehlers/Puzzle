package com.angus.tiles.gui;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class TileMap {

    char tiles[];
    ArrayList<Sprite> sprites = new ArrayList<Sprite>();

    public TileMap(char tiles[]){
        addSprites();
        this.tiles = tiles;
    }

    private void addSprites(){
        sprites.add(new Sprite("TileSprite_Blue1.png"));
        sprites.add(new Sprite("TileSprite_Red.png"));
        sprites.add(new Sprite("TileSprite_Yellow.png"));
        sprites.add(new Sprite("TileSprite_Green.png"));
        sprites.add(new Sprite("TileSprite_Purple.png"));
        sprites.add(new Sprite("TileSprite_Grey.png"));
        sprites.add(new Sprite("TileSprite_Blue2.png"));
        sprites.add(new Sprite("TileSprite_Orange.png"));
        //sprites.add(new Sprite("PlayerSprite.png"));


    }

    public void shuffle(){
        Collections.shuffle(sprites);
    }

    public Sprite getTile(char c){
        int i = 0;
        while(i<tiles.length){
            if(tiles[i]==c){
                return sprites.get(i);
            }
            i++;
        }
        return new Sprite("TileSprite.png");
    }
}
