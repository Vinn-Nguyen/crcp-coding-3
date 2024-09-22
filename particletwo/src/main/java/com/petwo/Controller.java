/*
 Name: Wren Nguyen
 Date: 9.21.2024
 Description: This object controlls all the shapes and everything relating to it
 */

package com.petwo;
import java.util.ArrayList;
import processing.core.*;

public class Controller {
    PApplet main; //init processing

    //declar other classes
    Shapes shapes;
    Avatar avatar;
    Enemy enemies;

    //array list for multiple food objects
    ArrayList<Food> food;
    int foodCount = 15; //number of food objects
    //array list for multiple enemy objects
    ArrayList<Enemy> enemy;
    int enemyCount = 4; //number of enemy objects

    Controller(PApplet main_){
        main = main_;
        init(); //call to initalize
    }

    //initalize the game objects
    public void init(){
        //init the classes
        avatar = new Avatar(main);
        enemies = new Enemy(main);
        
        food = new ArrayList<>();
        enemy = new ArrayList<>();
        
        //loops that create the arrayslist's containers
        for(int i =0; i < foodCount; i++){
            food.add(new Food(main));
        }
        for(int i =0; i < enemyCount; i++){
            enemy.add(new Enemy(main));
        }
    }

    //animate game objects
    public void draw(){
        //background
        main.background(0);
        //functions
        display(); 
        collisions();
        move();
    }

    //display all game objects
    public void display(){
        avatar.display(); 

        //loops display the multiple objects of the food and enemy objects
        for(int i =0; i < foodCount; i++){
            food.get(i).display();
        }
        for(int i =0; i < enemyCount; i++){
            enemy.get(i).display();
        }
    }

    //allows the enemies to move around the screen
    void move(){
        for(int i =0; i < enemyCount; i++){
            enemy.get(i).move();
        }

        for(int i = 0; i < foodCount; i++){
            food.get(i).move();
        }
        enemies.collision(enemies);
    }

    //collisions of all the objects
    public void collisions(){
        //collision between avatar and food
        for(int i =0; i < food.size(); i++){
            avatar.collision(food.get(i));
            food.get(i).collision(avatar);
        }

        //collision between avatar and enemy
        for(int i =0; i < enemy.size(); i++){
            avatar.collision(enemy.get(i));
            enemy.get(i).collision(avatar);
        }

        for(int i =0; i<enemy.size(); i++){
            enemies.collision(enemy.get(i));
            enemy.get(i).collision(enemies);
        }
    }

    public void setAvatar(float x, float y){
        avatar.setStart(x, y);
    }
}
