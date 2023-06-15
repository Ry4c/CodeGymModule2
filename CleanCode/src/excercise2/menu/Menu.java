package excercise2.menu;

import excercise2.management.DocManager;
import excercise2.model.Book;
import excercise2.model.Document;
import excercise2.model.Magazine;
import excercise2.model.Newspaper;

import java.util.Scanner;

public class Menu {
    Scanner inputNum = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);
    DocManager docManager;

    public Menu() {
        docManager = new DocManager();
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("=======Main Menu=======");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Hien toan bo sach");
            System.out.println("4. Hien toan bo tap chi");
            System.out.println("5. Hien toan bo bao");
            System.out.println("0. Exit");
            choice = inputNum.nextInt();
            if (choice < 0 || choice > 5) {
                System.out.println("vui long nhap lai");
            }
            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    deleteMenu();
                    break;
                case 3:
                    docManager.showBook();
                    break;
                case 4:
                    docManager.showMagazine();
                    break;
                case 5:
                    docManager.showNewspaper();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    private void addMenu() {
        int choice;
        do {
            System.out.println("Them tai lieu");
            System.out.println("1. Them sach");
            System.out.println("2. Them tap chi");
            System.out.println("3. Them bao");
            System.out.println("0. Exit");
            choice = inputNum.nextInt();
            if (choice == 0) break;
            System.out.println("nhap ID:");
            String id = inputStr.nextLine();
            System.out.println("nhap ten");
            String name = inputStr.nextLine();
            System.out.println("nhap so luong");
            int quantity = inputNum.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhap ten tac gia");
                    String writer = inputStr.nextLine();
                    System.out.println("nhap so trang");
                    int numberOfPages = inputNum.nextInt();
                    Document document = new Book(id, name, quantity, writer, numberOfPages);
                    docManager.addDoc(document);
                    choice = 0;
                    break;
                case 2:
                    System.out.println("nhap so phat hanh");
                    String issueNumber = inputStr.nextLine();
                    int releaseMonth;
                    do {
                        System.out.println("nhap thang phat hanh");
                        releaseMonth = inputNum.nextInt();
                        if (releaseMonth < 1 || releaseMonth > 12) {
                            System.out.println("nhap lai thang cho dung");
                        }
                    } while (releaseMonth < 1 || releaseMonth > 12);
                    Document document1 = new Magazine(id, name, quantity, issueNumber, releaseMonth);
                    docManager.addDoc(document1);
                    choice = 0;
                    break;
                case 3:
                    inputNum.nextLine();
                    System.out.println("nhap ngay phat hanh");
                    String releaseDay = inputNum.nextLine();
                    Document document2 = new Newspaper(id, name, quantity, releaseDay);
                    docManager.addDoc(document2);
                    choice = 0;
                    break;
                case 0:
                    break;

            }
        } while (choice != 0);

    }

    private void deleteMenu() {
        System.out.println("nhap id can xoa");
        String id = inputStr.nextLine();
        docManager.delDoc(id);
    }
}
