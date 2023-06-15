import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = input.nextLine();
        System.out.println("Nhap ki tu can dem:");
        char a = input.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) count++;
        }
        System.out.println("so lan xuat hien cua " + a + " la: " + count);
    }
}
