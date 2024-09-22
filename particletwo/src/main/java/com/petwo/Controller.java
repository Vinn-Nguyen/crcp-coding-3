/*
 Name: Wren Nguyen
 Date: 9.21.2024
 Description: This object controlls all the shapes and everything relating to it
 */

package com.petwo;
import java.util.ArrayList;
import processing.core.*;

public class Controller {
    PApplet main;
    Shapes shapes;
    Avatar avatar;
    ArrayList<Food> food;
    int foodCount = 5;

    Controller(PApplet main_){
        main = main_;
        init();
        
        //shapes = new Shapes(main_, 20, 255);
        //shapes.spawn(); //locate it somewhere on the screen
    }

    //initalize the game objects
    public void init(){
        avatar = new Avatar(main);
        food = new ArrayList<>();
        for(int i =0; i < foodCount; i++){
            food.add(new Food(main));
        }
    }

    public void draw(){
        main.background(0);  
        display();  
        collisions();
    }

    //display all game objects
    public void display(){
        avatar.display();
        for(int i =0; i < foodCount; i++){
            food.get(i).display();
        }
    }

    //collisions of all the objects
    public void collisions(){
        for(int i =0; i < food.size(); i++){
            avatar.collision(food.get(i));
            food.get(i).collision(avatar);
        }
    }

    public void setAvatar(float x, float y){
        avatar.setStart(x, y);

    }

   /* void move(){
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
    }*/ 
}
