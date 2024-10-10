/*
Name: Wren Nguyen
Date: October 2024
Description:
*/

package com.pefour;
import java.util.ArrayList;
import processing.core.*;

public class GamePlayController extends GameController{
    //declaring classes
    Avatar avatar;

    //array lists
    ArrayList<Shapes> gameObjects;

    GamePlayController(PApplet main_){
        super(main_);
        init(); //call to initalize
    }

    public void init(){ 
        //init the classes
        avatar = new Avatar(main);

        //init the arraylists
        gameObjects = new ArrayList<>();
        gameObjects.add(avatar);
    }
    

    public void draw(){
        //background
        main.background(0);
    }

    public void display(){ //display all game objects
        avatar.display(); 

        //loops display the multiple objects of the food and enemy objects
        for(int i =0; i < gameObjects.size(); i++){
            gameObjects.get(i).display();
        }
    }

    public void setAvatar(float x, float y){ //set avatar location
        avatar.setStart(x, y);
    }

    public void mouseDragged(){
        setAvatar(main.mouseX, main.mouseY);
    }
}
