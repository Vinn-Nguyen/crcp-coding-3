/*
 * Name: Wren Nguyen
 * Date: Oct 2024
 * Project: LinkedList Introduction
 * Description: GroceryLinkedList compiles the linked lits and all of its commands
 */

package com.lists;

public class GroceryLinkedList {
    //VARIABLES
    public int index = 0;
    public FoodNode head;
    public FoodNode next;

    public GroceryLinkedList(){
        head = null;
        next = null;
    }
    
    //PRINT: Traverse and print all the foods in a list
    public void print(){
        //if the list empty
        if(isEmpty())
            System.out.println("List is empty.");
        
        FoodNode current = head; //start at the head
        while (current != null){ //while not at the end of the list
            System.out.println(current.foodName()); //print list
            current = current.next; //go through list
        }
    }
    
    //INSERT AT INDEX: insert a FoodNode at the indicated index 
    void insert(FoodNode node, int count){
        if(isEmpty()){
            head = node; //Insert at head
        }
        //insert at specified point
        else{
            FoodNode current = head; //traverse at head
            for(int i=1; i < count && current != null; i++){ //find the index
                current = current.nextFood();
                index = count;
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
        FoodNode current = head; //traverse at head
        while(current.nextFood() != null){
            current = current.nextFood();
            if(current.foodName().equals(food)){
                FoodNode previous = current.next;
                current.setNext(node);
                current = current.next;
                index++;
                while(previous.nextFood() != null){
                    current.setNext(previous);
                    index++;
                    previous = previous.nextFood();
                }
            }
        } 
    }

    //INSERT AT START: insert at the start of the list (prepend) WIP
    void insertAtStart(FoodNode node){
        //if its empty, insert at the head of the list
        if(isEmpty())
            head = node; //insert at head

        else{
            FoodNode current = head; 
            head = node;
            head.next = current;
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
            }
            index++;
            current.setNext(node); //insert node at the end
        }
    }

    //ISEMPTY: defines empty list
    boolean isEmpty(){ 
        return head == null;
    }

    //FIND: find a specified food and return the index WIP
    public int find(String food){
        //if the list is empty return 0
        if(isEmpty()){
            return 0;
        }

        //return food node index
        FoodNode current = head;
        while((current.nextFood() != null)) //traverse
            current = current.nextFood();
            if(current.foodName().equals(food)){ //finds the food based on the name
                return index; //return index
            }
            else {
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
            index--;
            return "Removed" + current.foodName(); //return what was deleted
        }

        //remove a named node
        //while not at the end & the food matches
        while((current.nextFood() != null) && (!current.foodName().equals(food))){ 
            previous = current;
            current = current.nextFood();
        }
        if(current.foodName().equals(food)){ //if the current name matches
            previous.setNext(current.nextFood()); //replace the current with previous
            index--;
            return "Removed " + current.foodName(); //return what was deleted
        }
        //node not found
        else
            return ("No entry for " + food); //returns not found and name
    }
}