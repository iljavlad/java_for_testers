package ru.stqa.geometry.figures;

public class Triangle {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

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

    public double TriangelPerimetr() {
        return this.a + this.b + this.c;
    }

    public double TriangelArea() {
        return Math.sqrt(((this.a + this.b + this.c)/2) * (((this.a + this.b + this.c)/2) - this.a) * (((this.a + this.b + this.c)/2) - this.b) * (((this.a + this.b + this.c)/2) - this.c));
    }
}
