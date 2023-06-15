package exercise.menu;

import exercise.model.Cadres;
import exercise.model.Engineer;
import exercise.model.Staffs;
import exercise.model.Worker;
import exercise.management.CadresManagement;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    CadresManagement cadresManagement;
    public MainMenu(){
        cadresManagement = new CadresManagement();
        cadresManagement.CadresManagement();
    }
    public void showMain(){
        int choice;
        do{
            System.out.println("=======MainMenu=======\n1. them can bo\n2. tim kiem\n3. hien thi tat ca\n0. thoat");
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    menuAdd();
                    break;
                case 2:
                    menuSearch();
                    break;
                case 3:
                    cadresManagement.displayAll();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
    public void menuAdd(){
        int choice;
        do {
            System.out.println("=======MainMenu=======\n1. them cong nhan\n2. them ki su\n3. them nhan vien\n0. thoat");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addWorker();
                    break;
                case 2:
                    addEngineer();
                    break;
                case 3:
                    addStaff();
                    break;
            }
        }while (choice!=0);
    }
    public void menuSearch(){
        scanner.nextLine();
        System.out.println("nhap ten can bo");
        String name = scanner.nextLine();
        cadresManagement.displaySearch(name);
    }

    public void addWorker(){
        System.out.println("nhap ten");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("nhap tuoi");
        String age = scanner.nextLine();
        int gender;
        do{
            System.out.println("nhap gioi tinh\n 1. nam\n 2. nu\n 3. khac");
            gender = Integer.parseInt(scanner.nextLine());
            if(gender<1 || gender>3) {
                System.out.println("vui long nhap dung");
            }
        }while (gender<1 || gender>3);
        System.out.println("nhap dia chi:");
        String address = scanner.nextLine();
        int rank;
        do{
            System.out.println("nhap cap bac:");
            rank = scanner.nextInt();
            if (rank <1 || rank>10){
                System.out.println("cap bac phai tu 1 den 10");
            }
        }while (rank <1 || rank>10);
        Cadres worker1 = new Worker(name, age, gender, address, rank);
        cadresManagement.addCadres(worker1);
    }

    public void addEngineer(){
        System.out.println("nhap ten");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("nhap tuoi");
        String age = scanner.nextLine();
        int gender;
        do{
            System.out.println("nhap gioi tinh\n 1. nam\n 2. nu\n 3. khac");
            gender = Integer.parseInt(scanner.nextLine());
            if(gender<1 || gender>3) {
                System.out.println("vui long nhap dung");
            }
        }while (gender<1 || gender>3);
        System.out.println("nhap dia chi:");
        String address = scanner.nextLine();
        System.out.println("nhap chuyen nganh:");
        String major = scanner.nextLine();
        Cadres engineer1 = new Engineer(name, age, gender, address, major);
        cadresManagement.addCadres(engineer1);
    }
    public void addStaff(){
        System.out.println("nhap ten");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("nhap tuoi");
        String age = scanner.nextLine();
        int gender;
        do{
            System.out.println("nhap gioi tinh\n 1. nam\n 2. nu\n 3. khac");
            gender = Integer.parseInt(scanner.nextLine());
            if(gender<1 || gender>3) {
                System.out.println("vui long nhap dung");
            }
        }while (gender<1 || gender>3);
        System.out.println("nhap dia chi:");
        String address = scanner.nextLine();
        System.out.println("nhap cong viec:");
        String job = scanner.nextLine();
        Cadres staff = new Staffs(name, age, gender, address, job);
        cadresManagement.addCadres(staff);
    }
}
