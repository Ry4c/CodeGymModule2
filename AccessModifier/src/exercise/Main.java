package exercise;

import static exercise.Circle.*;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle(2.5);
        Circle circle4 = new Circle(5.5);
        System.out.println(Circle.maxRadius);
        System.out.println(circle4.toString());
        System.out.println(Circle.count);
        System.out.println(circle3.getArea());
        System.out.println(circle3.getPerimeter());
        System.out.println(Circle.sumArea);
    }
}
