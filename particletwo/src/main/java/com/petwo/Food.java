/*
 Name: Wren Nguyen
 Date: 9.22.2024
 Description: Information for the food object is stored here. Food is green and drawn as circles.
 */

package com.petwo;
import processing.core.*;

public class Food extends NPC{ //inherits from NPC
    static int red = main.color(255, 0,0);
    static int green = main.color(0, 255,0);

    Food(PApplet main_){
        super(main_, 20, green, 2);
    }

    void colorChange(){ //changes color from green to red
        color = red;
    }
}
