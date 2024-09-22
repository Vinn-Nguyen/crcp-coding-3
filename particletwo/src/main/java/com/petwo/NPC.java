/*
 Name: Wren Nguyen
 Date: 9.22.2024
 Description: Superclass for the interactive shapes (NPCs) within the Particle Engine
 */

package com.petwo;
import processing.core.*;

public class NPC extends Shapes{ //inherits from Shapes

    //NPC container
    NPC(PApplet main_, float sz_, int color_, int shapeType_){
        super(main_, sz_, color_, shapeType_);
        spawn(); //call spawn
        move();
    }

    //spawns the shape in a random location at a random speed
    void spawn(){
        //random x and y
        x = main.random(sz, main.width - sz - 2);
        y = main.random(sz , main.height - sz - 2);

        //random speed
        speedX = main.random(-3, 3);
        speedY = main.random(-3, 3);
    }

    //when there is a collision, the shape will spawn at a different location
    void collision(Shapes shapes){
        if(isHit(shapes)){
            spawn();
        }
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
