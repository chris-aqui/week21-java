package com.shapes;

import java.lang.Math;

//  Your implementation goes here.

class Square {
    // Your implementation goes here.
    private final static int SIDES = 3;
    private double sideLength;

    Square (double sideLength){
        this.sideLength = sideLength;
    }

    double area() {
        return (sideLength * sideLength);
    }

    double perimeter(){
        return sideLength * SIDES;
    }

    static int getSides (){
        return SIDES;
    }
    /**
     * @return The height of this triangle.
     */
    double getHeight () {
        // Replace SIDE_LENGTH with your side length variable.
        return Math.sin(Math.toRadians(60)) * this.sideLength;
    }
}

