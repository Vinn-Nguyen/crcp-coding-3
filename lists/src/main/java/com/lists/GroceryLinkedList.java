package com.lists;

public class GroceryLinkedList {
    private FoodNode next;
    private FoodNode head;

    public GroceryLinkedList(){
        head = null;
    }

    void insert(int index, FoodNode node){
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

    void insert(String food, FoodNode node){}

    void insertAtStart(FoodNode node){}

    void insertAtEnd(FoodNode node){}

    boolean isEmpty(){
        return head == null;
    }

    void find(String food){}

    void remove (String food){}

    void setNext(FoodNode nextPTr){
        next = nextPTr;
    }
}