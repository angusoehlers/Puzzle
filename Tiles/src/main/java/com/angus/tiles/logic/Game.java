package com.angus.tiles.logic;

public class Game {
    public Level level;
    public Game(){
        gameInit();
    }

    protected void gameInit(){
        level = new Level(0);
    }

}
