package com.petwo;
import java.util.ArrayList;
import processing.core.*;

public class Squares {
    PApplet main;
    ArrayList<Square> squares = new ArrayList<>(400);
    Square square;

    Squares(PApplet main_){
        main = main_;
    }

    void setup(){
        main.background(0);
        square = new Square(main.width/2.0f, main.height*.10f, 50.f, main, main.color(255));
    }

    void draw(){
        main.noStroke();
        main.background(0);
        square.draw();
        for(Squares square : squares){
            
        }
    }

    void mousePressed(){
        square.faster();
    }
}
