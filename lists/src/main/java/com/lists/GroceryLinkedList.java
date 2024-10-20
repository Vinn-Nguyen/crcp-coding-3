/*
 * Name: Wren Nguyen
 * Date: Oct 2024
 * Project: LinkedList Introduction
 * Description: GroceryLinkedList compiles the linked lits and all of its commands
 */

package com.lists;

public class GroceryLinkedList {
    //VARIABLES
    public int currentIndex = 0; //current index
    public FoodNode head; //start of list
    public FoodNode next; //next node of list

    public GroceryLinkedList(){
        head = null;
        next = null;
    }
    
    //PRINT: Traverse and print all the foods in a list
    public void print(){
        //if the list empty, return list is empty.
        if(isEmpty())
            System.out.println("List is empty.");
        
        FoodNode current = head; //start at the head
        while (current != null){ //traverse through the list until the end
            System.out.println(current.foodName()); //print nodes
            current = current.next; //go to next node
        }
    }
    
    //INSERT AT INDEX: insert a FoodNode at the indicated index 
    void insert(FoodNode node, int index){
        //if empty, insert node at head
        if(isEmpty()){
            head = node; //Insert at head
        }
        //insert at specified index
        else{
            FoodNode current = head; //start at the head
            for(int i=1; i < index && current != null; i++){ //create an index while traversing the list
                current = current.nextFood(); //go to the next node
                currentIndex = index; //assign a currentIndex to the index
            }
            current.setNext(node); //insert the node
        } 
    }

    //INSERT AFTER FOOD: insert a foodnode after another specified food WIP
    void insert(FoodNode node, String food){
        //if empty, insert node at head
        if(isEmpty()){
            head = node;
        }

        //insert at specified food
        FoodNode current = head; //start at the head
        while(current.nextFood() != null){ //traverse the list
            current = current.nextFood(); //go to the next node

            //This section matches the food with inputted foodname
            if(current.foodName().equals(food)){ //match foodname and food
                FoodNode previous = current.next; //previous stores the nodes after the foodName
                current.setNext(node); //insert new food node
                current = current.next; //go to the next item

                //This section prints the rest of the list after the new node
                while(previous.nextFood() != null){ //go through the previous list
                    current.setNext(previous); //create nodes for the previous list
                    previous = previous.nextFood(); //go the next node of the previous list
                }
            }
        } 
    }

    //INSERT AT START: insert at the start of the list (prepend) WIP
    void insertAtStart(FoodNode node){
        //if its empty, insert at the head of the list
        if(isEmpty())
            head = node;

        else{
            FoodNode current = head; //start at the head
            head = node; //create a new node at the head
            head.next = current; //push the other nodes beneath the new head
        }
        
    }

    //INSERT AT END: insert at the end of a list (append)
    public void insertAtEnd(FoodNode node){
        //if its empty, insert at the head of the list
        if(isEmpty())
            head = node;
        
        else{
            FoodNode current = head; //start at the head
            while(current.nextFood()!= null){ //traverse through the list
                current = current.nextFood();//go to the next node until the end
            }
            current.setNext(node); //insert node at the end
        }
    }

    //ISEMPTY: defines empty list
    boolean isEmpty(){ 
        return head == null;
    }

    //FIND: find a specified food and return the index
    public int find(String food){
        //if the list is empty return 0
        if(isEmpty()){
            return 0;
        }

        //return foodnode index
        FoodNode current = head; //start at the head
        while((current.nextFood() != null)) //traverse through the list
            current = current.nextFood(); //go to the next node

            if(current.foodName().equals(food)){ //matches the foodName with the food
                return currentIndex; //returns the index of the foodNode
            }

            //otherwise, it returns -1
            else {
                return -1;
            }
    }

    //REMOVE: remove a specified food
    public String remove(String food){
        //if its an empty list
        if(isEmpty())
            return "List is empty"; //returns empty list

        //declare/initalize previous & current
        FoodNode current = head;
        FoodNode previous = null;

        //removing the first node
        if(current.foodName().equals(food)){ //if the food matches the foodName
            head = current.nextFood(); //the current moves up to the head, removing the old head
            currentIndex--; //subtract the current index
            return "Removed" + current.foodName(); //return what was deleted
        }

        //remove a named node
        while((current.nextFood() != null) && (!current.foodName().equals(food))){ //traverse list & match food w/ foodName
            previous = current; //previous stores the list
            current = current.nextFood(); //goes to the next node
        }
        if(current.foodName().equals(food)){ //if the current name matches the food
            previous.setNext(current.nextFood()); //replace the previous node with the current node
            currentIndex--; //subtract from index
            return "Removed " + current.foodName(); //return what was deleted
        }
        
        //if the food is not found, returns not found and name
        else
            return ("No entry for " + food);
    }
}