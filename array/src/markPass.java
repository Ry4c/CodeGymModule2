import java.util.Scanner;

public class markPass {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("enter size");
            size = input.nextInt();
            if (size > 30) System.out.println("shouldn't more than 30");
        } while (30 < size);
        double[] marks = new double[size];
        int count = 0;
        for (double i : marks) {
            if (i > 5 && i < 10) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("co " + count + " hoc sinh qua mon");
    }
}
