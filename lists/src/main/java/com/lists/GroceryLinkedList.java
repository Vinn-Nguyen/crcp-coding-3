package com.lists;

public class GroceryLinkedList {
    private String food;
    private FoodNode head;

    public GroceryLinkedList(){
        head = null; //empty list
    }

    //List
    
    public void print(){
        if(isEmpty())
            System.out.println("List is empty");
        
        FoodNode current = head;
        while (current != null){
            System.out.println(current.toString()); //print data
            current.nextFood(); //go to next node
        }
    }
    
    void insert(int index, FoodNode node){
        if(isEmpty()){
            head = node;
        }
        else{
            FoodNode current = head;
            while(current.nextFood()!= null){
                current = current.nextFood();//go to the next node
                current.setNext(node);
            }
        }
    }

    public void insert(String food, FoodNode node){}

    //prepend
    public void insertAtStart(FoodNode node){
        if(isEmpty()){
            head = node;
        }
        else{
            FoodNode current = head;
            while(current.nextFood()!= null){
                current = current.nextFood();
            }
        }
    }

    //append
    public void insertAtEnd(FoodNode node){
        if(head==null){
            head = new FoodNode(food);
            return;
        }
    }

    //defines empty list
    boolean isEmpty(){ 
        return head == null;
    }

    //getName()
    public String find(String food){
        //if empty return -1
        if(isEmpty())
            return "-1";
        
        //otherwise, return the food name
        else{
            FoodNode current = head;
            while((current.nextFood() != null))
        }
    }

    public String remove(String food){
        //empty list
        if(isEmpty())
            return "List is empty";
        
        FoodNode current = head;
        FoodNode previous = null;

        if(current.foodName().equals(food)){
            head = current.nextFood();
            return "Removed" + current.toString();
        }
        while((current.nextFood() != null) &&
        (!current.nextFood().equals(food))){
        previous = current;
        current = current.nextFood();
        }
        //remove named node
        if(current.foodName().equals(food)){
            previous.setNext(current.nextFood());
            return "Removed" + current.toString();
        } else
        return("No entry for" + food);
    }
}
/*
void insert( int index, FoodNode node ) -- insert a FoodNode at the indicated index
void insert(String food, FoodNode node) -- insert a food after another specified food (HINT: use your find() and the other insert() method to help you )
void insertAtStart(FoodNode node) -- insert a FoodNode at the start of the list (prepend)
void insertAtEnd(FoodNode node) --insert a FoodNode at the end of the list (append)
boolean isEmpty() -- return whether the list is empty
int find(String food) -- find the specified food is your list. return the index of the food found and -1 if not found.
void remove (String food) -- remove the specified food */