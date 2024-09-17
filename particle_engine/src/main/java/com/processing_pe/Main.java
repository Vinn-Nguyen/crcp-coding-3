/*
Name: Wren Nguyen
Project Name: Particle Engine
Date: 9.10.2024
Description: 502 particles total.
- If 'Q' is pressed, the speed increase and the squares move down and to the right.
- If 'W' is pressed, the speed increase and the squares move down and to the left.
- If mouse is left-clicked, the squares reverse their direction. YOU MUST PRESS HARD.
- If mouse is right-clicked, the background turns white.
- If the mouse is on the left, half the squares are pink. If the mouse is on the 
  right, half the squares are blue.
- If the mouse is on the top half of the screen, half the squares are purple. If the
  mouse is on the bottom half of the screen, half the squares are yellow.
*/

package com.processing_pe;
import java.util.ArrayList;

import processing.core.*; //import Processing

public class Main extends PApplet{
    
    /*GLOBAL VALUES */
    int max = 251; //maximum number of squares

    //ARRAYS
    Square arrayOne[] = new Square [max]; //1st array holding  squares
    Square arrayTwo[] = new Square [max]; //2nd array holding squares

    //COLOR VALUES
    int alpha = 200; //transparent value
    int blue = color(56, 255, 255, alpha); //blue
    int purple = color(175, 75, 255, alpha); //purple
    int pink = color(255, 97, 158, alpha); // pink
    int yellow = color(255, 241, 89, alpha); //yellow
    int black = color(0); //black
    int white = color(255); //white


    public static void main(String[] args) { 
        PApplet.main("com.processing_pe.Main");
    }

    public void settings(){
        size(1280,720); //size of canvas

        //draws a square and store them into the array
        for (int i = 0; i<arrayOne.length; i++){
            arrayOne[i] = new Square(this);
        } 
        for (int i = 0; i<arrayTwo.length; i++){
            arrayTwo[i] = new Square(this);
        }
    }

    public void setup(){

    }

    public void draw(){ //draw
        background (black); //black bg 
    
        //display arrayOne
        for (Square obj : arrayOne){
            //if mouse on the right, colors is blue
            if (mouseX > width/2){
                fill(blue);
            } else { //on the left, color is pink
                fill(pink);
            }
            //draws the squares from Square class
            obj.bounce();
            obj.click();
            obj.display();
        }
    
        //display arrayTwo
        for (Square obj : arrayTwo){
            //if mouse on the bottom, colors is purple
            if (mouseY > height/2){
                fill(purple);
            } else { //on the top, color is yellow
                fill(yellow);
            }

            //draw squares from Square class
            obj.bounce();
            obj.click();
            obj.display();  
        }
    }
}