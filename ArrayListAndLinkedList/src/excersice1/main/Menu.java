package excersice1.main;

import excersice1.StudentMange.StudentManage;
import excersice1.model.Student;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    StudentManage studentManage;

    public Menu() {
        studentManage = new StudentManage();
    }

    public void mainMenu() {
        int choice = -1;
        do {
            System.out.println("======Main Menu======");
            System.out.println("1. Them hoc sinh");
            System.out.println("2. Hien thi tong tin hoc sinh");
            System.out.println("3. Tim theo SDB");
            System.out.println("0. Thoat");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 0 || choice > 3)
                System.out.println("Vui long nhap lai");
            switch (choice) {
                case 1:
                    menuAdd();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    find();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    void menuAdd(){
        System.out.println("===Them hoc sinh===");
        System.out.println("chon khoi thi:");
        int block;
        do {
            System.out.println("1.Khoi A");
            System.out.println("2.Khoi B");
            System.out.println("3.Khoi C");
            block = Integer.parseInt(scanner.nextLine());
            if (block<1||block>3) System.out.println("vui long nhap lai");
        }while (block<1||block>3);
        System.out.println("Nhap so bao danh");
        String candidateNum = scanner.nextLine();
        System.out.println("Nhap ho va ten");
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi");
        String address = scanner.nextLine();
        System.out.println("Muc uu tien");
        int priorityLevel = Integer.parseInt(scanner.nextLine());
        Student student = new Student(candidateNum, name, address, priorityLevel, block);
        studentManage.addStudent(student);
    }
    void showAll(){
        for (Student student:studentManage.getAll()) {
            System.out.println(student.toString());
        }
    }
    void find(){
        System.out.println("nhap so bao danh:");
        String candidateNum = scanner.nextLine();
        System.out.println(studentManage.findStudentByCandidateNum(candidateNum));
    }
}
