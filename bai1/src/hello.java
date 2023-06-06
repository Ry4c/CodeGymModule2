package bai1.src;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("nhap ten");
        name = scanner.nextLine();
        System.out.println("hello " + name+ "!");
    }
}
