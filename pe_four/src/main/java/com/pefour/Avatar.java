/*
Name: Wren Nguyen
Date: October 2024
Description:
*/

package com.pefour;
import processing.core.*;

public class Avatar extends Shapes{
    int health = 10;

    Avatar(PApplet main_){
        super(main_, 50);
        x = main.width/2;
        y = main.height/2;
    }

    void display(){
        main.imageMode(main.CENTER);
        PImage AVATARIMG = main.loadImage("/Users/vinnnguyen/Documents/Images/avatar.png");
        main.image(AVATARIMG, 50, 50);
    }

    void setStart(float x_, float y_){ //start in the center of the screen
        x = x_;
        y = y_;
    }

    void collision(Shapes shapes){ //increase/decrease/reset health when interacting with NPCs
        hit = isHit(shapes);
    }

    float getHealth(){
        return health;
    }
}
