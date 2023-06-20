package b1ReverseString;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public String reverse(String string){
        String newString = "";
        Stack <String> nWord= new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' '){
                newString += string.charAt(i);
            }else {
                nWord.push(newString);
                newString = "";
            }
        }
        nWord.push(newString);
        newString = "";
        int size = nWord.size();
        for (int i = 0; i < size; i++) {
            newString += nWord.pop() + " ";
        }
        return newString;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi de lon nguoc:");
        String string = scanner.nextLine();
        System.out.println(reverse.reverse(string));
    }
}
