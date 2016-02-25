package com.xeronith;

public class Rectangle {

    private int width;
    private int height;

    public void setWidth(int _width) {
        if (isSizeValid(_width)) {
            width = _width;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int _height) {
        if (isSizeValid(_height)) {
            height = _height;
        }
    }

    public int getHeight() {
        return height;
    }

    private boolean isSizeValid(int size) {
        if (size > 0 && size < 100) {
            return true;
        } else {
            Console.writeLine("Size is not valid.");
            return false;
        }
    }

    public void draw() {
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {
                Console.write("* ");
            }

            Console.writeLine();
        }
    }
}
