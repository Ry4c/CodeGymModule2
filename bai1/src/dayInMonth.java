package bai1.src;

import java.util.Scanner;

public class dayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap thang");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang " + month + " co 31 ngay");
                break;
            case 2:
                System.out.println("thang "  + month + " co 28 hoac 29 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang " + month + " co 30 ngay");
                break;
            default:
                System.out.println("khong co thang nay");
                break;
        }
    }
}
