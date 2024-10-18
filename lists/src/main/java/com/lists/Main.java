/* 
 * Name: Wren Nguyen
 * Date: Oct 2024
 * Project: LinkedList Introduction
 * Description: Main is for testing
*/

package com.lists;

public class Main {
    public static void main(String[] args) {
        GroceryLinkedList test1 = new GroceryLinkedList();
        test1.insertAtEnd(new FoodNode("milk"));
        test1.insertAtEnd(new FoodNode("bananas"));
        test1.insertAtEnd(new FoodNode("ice cream"));
        test1.insertAtEnd(new FoodNode("spinach"));
        test1.insertAtEnd(new FoodNode("chicken"));
        System.out.println("Test 1");
        test1.print(); //works when null
    }
}