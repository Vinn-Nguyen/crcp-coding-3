/*
 Name: Wren Nguyen
 Date: 9.21.2024
 Description: Shows the inheritance interactions
 */

package com.petwo;
import processing.core.*;

public class Main extends PApplet{
    Controller controller; //controls the shapes and everything related to it
    Squares squares;
    public static void main(String[] args) {
        PApplet.main("com.petwo.Main");
    }

    public void settings(){
        size(1000, 700);
        controller = new Controller(this);
        //squares = new Squares(this);
    }
    
    public void setup(){
        //squares.setup();
    }

    public void draw(){
        controller.draw();
       //squares.draw();
    }

    public void mousePressed(){
        //squares.mousePressed();
    }

    public void mouseDragged(){
        controller.setAvatar(mouseX, mouseY);
    }
}