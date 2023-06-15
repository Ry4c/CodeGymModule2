package CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    Cylinder() {

    }

    Cylinder(double height) {
        this.height = height;
    }

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return super.toString() + "\' with height= " + this.height;
    }
}
