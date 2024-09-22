/*
 Name: Wren Nguyen
 Date: 9.21.2024
 Description: Superclass for all the shapes within the Particle Engine
 */

package com.petwo;
import processing.core.*;

public class Shapes {
    PApplet main; //processing functionality
    Shapes shapes;

    //UNITS
    float x, y; //x and y position
    float speedX, speedY; //speed of y
    float directionX, directionY; //direction of movement
    float sz; //size of object
    int color; //color
    boolean hit; //collision boolean for when objects interact

    Shapes(PApplet main_, float sz_, int color_){
        main = main_;
        sz = sz_;
        color = color_;

    }

    //displays all objects
    void display(){
        main.fill(color);
        main.rectMode(main.CENTER);
        main.rect(x, y, sz, sz);
    }

    //test the collision of shapes
    boolean isHit(Shapes shapes){
        float distance = PApplet.dist(x, y, shapes.getX(), shapes.getY());
        return (distance < sz/2 + shapes.getSz()/2);
    }

    void spawn(){
        x = main.random(main.width);
        y = main.random(main.height);

        speedX = main.random(-10, 10);
        speedY = main.random(-10, 10);

    }

    float getX(){
        return x;
    }
    float getY(){
        return y;
    }
    float getSz(){
        return sz;
    }

}
