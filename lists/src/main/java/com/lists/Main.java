/* 
 * Name: Wren Nguyen
 * Date: Oct 2024
 * Project: LinkedList Introduction
 * Description: Main is for testing
*/

package com.lists;

public class Main {
    public static void main(String[] args) {

        //TEST 1
        GroceryLinkedList test = new GroceryLinkedList();
        test.insertAtEnd(new FoodNode("milk"));
        test.insertAtEnd(new FoodNode("bananas"));
        test.insertAtEnd(new FoodNode("ice cream"));
        test.insertAtEnd(new FoodNode("spinach"));
        test.insertAtEnd(new FoodNode("chicken"));
        System.out.println("Test 1");
        test.print(); //works when null

        //TEST 2
        System.out.println("Test 2");
        System.out.println(test.remove("ice cream"));
        test.print(); //works when null

        //TEST 3
        System.out.println("Test 3");
        System.out.println(test.remove("chicken"));
        test.print(); 

        //TEST 4
        System.out.println("Test 4");
        System.out.println(test.find("spinach"));

        //TEST 5
        test.insertAtEnd(new FoodNode("eggs"));
        System.out.println("Test 5");
        System.out.println(test.find("eggs"));
        test.print();

        //TEST 6
        System.out.println("Test 6");
        test.insertAtStart(new FoodNode("onions"));
        test.print();

        //TEST 7
        System.out.println("Test 7");
        test.insert(new FoodNode("strawberries"), "bananas");
        test.print();
    }
}