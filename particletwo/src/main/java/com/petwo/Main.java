/*
 Name: Wren Nguyen
 Date: 9.22.2024
 Description: Particle Engine 2
 */

package com.petwo;
import processing.core.*;

public class Main extends PApplet{

    Controller controller; //calls the controller

    public static void main(String[] args) {
        PApplet.main("com.petwo.Main"); //runs processing
    }

    public void settings(){
        size(700, 700); //canvas size
        controller = new Controller(this); //init controller
    }
    
    public void setup(){
    }

    public void draw(){
        controller.draw(); //draws from the controller
    }

    public void mousePressed(){
    }

    public void mouseDragged(){
        controller.setAvatar(mouseX, mouseY); //allows avatar to be dragged
    }
}