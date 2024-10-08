/*
 Name: Wren Nguyen
 Date: 9.22.2024
 Description: Particle Engine 2
 - Avatar is the blue rectangle, Food is green circles, Trash is white circles, Enemies are red squares.
 - Food increase health by 1. Trash resets health back to 0. Enemies reduce health by 1.
 - Enemies are *supposed* to bounce off of each other.
 - When 'Q' key is pressed, Food will change color, Trash will increase in size, and Enemy will become 
 */

package com.petwo;
import processing.core.*;

public class Main extends PApplet{

    GameController controller; //calls the controller

    public static void main(String[] args) {
        PApplet.main("com.petwo.Main"); //runs processing
    }

    public void settings(){
        size(700, 700); //canvas size
        controller = new GameplayController(this); //init controller
    }
    
    public void setup(){
    }

    public void draw(){
        controller.draw(); //draws from the controller
    }

    public void mouseDragged(){
        controller.mouseDragged(); //allows avatar to be dragged
    }
}