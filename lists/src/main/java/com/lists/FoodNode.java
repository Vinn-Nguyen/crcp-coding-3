/* 
 * Name: Wren Nguyen
 * Date: Oct 2024
 * Project: LinkedList Introduction
 * Description: FoodNode Class, contains all the getters and setters
*/

package com.lists;

public class FoodNode {
    public String foodName;
    public FoodNode next;
    public int index;

    public FoodNode(String foodName){
        this.foodName = foodName;
    }

    //returns the next food
    public FoodNode nextFood(){
        return next;
    }
    
    //returns food name
    public String foodName(){
        return foodName;
    }

    //sets the next node
    public void setNext(FoodNode nextPtr){
        next = nextPtr;
    }

    //returns the index
    public int getIndex(){
        return index;
    }
}