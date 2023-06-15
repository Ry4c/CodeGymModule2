import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void display() {
        System.out.println("Phương trình " + this.a + "x^2+" + this.b + "x+" + this.c + "=0");
    }

    public double getDiscriminant() {
        double discriminant = this.b * this.b - 4 * this.a * this.c;
        return discriminant;
    }

    public double getRoot1() {
        double root1 = 0;
        if (this.getDiscriminant() > 0) {
            root1 = (0 - this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        } else if (this.getDiscriminant() == 0) {
            root1 = 0 - (b / (2 * a));
        }
        return root1;
    }

    public double getRoot2() {
        double root2 = 0;
        if (this.getDiscriminant() > 0) {
            root2 = (0 - this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        } else if (this.getDiscriminant() == 0) {
            root2 = 0 - (b / (2 * a));
        }
        return root2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        do {
            System.out.print("nhap a \t");
            a = scanner.nextDouble();
            if (a == 0) System.out.println("a phải khác 0 mới là phương trinh bậc 2");
        }while (a == 0);
        System.out.print("nhap b \t");
        double b = scanner.nextDouble();
        System.out.print("nhap c \t");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(a, b, c);
        quadraticEquation1.display();
        if (quadraticEquation1.getDiscriminant() > 0) {
            System.out.println("có 2 nghiệm:");
            System.out.print(quadraticEquation1.getRoot1() + "\t" + quadraticEquation1.getRoot2());
        } else if (quadraticEquation1.getDiscriminant() == 0) {
            System.out.println("có nghiệm kép:");
            System.out.print(quadraticEquation1.getRoot1());
        } else {
            System.out.println("phương trình vô nghiệm!");
        }

    }
}
