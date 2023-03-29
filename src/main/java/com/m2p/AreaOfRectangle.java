package com.m2p;

public class AreaOfRectangle {

    private int length;

    private int width;
    AreaOfRectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

   public static AreaOfRectangle createSquare(int side){
        return new AreaOfRectangle(side,side);
   }

    public int findArea() {
        if(length < 0 || width < 0){
            throw new IllegalArgumentException();
        }
        return length * width;
    }

    public int findPerimeter() {
        if(length <= 0 || width <= 0){
            throw new IllegalArgumentException();
        }
        return 2*(length + width);
    }

//    public int findAreaOfSquare(int lengthOfTheSide) {
//
//        if(lengthOfTheSide <= 0){
//            throw new IllegalArgumentException();
//        }
//        return lengthOfTheSide*lengthOfTheSide;
//    }
//
//    public int findPerimeterOfSquare(int lengthOfSide) {
//
//        if(lengthOfSide <= 0){
//            throw new IllegalArgumentException();
//        }
//        return 4*lengthOfSide;
//    }
}
