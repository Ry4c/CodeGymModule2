package view;

import Model.BaseClass.Student;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public int inputInteger() {
        int a = -1;
        do {
            try {
                a = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so");
            }
        } while (a == -1);
        return a;
    }
    private final String nameRegex = "^[\\p{L}\\p{M}']+([\\s-][\\p{L}\\p{M}']+)*$";
    public String inputName(){
        String name = "";
        do{
            System.out.println("Nhap ten(Ho va Ten):");
            name = scanner.nextLine();
        } while (!name.matches(nameRegex));
        return name;
    }
    private final String dateRegex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public String inputDate(){
        String date = "";
        do {
            System.out.println("nhap ngay sinh (dd\\mm\\yyyy)");
            date = scanner.nextLine();
        }while (!date.matches(dateRegex));
        return date;
    }
    private final String addressRegex/*(xa, huyen, tinh)*/ = "^([\\w]{2,}(,)+){3,}[\\w]{2,}$";
    public String inputAddress(){
        String address = "";
        do {
            System.out.println("nhap dia chi (xa, huyen, tinh)");
            address = scanner.nextLine();
        }while (!address.matches(addressRegex));
        return address;
    }
}
