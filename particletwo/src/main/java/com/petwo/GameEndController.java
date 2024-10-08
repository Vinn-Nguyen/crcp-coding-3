package com.petwo;
import processing.core.*;

public class GameEndController extends GameController{
    GameEndController(PApplet main_){
        super(main_);
    }

    public void draw(){ //Gameover end screen
        main.background(0);
        main.fill(255);
        main.text("Game Over", main.width/2, main.height/2);
    }
    public void mouseDragged(){

    }
    public void keyPressed(){

    }
}
