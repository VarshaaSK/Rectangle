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

//    @Nested
//    class AreaAndPerimeterOfSquare{
//
//        @Test
//        void toReturnTheAreaOfTheSquare(){
//
//            //Arrange
//            int expectedSquareArea = 16;
//
//            //Act
//            int actualArea = areaOfRectangle.findAreaOfSquare(4);
//        }
//
//        @Test
//        void toThrowExceptionIfSideIsNegative(){
//            assertThrows(IllegalArgumentException.class , () -> areaOfRectangle.findAreaOfSquare(-5));
//        }
//
//        @Test
//        void toReturnThePerimeterOfTheSquare(){
//
//            //Arrange
//            int expectedPerimeter = 8;
//
//            //Act
//            int actualPerimeter = areaOfRectangle.findPerimeterOfSquare(2);
//
//            //Assert
//            assertEquals(expectedPerimeter, actualPerimeter);
//        }
//
//        @Test
//        void toThrowExceptionInPerimeterWhenSideIsNegative(){
//            assertThrows(IllegalArgumentException.class, () -> areaOfRectangle.findPerimeterOfSquare(-10));
//        }
//    }

    @Nested
    class SquareArea{
        AreaOfRectangle square = createSquare(3);

        @Test
        void toCalculateTheAreaAndPerimeter(){
            int expectedArea = 9;

            int actualArea = square.findArea();

            assertEquals(expectedArea , actualArea);
        }
    }

}
