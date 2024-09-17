/*
Name: Wren Nguyen
Date: 9/16/2024
Project Name: Particle Engine
Description: Particle engine simualtion
 */

package com.processing_pe;
import processing.core.*;
import java.util.ArrayList;

public class Animate {
    PApplet main;

    ArrayList<Square> squares;
    Square square;

    //COLOR VALUES
    int alpha = 200; //transparent value
    int blue = main.color(56, 255, 255, alpha); //blue
    int purple = main.color(175, 75, 255, alpha); //purple
    int pink = main.color(255, 97, 158, alpha); // pink
    int yellow = main.color(255, 241, 89, alpha); //yellow
    int black = main.color(0); //black
    int white = main.color(255); //white

    
    //Square arrayOne[] = new Square [main.max]; //1st array holding  squares
    //Square arrayTwo[] = new Square [max]; //2nd array holding squares

    Animate(PApplet main_){
        main = main_;
        squares = new ArrayList<Square>();
    }

    public void setup(){
        main.background(0);
        square = new Square(this);
    }

    void draw(){
        main.fill(255);
        main.background(black);
        square.draw();
        square.click();
    }

}
