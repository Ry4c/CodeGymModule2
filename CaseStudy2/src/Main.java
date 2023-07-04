import view.Input;

public class Main {
    public static void main(String[] args) {
        String addressRegex/*(xa, huyen, tinh)*/ = "^([\\w]{2,}(.)+){3,}[\\w]{2,}$";
        System.out.println("xa.huyen.tinh".matches(addressRegex));
    }
}