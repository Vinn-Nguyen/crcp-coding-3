/*
Name: Wren Nguyen
Date: October 2024
Description:
*/

package com.pefour;
import java.util.ArrayList;
import processing.core.*;
import java.awt.Image;


public class Main extends PApplet{
    //images
    static PImage AVATARIMG;
    Avatar av;

    //init
    ArrayList<GameController> controllers = new ArrayList<>();
    int curController = GameController.GAME_PLAY;

    public static void main(String[] args) {
        PApplet.main("com.pefour.Main"); //runs processing
    }

    public void settings(){
        size(1280, 720); //canvas size

        controllers.add(new GamePlayController(this));
    }

    public void setup(){
       AVATARIMG = loadImage("/Users/vinnnguyen/Documents/Images/avatar.png");
    } //load images

    public void draw(){
        av.display();
        //controllers.get(curController).draw();
    }

    public void mouseDragged(){
        
        //controllers.get(curController).mouseDragged();
    }

    public void keyPressed(){

    }
}