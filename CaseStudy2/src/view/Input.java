package view;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    private final String NAME_REGEX = "^[\\p{L}\\p{M}']+([\\s-][\\p{L}\\p{M}']+)*$";
    private final String DATE_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private final String ADDRESS_REGEX = "^([\\w]{2,}(,)+){2}[\\w]{2,}$";
    private final String USERNAME_REGEX = "^(?=.{5,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";
    private final String PASSWORD_REGEX = "^[\\w!@#$%^&*]{5,}$";
    private final String CLASS_NAME_REGEX = "^[\\d]{1,2}[ABCD][\\d]{1,2}$";
    private final String ID_REGEX = "^[\\d]{1,2}[ABCD][\\d]{3}$";

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

    public String inputString() {
        return scanner.nextLine();
    }

    public String inputName() {
        String name;
        do {
            System.out.println("Nhap ten(Ho va Ten):");
            name = scanner.nextLine();
        } while (!name.matches(NAME_REGEX));
        return name;
    }

    public String inputDate() {
        String date;
        do {
            System.out.println("nhap ngay sinh (dd/mm/yyyy)");
            date = scanner.nextLine();
        } while (!date.matches(DATE_REGEX));
        return date;
    }

    public String inputAddress() {
        String address;
        do {
            System.out.println("nhap dia chi (xa,huyen,tinh)");
            address = scanner.nextLine();
        } while (!address.matches(ADDRESS_REGEX));
        return address;
    }

    public String inputUsername() {
        String username;
        do {
            System.out.println("Nhap ten dang nhap(5-12 ki tu gom \'.\' va\'_\')");
            username = scanner.nextLine();
        } while (!username.matches(USERNAME_REGEX));
        return username;
    }

    public String inputPsw() {
        String psw;
        do {
            System.out.println("nhap mat khau (6-20 ki tu)");
            psw = scanner.nextLine();
        } while (!psw.matches(PASSWORD_REGEX));
        return psw;
    }

    public String inputClassname() {
        String className;
        do {
            System.out.println("Nhap ten lop (12A11)");
            className = scanner.nextLine();
        } while (!className.matches(CLASS_NAME_REGEX));
        return className;
    }

    public String inputId() {
        String id;
        do {
            System.out.println("Nhap Id(12B123)");
            id = scanner.nextLine();
        } while (!id.matches(ID_REGEX));
        return id;
    }
}
