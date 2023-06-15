package exercise;

public class Circle {
    static final double pi = 3.14;
    static int count = 0;
    private String id;
    private double radius;
    static double sumArea;
    static double maxRadius=0;

    @Override
    public String toString() {
        return "Circle{" +
                "id='" + id + '\'' +
                ", radius=" + radius +
                '}';
    }

    Circle(double  radius ){
        count ++;
        this.radius= radius;
        this.id = "circle" +count;
        sumArea += this.getArea();
        if(radius>maxRadius) maxRadius=radius;
    }
    public double getArea(){
        return this.radius*this.radius*pi;
    }
    public double getPerimeter(){
        return this.radius*2*pi;
    }

}
