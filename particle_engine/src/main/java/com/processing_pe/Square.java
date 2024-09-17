/*
Name: Wren Nguyen
Project Name: Particle Engine
Date: 9.9.2024
Description: This class contains the info to draw a bouncing square, and contains
all the commands its able to do.
*/

package com.processing_pe;

import processing.core.PApplet;

class Square {

  float sz = 20; //size of squares
  float half = sz/2; //square radius length

  float shapeX; //x position
  float shapeY; //y position
  float speedX; //speed of x 
  float speedY; //speed of y 

  Main main;
    
  public Square(Main main_){
     main = main_;
    //random starting position within bounds
    shapeX = main.random(sz, main.width - sz);
    shapeY = main.random(sz, main.height - sz);

    //movement speed
    speedX = main.random(-2, 2);
    speedY = main.random(-2, 2);
  }

  public Square(Animate animate) { //connects square to animate
  }

  void bounce(){ //makes the squares bounce
    shapeX = shapeX + speedX; //moves the x position
    shapeY = shapeY + speedY; //moves the y position

    //turn the square around if the edge touches the left/right of screen
    if(shapeX - half < 0 || shapeX + half > main.width){
      speedX = speedX * -1;
    }

    //turn the square around if the edge touches the top/bottom of screen
    if(shapeY - half < 0 || shapeY + half > main.height){
      speedY = speedY * -1;
    }
        
    //if Q is pressed squares will move right and down
    if(main.key == 'q'){
      shapeX = shapeX + speedX + 1;
      shapeY = shapeY + speedY + 1;
    }
    //if W is pressed squares will move left and up
    if(main.key == 'w'){
      shapeX = shapeX + speedX - 1;
      shapeY = shapeY + speedY - 1;
    }
  }
  
  void click(){ //stuff happens when the mouse is clicked.
    //left click reverses speed
    if (main.mousePressed && (main.mouseButton == main.LEFT)){ 
      speedX = speedX * -1;
      speedY = speedY * -1;
    }
  }

  public void draw(){ //draw the square
    main.rect(shapeX, shapeY, sz, sz);
    bounce();
  }
}