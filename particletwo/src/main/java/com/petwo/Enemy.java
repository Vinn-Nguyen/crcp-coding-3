/*
 Name: Wren Nguyen
 Date: 9.22.2024
 Description: Information for the enemy objects is stored here. Enemy is red and drawn as a circle.
 */

package com.petwo;
import processing.core.*;

public class Enemy extends NPC{ //inherits from NPC
    Enemy(PApplet main_){
        super(main_,50, main_.color(255,0,0), 2);
    }

    //move function
    void move(){
        half = sz/2; //half the size
        y = y + speedY; //movement of Y
        x = x + speedX; //movement of X

        //allows shapes to bounce off the left and right of screen
        if(x - half < 0 || x + half > main.width){
            speedX = speedX * -1;
        }

        //allows shapes to bounce off the top and bottom of screen
        if(y - half < 0 || y + half > main.height){
            speedY = speedY * -1;
        }
    }

}
