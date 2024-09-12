/*
Name: Wren Nguyen
Date: 9/12/2024
Description: Draws all the arrays using the Square class
 */

package com.processing_pe;
import processing.core.*;
import java.util.ArrayList;

public class Animate {
    PApplet main;
    ArrayList<Square> arrayUno;

    Animate(PApplet main_){
        main = main_;
    }

    void draw(){
        for (int i = 0; i<arrayUno.size(); i++){
            arrayUno.get(i).draw();
        } 
    }

}
