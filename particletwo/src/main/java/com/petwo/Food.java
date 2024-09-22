/*
 Name: Wren Nguyen
 Date: 9.22.2024
 Description: Information for the food object is stored here. Food is green and drawn as circles.
 */

package com.petwo;
import processing.core.*;

public class Food extends NPC{ //inherits from NPC
    Food(PApplet main_){
        super(main_, 15, main_.color(0,255,0), 2);
    }
}
