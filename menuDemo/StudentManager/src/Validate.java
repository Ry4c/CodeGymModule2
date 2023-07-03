import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    final String idRegex = "^[\\d]{2}[ABCD][\\d]{3}$";
    final String addressRegex = "^([\\w]{2,}(,)+){3,}[\\w]{2,}$";
    final String dateRegex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    final String nameRegex = "^[\\p{L}\\p{M}']+([\\s-][\\p{L}\\p{M}']+)*$";
    final String a = "";
    public String validateId(){
        String id;
        do {
            System.out.println("Nhap ID co dang \'23[A/B/C/D]123\':");
            id = (new Scanner(System.in)).nextLine();
        }while (!Pattern.matches(idRegex, id));
        return id;
    }
    public String validateAddress (){
        String address;
        do {
            System.out.println("Nhap dia chi co dang: thon, xa, huyen, tinh");
            address = (new Scanner(System.in)).nextLine();
        }while (!Pattern.matches(addressRegex,address));
        return address;
    }
}