package com.m2p;

public class AreaOfRectangle {
    public int findArea(int length, int width) {
        if(length < 0 || width < 0){
            throw new IllegalArgumentException();
        }
        return length * width;
    }
}
