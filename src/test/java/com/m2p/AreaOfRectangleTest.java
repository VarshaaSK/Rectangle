package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AreaOfRectangleTest {

    AreaOfRectangle areaOfRectangle = new AreaOfRectangle();

    @Nested
    class GeometricArea {
        @Test
        void toReturnAreaOfRectangle(){

            //Arrange
            int expectedArea = 6;

            //Act
            int actualArea = areaOfRectangle.findArea(2,3);

            //Assert
            assertEquals(expectedArea , actualArea);

        }

        @Test
        void toThrowExceptionWhenOneParameterIsNegative(){
            assertThrows(IllegalArgumentException.class , () -> areaOfRectangle.findArea(3,-2));
        }
    }

}
