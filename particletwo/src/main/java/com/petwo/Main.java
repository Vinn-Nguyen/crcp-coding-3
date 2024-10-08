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
import java.util.ArrayList;
import processing.core.*;

public class Main extends PApplet{
    //init
    ArrayList<GameController> controllers = new ArrayList<>();
    int gameplay = 0;
    int end = 1;
    int curController = 0;

    public static void main(String[] args) {
        PApplet.main("com.petwo.Main"); //runs processing
    }

    public void settings(){
        size(700, 700); //canvas size
        controllers.add(new GameplayController(this));
        controllers.add(new GameEndController(this));
    }
    
    public void setup(){
    }

    public void draw(){
        controllers.get(curController).draw(); //draws from the controller
        if(controllers.get(curController).switchController() > -1){
            int nextControl = controllers.get(curController).switchController();
            controllers.get(curController).reset();
            curController = nextControl;
        }
    }

    public void mouseDragged(){
        controllers.get(curController).mouseDragged(); //allows avatar to be dragged
    }

    public void keyPressed(){
        controllers.get(curController).keyPressed();
    }
}