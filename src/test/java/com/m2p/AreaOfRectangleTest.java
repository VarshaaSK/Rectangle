package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AreaOfRectangleTest {

    AreaOfRectangle areaOfRectangle = new AreaOfRectangle();

    @Nested
    class RectangleArea {
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

    @Nested
    class RectanglePerimeter{

        @Test
        void toReturnThePerimeterOfTheRectangle(){

            //Arrange
            int expectedPerimeter = 10;

            //Act
            int actualPerimeter = areaOfRectangle.findPerimeter(2,3);

            //Assert
            assertEquals(expectedPerimeter , actualPerimeter);
        }

        @Test
        void toThrowExceptionWhenLengthOrWidthIsInvalid(){
            assertThrows(IllegalArgumentException.class , () -> areaOfRectangle.findPerimeter(2,-3));
        }
    }

    @Nested
    class AreaAndPerimeterOfSquare{

        @Test
        void toReturnTheAreaOfTheSquare(){

            //Arrange
            int expectedSquareArea = 16;

            //Act
            int actualArea = areaOfRectangle.findAreaOfSquare(4);
        }

        @Test
        void toThrowExceptionIfSideIsNegative(){
            assertThrows(IllegalArgumentException.class , () -> areaOfRectangle.findAreaOfSquare(-5));
        }

        @Test
        void toReturnThePerimeterOfTheSquare(){

            //Arrange
            int expectedPerimeter = 8;

            //Act
            int actualPerimeter = areaOfRectangle.findPerimeterOfSquare(2);

            //Assert
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        void toThrowExceptionInPerimeterWhenSideIsNegative(){
            assertThrows(IllegalArgumentException.class, () -> areaOfRectangle.findPerimeterOfSquare(-10));
        }
    }

}
