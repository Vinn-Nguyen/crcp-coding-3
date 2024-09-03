//Name: Wren Nguyen
//Project Name: Hello World & more!
//Date: 8.29.2024
//CRCP Coding III

package processing_h;

import processing.core.*;
public class Main extends PApplet{
    //global color values
    float r; //red
    float g; //green
    float b; //blue

    public static void main(String[] args) {
        PApplet.main("processing_h.Main");
        System.out.println("Hello world!"); //hello world in terminal
    }

    public void settings(){
        size(700,700); //size of canvas
    }
    public void setup(){
    }
    //changes background color to random values when pressing the mouse
    public void mousePressed(){ 
        r = random (255);
        g = random (255);
        b = random (255);
    }
    public void draw(){
        background(r, g, b); //background

        int x = 50; //location of the x
        int y = 50; //location of the y
        int shapeD = 200; //shape dimensions (for the simplier shapes)
        
        ellipse(3*x, 3*y, shapeD, shapeD); //draw circle

        rectMode(CENTER); //set rectangle mode
        rect(3*x, 8*y, shapeD, shapeD); //draw rectangle

        arc(7*x, 4*y, shapeD, shapeD, PI+QUARTER_PI, TWO_PI); //draw arc

        //complicated shapes need manual input
        triangle(300, 500, 400, 300, 500, 500); //draw triangle

        quad(450, 550, 650, 450, 600, 550, 450, 600); //draw trapizoid
    }
}