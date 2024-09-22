package com.petwo;

import processing.core.PApplet;

public class Avatar extends Shapes {

    int health = 10;

    Avatar(PApplet main_){
        super(main_,45, main_.color(0,0,255));

        x = main.width/2;
        y = main.height/2;
    }

    void setStart(float x_, float y_){
        x = x_;
        y = y_;
    }

    void collision(Shapes shapes){
        hit = isHit(shapes);
        if(hit){
            health++;
            PApplet.println("increase:" + health);
        }
    }

}
