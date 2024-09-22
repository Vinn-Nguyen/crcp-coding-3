package com.petwo;
import processing.core.*;

public class Food extends Shapes{
    Food(PApplet main_){
        super(main_, 15, main_.color(255,0,0));
        spawn();
    }

    void collision(Shapes shapes){
        if(isHit(shapes)){
            spawn();
        }
    }
}
