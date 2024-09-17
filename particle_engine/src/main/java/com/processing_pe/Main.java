/*
Name: Wren Nguyen
Project Name: Particle Engine
Date: 9.16.2024
Description: 502 particles total.
- If 'Q' is pressed, the speed increase and the squares move down and to the right.
- If 'W' is pressed, the speed increase and the squares move down and to the left.
- If mouse is left-clicked, the squares reverse their direction. YOU MUST PRESS HARD.
- If the mouse is on the left, half the squares are pink. If the mouse is on the 
  right, half the squares are blue.
- If the mouse is on the top half of the screen, half the squares are purple. If the
  mouse is on the bottom half of the screen, half the squares are yellow.
*/

package com.processing_pe;
import java.util.ArrayList; //import Arraylists
import processing.core.*; //import Processing

public class Main extends PApplet{
    
    /*GLOBAL VALUES */
    int max = 251; //maximum number of squares

    //ARRAYS
    Square square;
    Animate animate;
    Square arrayOne[] = new Square [max]; //1st array holding  squares
    Square arrayTwo[] = new Square [max];

    //COLOR VALUES
    

    public static void main(String[] args) { 
        PApplet.main("com.processing_pe.Main");
    }

    public void settings(){
        size(1280,720); //size of canvas
        animate = new Animate(this);

        /*//draws a square and store them into the array
        for (int i = 0; i<arrayOne.length; i++){
            arrayOne[i] = new Square(this);
        } 
        for (int i = 0; i<arrayTwo.length; i++){
            arrayTwo[i] = new Square(this);
        }*/
        
    }

    public void setup(){
        animate.setup();
    }

    public void draw(){ //draw the square
        animate.draw();
    }
}