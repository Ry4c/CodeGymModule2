package Exsercise;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        do{
            System.out.println("menu");
            System.out.println("1. Thêm động vật");
            System.out.println("2. Xoá động vật");
            System.out.println("3. Sửa động vật");
            System.out.println("4. Tìm kiếm động vật");
            System.out.println("5. Hiển thị tất cả");
            System.out.println("6. Hiển thị tất cả mèo");
            System.out.println("7. Kiểm tra mèo có bệnh hay không?");
            System.out.println("0. Exit ");
            index= scanner.nextInt();
        }while (index >7);

    }

}
