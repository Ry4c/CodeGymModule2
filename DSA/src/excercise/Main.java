package excercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        excercise excercise = new excercise();
        int n = scanner.nextInt();
        System.out.println(excercise.sumOfSomething(n));
    }
}
