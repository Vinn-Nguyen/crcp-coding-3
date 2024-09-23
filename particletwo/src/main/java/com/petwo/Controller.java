/*
 Name: Wren Nguyen
 Date: 9.23.2024
 Description: This object controlls all the shapes and everything relating to it.
 */

package com.petwo;
import java.util.ArrayList;
import processing.core.*;

public class Controller {
    PApplet main; //init processing

    //declare other classes
    Shapes shapes;
    NPC npc;
    Avatar avatar;
    Enemy enemies;
    Food foods;

    ArrayList<Food> food; //array list for multiple food objects
    int foodCount = 15; //number of food objects
    
    ArrayList<Enemy> enemy; //array list for multiple enemy objects
    int enemyCount = 4; //number of enemy objects

    ArrayList<Trash> trash; //array list fro muliple trash objects
    int trashCount = 3;


    Controller(PApplet main_){
        main = main_;
        init(); //call to initalize
    }

    public void init(){  //initalize the game objects
        //init the classes
        avatar = new Avatar(main);
        food = new ArrayList<>();
        enemy = new ArrayList<>();
        trash = new ArrayList<>();
        
        //loops that create the arrayslist's containers
        for(int i =0; i < foodCount; i++){
            food.add(new Food(main));
        }
        for(int i =0; i < enemyCount; i++){
            enemies = new Enemy(main);
            enemy.add(new Enemy(main));
        }
        for(int i = 0; i < trashCount; i++){
            trash.add(new Trash(main));
        }
    }

    
    public void draw(){ //animate game objects
        //background
        main.background(0);

        //functions
        display(); 
        collisions();
        move();
    }

    
    public void display(){ //display all game objects
        avatar.display(); 

        //loops display the multiple objects of the food and enemy objects
        for(int i =0; i < foodCount; i++){
            food.get(i).display();
        }
        for(int i =0; i < enemyCount; i++){
            enemy.get(i).display();
        }
        for(int i =0; i < trashCount; i++){
            trash.get(i).display();
        }
    }
    
    void move(){ //allows NPCs to move around the screen
        for(int i =0; i < enemyCount; i++){
            enemy.get(i).move();
            enemy.get(i).enemyCollision(enemies);
        }
        for(int i = 0; i < foodCount; i++){
            food.get(i).move();
        }
        for(int i = 0; i < trashCount; i++){
            trash.get(i).move();
        }
    }

    public void collisions(){ //collisions of all the objects
        //collision between avatar and food
        for(int i =0; i < food.size(); i++){
            avatar.collision(food.get(i));
            food.get(i).collision(avatar);
        }

        //collision between avatar and enemy and between enemies
        for(int i =0; i < enemy.size(); i++){
            avatar.collision(enemy.get(i));
            enemy.get(i).collision(avatar);
            enemies.enemyCollision(enemy.get(i));
            enemy.get(i).enemyCollision(enemies);
        }

        //collision between avatar and trash
        for(int i =0; i < trash.size(); i++){
            avatar.collision(trash.get(i));
            trash.get(i).collision(avatar);
        }
    }

    public void setAvatar(float x, float y){ //set avatar location
        avatar.setStart(x, y);
    }

    void keyPressed(){ //keypressed from shapes
        if(main.key == 'q'){
            npc.keyPressed();
        }
    }
}
