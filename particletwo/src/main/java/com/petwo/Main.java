/*
 Name: Wren Nguyen
 Date: October 2024
 Description: Particle Engine 4
 - Avatar is the blue rectangle, Food is green circles, Trash is white circles, Enemies are red squares.
 - Food increase health by 1. Trash resets health back to 1. Enemies reduce health by 1.
 - When ' ' key is pressed, it will reset game
 */

package com.petwo;
import java.util.ArrayList;
import processing.core.*;

public class Main extends PApplet{
    //init
    ArrayList<GameController> controllers = new ArrayList<>();
    int curController = GameController.GAME_PLAY; //current gamestate

    public static void main(String[] args) {
        PApplet.main("com.petwo.Main"); //runs processing
    }

    public void settings(){
        size(700, 700); //canvas size

        //add to controllers array
        controllers.add(new GameplayController(this));
        controllers.add(new GameEndController(this));
    }
    
    public void setup(){
    }

    public void draw(){
        controllers.get(curController).draw(); //draws from the controller
        //checks before changing gamestates
        if(controllers.get(curController).switchController() > GameController.DO_NOT_CHANGE){
            int nextControl = controllers.get(curController).switchController();
            controllers.get(curController).reset();
            curController = nextControl;
        }
    }

    public void mouseDragged(){
        controllers.get(curController).mouseDragged(); //allows avatar to be dragged
    }

    public void keyPressed(){
        controllers.get(curController).keyPressed(); //allows game to be reset
    }
}