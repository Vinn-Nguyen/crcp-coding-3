package com.petwo;
import processing.core.*;

public abstract class GameController {
    PApplet main;
    GameController(PApplet main_){
        main = main_;
    }

    public abstract void draw();
    public abstract void mouseDragged();
}
