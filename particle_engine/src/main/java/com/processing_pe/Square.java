package com.processing_pe;


class Square extends Main {
    float sz = 50; //size of squares
    float half = sz/2; //square radius length

    float shapeX; //x position
    float shapeY; //y position
    float speedX; //speed of x 
    float speedY; //speed of y 
    
    public Square(){
        //random starting position within bounds
        shapeX = random(sz, width - sz);
        shapeY = random(sz, height - sz);

        //movement speed
        speedX = random(-2, 2);
        speedY = random(-2, 2);
    }

    public void display(){ //show the square
        rectMode(CENTER);
        rect(shapeX, shapeY, sz, sz); //draw square
    }

    public void bounce(){ //makes the squares bounce
        shapeX = shapeX + speedX; //moves the x position
        shapeY = shapeY + speedY; //moves the y position

        //turn the square around if the edge touches the left/right of screen
        if(shapeX - half < 0 || shapeX + half > width){
            speedX = speedX * -1;
        }

        //turn the square around if the edge touches the top/bottom of screen
        if(shapeY - half < 0 || shapeY + half > height){
            speedY = speedY * -1;
        }
        
        //if Q is pressed squares will move right and down
        if(key == 'q'){
          shapeX = shapeX + speedX + 1;
          shapeY = shapeY + speedY + 1;
        }
        //if W is pressed squares will move left and up
        if(key == 'w'){
          shapeX = shapeX + speedX - 1;
          shapeY = shapeY + speedY - 1;
        }
    }

    public void click(){ //stuff happens when the mouse is clicked.
        //left click reverses speed
        if (mousePressed && (mouseButton == LEFT)){ 
          speedX = speedX * -1;
          speedY = speedY * -1;
        }

        //right click changes background color
        if (mousePressed && (mouseButton == RIGHT)){ 
           black = white;
        }
      }
}
