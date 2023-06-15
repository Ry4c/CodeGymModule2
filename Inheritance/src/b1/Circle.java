package b1;

public class Circle extends Shape{
    private double radius;
    Circle (){
        radius= 1.0;
    }

    Circle (double radius){
        this.radius = radius;
    }

    Circle (String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }
    double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
