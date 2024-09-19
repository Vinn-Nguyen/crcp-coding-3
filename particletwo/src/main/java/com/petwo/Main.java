package com.petwo;
import processing.core.*;

public class Main extends PApplet{

    Squares squares;
    public static void main(String[] args) {
        PApplet.main("com.petwo.Main");
    }

    public void settings(){
        size(500, 500);
        squares = new Squares(this);
    }
    
    public void setup(){
        squares.setup();
    }

    public void draw(){
        squares.draw();
    }

    public void mousePressed(){
        squares.mousePressed();
    }
}