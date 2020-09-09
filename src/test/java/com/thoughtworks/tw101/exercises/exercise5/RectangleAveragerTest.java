package com.thoughtworks.tw101.exercises.exercise5;

import junit.framework.TestCase;
import org.junit.Test;

public class RectangleAveragerTest extends TestCase {

    @Test
    public void averageArea_shouldReturnAverageOfRectangleAreas(){
        Rectangle[] rectangles = {
                new Rectangle(2, 3),
                new Rectangle(3, 4),
                new Rectangle(4, 5),
        };

        RectangleAverager averager = new RectangleAverager();
        float actualResult = averager.averageArea(rectangles);

        assertEquals(12.6667, actualResult);
    }

}