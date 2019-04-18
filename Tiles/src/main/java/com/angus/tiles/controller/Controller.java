package com.angus.tiles.controller;

import com.angus.tiles.gui.Board;
import com.angus.tiles.logic.Game;
import com.angus.tiles.logic.Level;

public class Controller {

    Game game;
    Board board;
    Level level;

    public static void main(String args[]){
        Controller c = new Controller(new Game(), new Board());

        c.board.loadLevel(c.game.level);

    }

    public Controller(Game g, Board b){
        this.game = g;
        this.board = b;
    }

}
