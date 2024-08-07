package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {



    public static void printTriangelPerimetr(Triangle p) {
        String text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", p.a, p.b, p.c, p.triangelPerimetr());
        System.out.println(text);
    }


    public double triangelPerimetr() {
        return this.a + this.b + this.c;
    }


    public static void printTriangelArea(Triangle s) {
        String text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", s.a, s.b, s.c, s.triangelArea());
        System.out.println(text);
    }


    public double triangelArea() {
        return Math.sqrt(((triangelPerimetr())/2) * (((triangelPerimetr())/2) - this.a) * (((triangelPerimetr())/2) - this.b) * (((triangelPerimetr())/2) - this.c));
    }
}
