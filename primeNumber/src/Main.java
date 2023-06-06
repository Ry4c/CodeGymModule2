import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap n:");
        int number = input.nextInt();
        int count = 0;
        int i = 2;
        while (count <= number) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    public static boolean isPrime(int a) {
        boolean flag = true;
        if (a < 2) {
            flag = false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}