package com.petwo;
import processing.core.*;

public abstract class GameController {
    PApplet main;
    int nextController = -1;

    GameController(PApplet main_){
        main = main_;
    }

    public abstract void draw();
    public abstract void mouseDragged();
    public abstract void keyPressed();

    //switch game states?
    public int switchController(){
        return nextController;
    }

    //reset controller to -1
    public void reset(){
        nextController = -1;
    }
}
