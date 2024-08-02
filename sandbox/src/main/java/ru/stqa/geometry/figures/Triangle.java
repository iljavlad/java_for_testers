package ru.stqa.geometry.figures;

public class Triangle {

    public static void printTriangelPerimetr(double a, double b, double c) {
        String text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", a, b, c,TriangelPerimetr(a, b, c));
        System.out.println(text);
    }

    public static double TriangelPerimetr(double a, double b, double c) {
        return a + b + c;
    }

    public static void printTriangelArea(double a, double b, double c) {
        String text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", a, b, c,TriangelArea(a, b, c));
        System.out.println(text);
    }

    public static Object TriangelArea(double a, double b, double c) {
        return Math.sqrt(((a + b + c)/2) * (((a + b + c)/2) - a) * (((a + b + c)/2) - b) * (((a + b + c)/2) - c));
    }

}
