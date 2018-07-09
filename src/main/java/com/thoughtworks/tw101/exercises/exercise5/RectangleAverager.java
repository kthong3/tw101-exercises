package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    
    public int sumOfAreas = 0;
    
    public float averageArea(Rectangle[] rectangles) {
        for (Rectangle rectangle : rectangles
             ) {
            System.out.println(rectangle.area());
            sumOfAreas += rectangle.area();
        }
        float avgArea = sumOfAreas/rectangles.length;
        return avgArea;
    }
}
