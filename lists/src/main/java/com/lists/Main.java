/* 
 * Name: Wren Nguyen
 * Date: Oct 2024
 * Project: LinkedList Introduction
 * Description: Main, runs all the test and prints everything to terminal
*/

package com.lists;

public class Main {
    public static void main(String[] args) {

        //TEST 1: create list and print it
        GroceryLinkedList test = new GroceryLinkedList(); //create linked list
        //add nodes to list
        test.insert(new FoodNode("milk"), 0);
        test.insert(new FoodNode("bananas"), 1);
        test.insert(new FoodNode("ice cream"), 2);
        test.insert(new FoodNode("spinach"), 3);
        test.insert(new FoodNode("chicken"), 4);
        //print
        System.out.println("Test 1");
        test.print(); 

        //TEST 2: remove ice cream and print list
        System.out.println("\n" + "Test 2"); 
        System.out.println(test.remove("ice cream")); //remove ice cream
        test.print(); //print

        //TEST 3: remove chicken and print list
        System.out.println("\n" + "Test 3");
        System.out.println(test.remove("chicken")); //remove chicken
        test.print(); //print

        //TEST 4: find spinach's index (2) and print list
        System.out.println("\n" + "Test 4");
        System.out.println(test.find("spinach")); //find spinach's index
        test.print(); //print

        //TEST 5: insert eggs, find egg's index (3) and printlist
        test.insertAtEnd(new FoodNode("eggs")); //insert eggs at the end
        System.out.println("\n" + "Test 5");
        System.out.println(test.find("eggs")); //find eggs's index
        test.print(); //print

        //TEST 6: add onions at the start and print list
        System.out.println("\n" + "Test 6");
        test.insertAtStart(new FoodNode("onions")); //insert onions at the start
        test.print(); //print

        //TEST 7: add strawberries after bananas and print list
        System.out.println("\n" + "Test 7");
        test.insert(new FoodNode("strawberries"), "bananas"); //search for bananas, add strawberries after
        test.print(); //print
    }
}