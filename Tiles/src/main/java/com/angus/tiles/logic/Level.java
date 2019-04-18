package com.angus.tiles.logic;

import java.util.ArrayList;

public class Level {
    private ArrayList<char[][]> maps = new ArrayList<char[][]>();
    private ArrayList<char[]> usedTiles = new ArrayList<char[]>();
    private ArrayList<int[]> startPos = new ArrayList<int[]>();

    private char[][] map;
    private char[] used;
    private int [] start;
    private int levelNo = 0;

    public Level (int i){
        loadMaps();
        levelNo = i;
        this.start = startPos.get(levelNo);
        this.map = maps.get(levelNo);
        this.used = usedTiles.get(levelNo);
    }

    public char[][] getMap(){
        return this.map;
    }

    public char[] getUsed(){
        return this.used;
    }

    public int[] getStart(){
        return this.start;
    }

    public void nextLevel(){
        levelNo++;
        if (levelNo<maps.size()){
            this.map = maps.get(levelNo);
            this.used = usedTiles.get(levelNo);
            this.start = startPos.get(levelNo);
        }else{
            levelNo = -1;
            nextLevel();
        }


    }

    private void loadMaps(){ // eventually replace with file loading
        maps.add(new char[][] {
                {'w','w','w','w','w','w','w','w','w','w'},
                {'p','p','w','w','w','w','w','w','w','w'},
                {'s','p','p','p','p','p','w','w','p','f'},
                {'p','p','w','w','p','p','p','p','p','f'},
                {'w','w','w','w','w','w','w','w','p','f'},
                {'w','w','w','w','w','w','w','w','w','w'}
        });
        usedTiles.add(new char[] {'w','p','s','f'});
        startPos.add(new int[] {2,0});
    }
}
