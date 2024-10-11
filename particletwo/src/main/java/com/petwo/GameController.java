/*
 Name: Wren Nguyen
 Date: Oct.2024
 Description: GameController controlls game state
 */

package com.petwo;
import processing.core.*;

public abstract class GameController {
    Main main;

    //controller variables
    int nextController = -1;
    static final int DO_NOT_CHANGE= -1; //default
    static final int GAME_PLAY = 0; //gameplay
    static final int GAME_END = 1; //game over screen

    GameController(Main main_){
        main = main_;
    }

    public abstract void draw();

    public void mouseDragged(){
        //do nothing
    }
    public void keyPressed(){
        //do nothing
    }

    //switch game states?
    public int switchController(){
        return nextController;
    }

    //reset controller to default
    public void reset(){
        nextController = DO_NOT_CHANGE;
    }
}
