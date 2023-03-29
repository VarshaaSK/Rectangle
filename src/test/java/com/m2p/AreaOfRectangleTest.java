package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.m2p.AreaOfRectangle.createSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AreaOfRectangleTest {

    AreaOfRectangle areaOfRectangle = new AreaOfRectangle(2,3);
    AreaOfRectangle areaOfRectangleForNegativeValue = new AreaOfRectangle(-2,3);
//    AreaOfRectangle square = areaOfRectangle.createSquare(3);



    @Nested
    class RectangleArea {
        @Test
        void toReturnAreaOfRectangle(){

            //Arrange
            int expectedArea = 6;

            //Act
            int actualArea = areaOfRectangle.findArea();

            //Assert
            assertEquals(expectedArea , actualArea);

        }

        @Test
        void toThrowExceptionWhenOneParameterIsNegative(){
            assertThrows(IllegalArgumentException.class , () -> areaOfRectangleForNegativeValue.findArea());
        }
    }

    @Nested
    class RectanglePerimeter{

        @Test
        void toReturnThePerimeterOfTheRectangle(){

            //Arrange
            int expectedPerimeter = 10;

            //Act
            int actualPerimeter = areaOfRectangle.findPerimeter();

            //Assert
            assertEquals(expectedPerimeter , actualPerimeter);
        }

        @Test
        void toThrowExceptionWhenLengthOrWidthIsInvalid(){
            assertThrows(IllegalArgumentException.class , () -> areaOfRectangleForNegativeValue.findPerimeter());
        }
    }


    @Nested
    class SquareArea{
        AreaOfRectangle square = createSquare(3);

        AreaOfRectangle squareSideWithNegativeValue = createSquare(-3);

        @Test
        void toCalculateTheAreaOfTheSquare(){
            int expectedArea = 9;

            int actualArea = square.findArea();

            assertEquals(expectedArea , actualArea);
        }

        @Test
        void toCalculateThePerimeterOfTheSquare(){

            int expectedPerimeter = 12;

            int actualPerimeter = square.findPerimeter();

            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        void toThrowExceptionOnArea(){
            assertThrows(IllegalArgumentException.class, () -> squareSideWithNegativeValue.findArea());
        }

        @Test
        void toThrowExceptionOnPerimeter(){
            assertThrows(IllegalArgumentException.class , () -> squareSideWithNegativeValue.findPerimeter());
        }
    }

}
