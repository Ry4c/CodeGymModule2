import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, exchangeRate;
        System.out.println("nhap tien can chuyen");
        usd = scanner.nextDouble();
        System.out.println("nhap ti gia");
        exchangeRate = scanner.nextDouble();
        double vnd = usd * exchangeRate;
        System.out.print("vnd = " + vnd);
    }
}