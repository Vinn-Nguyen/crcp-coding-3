/*
Name: Wren Nguyen
Date: October 2024
Description: This class stores the 
*/

package com.pefour;
import processing.core.*;

public class Shapes {
    static PApplet main; //processing functionality
    Shapes shapes;

    //UNITS
    float x, y; //x and y position
    float speedX = 1; //speed of x
    float speedY = 1; //speed of y
    float sz; //size of object
    float half; //half of the object's size
    boolean hit; //collision boolean for when objects interact

    Shapes(PApplet main_, float sz_){ //Superclass parent
        main = main_;
        sz = sz_;
    }

    
    void display(){} //displays all objects
    
    boolean isHit(Shapes shapes){ //collision between objects
        float distance = PApplet.dist(x, y, shapes.getX(), shapes.getY());
        return (distance < sz/2 + shapes.getSz()/2);
    }

    //functions to get the X, Y, and object Size
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
