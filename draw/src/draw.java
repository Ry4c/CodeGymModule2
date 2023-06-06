import java.util.Scanner;

public class draw {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("input height:");
                    int n = input.nextInt();
                    System.out.println("input width:");
                    int m = input.nextInt();
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= m; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Menu");
                    System.out.println("1. top");
                    System.out.println("2. Print the square triangle");
                    System.out.println("3. Print isosceles triangle");
                    System.out.println("0. Exit");
                    break;
                case 3:
                    System.out.println("input height:");
                    n = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        for (int j = n - 1; j > 0; j--){
                            System.out.print(" ");
                        }
                        for (int k = 0; k<i; k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
    }
}