package com.petwo;
import java.util.ArrayList;
import processing.core.*;

public class Squares{
    PApplet main;
    ArrayList<Square> squArray = new ArrayList<Square>();
    int sqCount = 10;
    Square square;

    Squares(PApplet main_){
        main = main_;
    }

    void setup(){
        main.background(0);
        for(int i = 0; i < sqCount; i++){
            squArray.add(new Square(main.random(main.width), main.random(main.height), 10.f, main, main.color(255)));
        }

    }

    void draw(){
        main.background(0);
        for(Square square : squArray){
            square.draw();
        }
    }

    void mousePressed(){
        for(Square square : squArray){
            square.faster();
        }  
    }
}
