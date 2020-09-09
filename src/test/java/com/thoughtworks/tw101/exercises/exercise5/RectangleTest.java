package com.thoughtworks.tw101.exercises.exercise5;

import junit.framework.TestCase;
import org.junit.Test;

public class RectangleTest extends TestCase {

    @Test
    public void area_shouldReturnAreaOfRectangle(){
        Rectangle rectangle = new Rectangle(2, 2);
        int actualArea = rectangle.area();

        assertEquals(4, actualArea);
    }
}