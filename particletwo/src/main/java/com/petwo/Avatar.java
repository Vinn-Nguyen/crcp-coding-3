/*
 Name: Wren Nguyen
 Date: 9.23.2024
 Description: Information for the avatar object is stored here. Avatar is blue and drawn as a rectangle.
 */

package com.petwo;
import processing.core.PApplet;

public class Avatar extends Shapes {
    int health = 10; //health

    Avatar(PApplet main_){ //avatar container
        super(main_,45, main_.color(0, 0, 255), 3);
        x = main.width/2;
        y = main.height/2;
    }

    void setStart(float x_, float y_){ //start in the center of the screen
        x = x_;
        y = y_;
    }

    void collision(Shapes shapes){ //increase/decrease/reset health when interacting with NPCs
        hit = isHit(shapes);
        if(hit){
            if(shapes instanceof Food){
                health++;
                PApplet.println("Increase! HP:" + health);
            }
            else if(shapes instanceof Enemy){
                health--;
                PApplet.println("Decrease! HP:" + health);
            }
            else if(shapes instanceof Trash){
                health = health - health;
                PApplet.println("Gone! HP:" + health);
            }
        }
    }
}
