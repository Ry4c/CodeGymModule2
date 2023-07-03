import java.util.List;
import java.util.Scanner;

public class Menu {
    StudentManager studentManager;
    Validate validate;
    Scanner scanner = new Scanner(System.in);

    public Menu() {
        studentManager = new StudentManager();
        validate = new Validate();
    }

    public void mainMenu() {
        int choice = -1;
        do {
            System.out.println("=====Menu=====");
            System.out.println("1. Them");
            System.out.println("2. Sua");
            System.out.println("3. Xoa");
            System.out.println("4. Tim bang ten");
            System.out.println("5. Tim bang id");
            System.out.println("0. thoat");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("sai kieu du lieu");
            }
            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    menuEdit();
                    break;
                case 3:
                    menuDel();
                    break;
                case 4:
                    menuSearchName();
                    break;
                case 5:
                    menuSearchId();
                    break;
            }
        } while (choice != 0);
    }

    private void addMenu() {
        System.out.println("===Them hoc sinh===");
        studentManager.addStudent(inputStudent());
        pause();
    }
    private void menuDel(){
        System.out.println("Nhap Id can xoa");
        String id = scanner.nextLine();
        studentManager.delStudent(id);
        pause();
    }
    private void menuEdit(){
        Student student = inputStudent();
        studentManager.editStudent(student.getId(), student.getName(),
                student.getAge(), student.getAddress());
        pause();
    }
    private void menuSearchName(){
        System.out.println("Nhap ten can tim:");
        String input = scanner.nextLine();
        List<Student> searchResult = studentManager.searchByName(input);
        if (searchResult.size() == 0) System.out.println("Khong tim thay");
        for (Student s :
                searchResult) {
            System.out.println(s.toString());
        }
        pause();
    }
    private void menuSearchId(){
        System.out.println("nhap id:");
        String input = scanner.nextLine();
        List<Student> searchResult = studentManager.searchById(input);
        if (searchResult.size() == 0) System.out.println("Khong tim thay");
        for (Student s :
                searchResult) {
            System.out.println(s.toString());
        }
        pause();
    }
    private Student inputStudent(){
        String id = validate.validateId();
        System.out.println("Nhap Ten:");
        String name = scanner.nextLine();
        int age = -1;
        while (true) {
            System.out.println("Nhap Tuoi:");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age != -1) break;
            }catch (NumberFormatException e){
                System.out.println("nhap lai cho dung");
            }
        }
        String address = validate.validateAddress();
        return new Student(id, name, age, address);
    }
    private void pause(){
        System.out.print("Press Enter to continue");
        scanner.nextLine();
    }
}
