import java.util.Scanner;

public class cToF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        int choice;
        do{
            System.out.println("Menu:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit");
            choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("nhap do c: ");
                celsius = input.nextDouble();
                System.out.println("ket qua bang: "+ Celsius_to_Fahrenheit(celsius));
                break;
            case 2:
                System.out.println("nhap do f: ");
                fahrenheit = input.nextDouble();
                System.out.println("ket qua bang: "+ Fahrenheit_to_Celsius(fahrenheit));
                break;
            case 0:
                System.exit(0);
        }
        }while (choice != 0);
    }
    public static double Celsius_to_Fahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double Fahrenheit_to_Celsius(double fahrenheit) {
        double  celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
