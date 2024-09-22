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
    }

    //spawns the shape in a random location at a random speed
    void spawn(){
        //random x and y
        x = main.random(main.width);
        y = main.random(main.height);

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

}
