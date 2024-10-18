/*
 * Name: Wren Nguyen
 * Date: Oct 2024
 * Project: LinkedList Introduction
 * Description: GroceryLinkedList compiles the linked lits and all of its commands
 */

package com.lists;

public class GroceryLinkedList {
    //VARIABLES
    private String food;
    private FoodNode head;

    public GroceryLinkedList(){
        head = null; //empty list
    }
    
    //PRINT: Traverse and print all the foods in a list
    public void print(){
        //if the list empty
        if(isEmpty())
            System.out.println("List is empty");
        
        FoodNode current = head; //start at the head
        while (current != null){ //while not at the end of the list
            System.out.println(current.toString()); //print list
            current.nextFood(); //go to next node
        }
    }
    
    //INSERT AT INDEX: insert a FoodNode at the indicated index 
    void insert(FoodNode node, int index){
        if(isEmpty()){
            head = node; //Insert at head
        }
        //insert at specified point
        else{
            FoodNode current = head; //traverse at head
            for(int i=1; i < index && current != null; i++){ //find the index
                current = current.nextFood();
            }
            current.setNext(node); //insert node at the end
        } 
    }

    //INSERT AFTER FOOD: insert a foodnode after another specified food WIP
    void insert(FoodNode node, String food){
        if(isEmpty()){
            head = node; //Insert at head
        }
        //insert at specified point
        else{
            FoodNode current = head; //traverse at head
            while((current.nextFood() != null) && (!current.foodName().equals(food))){
                current = current.nextFood();
                if(current.foodName().equals(food)){
                    current.setNext(node); //insert node at the end
                }
            }
        } 
    }

    //INSERT AT START: insert at the start of the list (prepend)
    void insertAtStart(FoodNode node){
        //if its empty, insert at the head of the list
        if(isEmpty())
            head = node;

        //inserts at the start of list
        else{
            FoodNode current = head; //traverse to the head
            current.setNext(node); //insert node at head
        }
    }

    //INSERT AT END: insert at the end of a list (append)
    public void insertAtEnd(FoodNode node){
        //if its empty, insert at the head of the list
        if(isEmpty())
            head = node; //Insert at head
        
        else{
            FoodNode current = head; //traverse to the head
            while(current.nextFood()!= null){ //while not the last node
                current = current.nextFood();//go to the next node
                current.setNext(node); //insert node at the end
            }
        }
    }

    //ISEMPTY: defines empty list
    boolean isEmpty(){ 
        return head == null;
    }

    //FIND: find a specified food and return the index
    public int find(int index){
        //if the list is empty return 0
        if(isEmpty())
            return 0;
        
        //return food node index
        else{
            FoodNode current = head;
            while((current.nextFood() != null) && (!current.foodName().equals(food)))
                current = current.nextFood();
                if(current.foodName().equals(food)) //finds the food based on the name
                    return current.getIndex(); //returns current index

                //if not found, returns -1
                else
                    return -1;
        }
    }

    //REMOVE: remove a specified food
    public String remove(String food){
        //if its an empty list
        if(isEmpty())
            return "List is empty"; //returns empty list

        //remove first node
        FoodNode current = head;
        FoodNode previous = null;
        if(current.foodName().equals(food)){
            head = current.nextFood(); //current is at the head
            return "Removed" + current.toString(); //return what was deleted
        }

        //remove a named node
        //while not at the end & the food matches
        while((current.nextFood() != null) && (!current.foodName().equals(food))){ 
            previous = current;
            current = current.nextFood();
        }
        if(current.foodName().equals(food)){ //if the current name matches
            previous.setNext(current.nextFood()); //replace the current with previous
            return "Removed" + current.toString(); //return what was deleted
        }
        //node not found
        else
            return ("No entry for " + food); //returns not found and name
    }
}