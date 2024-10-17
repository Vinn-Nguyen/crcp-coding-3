/* Name: Wren Nguyen
 * Date: Oct 2024
 * Project: LinkedList Introduction
 * Description: FoodNode
*/

package com.lists;

public class FoodNode {
    private String foodName;
    private FoodNode next;
    
    public String foodName(){
        return foodName;
    }

    public FoodNode nextFood(){
        return next;
    }

    public void setNext(FoodNode nextPTr){
        next = nextPTr;
    }
}