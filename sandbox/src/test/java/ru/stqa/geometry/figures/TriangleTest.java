package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void canCalculadePerimetr() {
        var p = new Triangle(3.0,5.0,7.0);
        double result = p.triangelPerimetr();
        Assertions.assertEquals(15, result);
    }

    @Test
    void canCalculateArea() {
        var s = new Triangle(6, 8, 10);
        double result = s.triangelArea();
        Assertions.assertEquals(24.0, result);
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(6.0,8.0,-10.0);
            Assertions.fail();
        }catch (IllegalArgumentException exception) {
            //OK
        }
    }

    @Test
    void cannotCreateTriangleSumTwoSides() {
        try {
            new Triangle(6.0, 8.0, 20.0);
            Assertions.fail();
        }catch (IllegalArgumentException exception) {
            //OK
        }
    }
}
