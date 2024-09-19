package com.petwo;
import processing.core.*;

public class Square {
    PApplet main;
    float x, y; //x and y position
    float speedX = 1; //speed of x
    float speedY = 1; //speed of y
    float directionX = 1; //direction of x
    float directionY = 1; //direction of y
    float sz; //size of square
    float half; //radius of square
    int rectColor; //color of square

    Square(float x_, float y_, float sz_, PApplet main_, int c){
        x = x_;
        y = y_;
        sz = sz_;
        rectColor = c;

        main = main_;
    }

    void draw(){
        main.rectMode(main.CENTER);
        main.rect(x, y, sz, sz);
        move();
    }
  
    void move(){
        half = sz/2;
        y += speedY * directionY;
        x += speedX * directionX;

        if(x + half > main.width || x - half < 0){
            directionX = directionX * -1;
        }

        if(y + half > main.height || y - half < 0){
            directionY = directionY * -1;
        }
    }

    void faster(){
        speedX++;
        speedY++;
    }
}