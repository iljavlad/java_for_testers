package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void canCalculadePerimetr() {
        double result = Triangle.TriangelPerimetr(3,5,7);
        Assertions.assertEquals(15, result);
    }

    @Test
    void canCalculateArea() {
        Assertions.assertEquals(24.0, Triangle.TriangelArea(6,8,10));
    }
}
