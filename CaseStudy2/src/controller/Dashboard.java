package controller;

import model.base_class.Clazz;
import model.base_class.Student;
import model.base_class.User;
import model.manage.ClassManage;
import model.manage.StudentManage;
import model.manage.UsersManage;
import view.Input;
import view.MenuData;

import java.util.List;
import java.util.Random;

public class Dashboard {
    Input input = new Input();
    MenuData menuData = new MenuData();
    UsersManage usersManage = new UsersManage();
    StudentManage studentManage = new StudentManage();
    ClassManage classManage = new ClassManage();
    String userName = null;

    public void getMainDashboard() {
        int accessLevel;
        do {
            accessLevel = getLoginDashboard();
            switch (accessLevel) {
                case 1:
                    getStudentDashboard();
                    break;
                case 2:
                    getUserDashboard();
                    break;
                case 3:
                    getAdminDashboard();
                    break;
            }
        } while (accessLevel != 0);
    }

    public int getLoginDashboard() {
        System.out.println(menuData.getLogin());
        if (userNameCheck() && pswCheck())
            return usersManage.getUsers().get(userName).getAccessLevel();
        return 0;
    }

    public boolean userNameCheck() {
        userName = input.inputUsername();
        if (usersManage.getUsers().get(userName) == null) {
            System.out.println("Ten dang nhap khong ton tai");
            userName = null;
            return false;
        }
        return true;
    }

    public boolean pswCheck() {
        String password = input.inputPsw();
        if (!usersManage.getUsers().get(userName).getPsw().equals(password)) {
            System.out.println("Sai mat khau");
            password = null;
            return false;
        }
        return true;
    }

    void getAdminDashboard() {
        int choice;
        do {
            System.out.println(menuData.getAdmin());
            choice = input.inputInteger();
            if (choice < 0 || choice > 4) System.out.println("Doc roi hang nhap");
            switch (choice) {
                case 1:
                    AdminAdd();
                    break;
                case 2:
                    getAdminEditDashboard();
                    break;
                case 3:
                    getAdminDeleteDashboard();
                    break;
                case 4:
                    getSearchDashboard();
                    break;
            }
        } while (choice != 0);
    }

    public void AdminAdd() {
        int choice;
        do {
            System.out.println(menuData.getAdminAdd());
            choice = input.inputInteger();
            if (choice < 0 || choice > 2) System.out.println("Doc roi hang nhap");
            switch (choice) {
                case 1:
                    creatNewUser();
                    break;
                case 2:
                    createNewStudent();
                    break;
            }
        } while (choice != 0);
    }

    public void creatNewUser() {
        String username;
        do {
            username = input.inputUsername();
            if (usersManage.isUserExist(username)) System.out.println("Ten dang nhap trung");
        } while (usersManage.isUserExist(username));
        String psw = input.inputPsw();
        usersManage.addNew(new User(username, psw, 2));
    }

    public void createNewStudent() {
        String id = creatNewStudentId();
        String name = input.inputName();
        String className = input.inputClassname();
        String dateOfBirth = input.inputDate();
        String address = input.inputAddress();
        Student student = new Student(id, name, dateOfBirth, className, address);
        studentManage.addNew(student);
        System.out.println("Tao thanh cong voi id =" + id);
    }

    public String creatNewStudentId() {
        String id = "";
        int idPart1 = -1;
        do {
            System.out.println("Nhap khoa (2 chu so)");
            idPart1 = input.inputInteger();
            if (idPart1 < 0 || idPart1 > 99) System.out.println("HAI CHU SO!!");
        } while (idPart1 < 0 || idPart1 > 99);
        System.out.println("Chon khoi thi:");
        int choice = -1;
        do {
            System.out.println("1.Khoi A\n2.Khoi B\n3.Khoi C\n4.Khoi D");
            choice = input.inputInteger();
            if (choice < 1 || choice > 4) System.out.println("Nhap lai di");
        } while (choice < 1 || choice > 4);
        do {
            switch (choice) {
                case 1:
                    id = idPart1 + "A" + createRandomPart();
                    break;
                case 2:
                    id = idPart1 + "B" + createRandomPart();
                    break;
                case 3:
                    id = idPart1 + "C" + createRandomPart();
                    break;
                case 4:
                    id = idPart1 + "D" + createRandomPart();
                    break;
            }
            if (!studentManage.isIdExist(id)) break;
        } while (true);
        return id;
    }

    public String createRandomPart() {
        Random random = new Random();
        int random1 = (random.nextInt(998) + 1);
        if (random1 < 10) return "00" + random1;
        else if (random1 < 100) return "0" + random1;
        else return "" + random1;
    }

    public void getAdminEditDashboard() {
        int choice = -1;
        do {
            System.out.println(menuData.getAdminEdit());
            choice = input.inputInteger();
            if (choice < 0 || choice > 4) System.out.println("Nhap lai di");
            switch (choice) {
                case 1:
                    editUserPsw();
                    break;
                case 2:
                    editStudentPsw();
                    break;
                case 3:
                    editStudentInfo();
                    break;
                case 4:
                    changePsw();
                    break;
            }
        } while (choice != 0);
    }

    public void editUserPsw() {
        String username;
        do {
            username = input.inputUsername();
            String psw;
            if (usersManage.isUserExist(username)) {
                System.out.println("Mat khau moi");
                String newPsw = input.inputPsw();
                usersManage.addNew(new User(username, newPsw, 2));
                System.out.println("Thanh cong");
                break;
            } else System.out.println("Ten dang nhap khong ton tai");
        } while (true);
    }

    public void editStudentPsw() {
        String id;
        do {
            id = input.inputId();
            if (usersManage.isUserExist(id)) {
                String newPsw = input.inputPsw();
                usersManage.addNew(new User(id, newPsw, 1));
                System.out.println("Thanh cong");
                break;
            } else System.out.println(" ID khong ton tai");
        } while (true);
    }

    public void editStudentInfo() {
        String id;
        id = input.inputId();
        if (usersManage.isUserExist(id)) {
            String name = input.inputName();
            String dateOfBirth = input.inputDate();
            String className = input.inputClassname();
            String address = input.inputAddress();
            studentManage.edit(new Student(id, name, dateOfBirth, className, address));
            System.out.println("Thanh cong");
        } else System.out.println(" ID khong ton tai");
    }

    public void changePsw() {
        System.out.println("Nhap mat khau cu:");
        if (pswCheck()) {
            System.out.println("Nhap mat khau moi");
            String newPsw = input.inputPsw();
            usersManage.getUsers().get(userName).setPsw(newPsw);
            usersManage.edit(usersManage.getUsers().get(userName));
            System.out.println("Thanh cong");
        }
    }

    public void getAdminDeleteDashboard() {
        do {
            System.out.println("Nhap username can xoa");
            String username = input.inputUsername();
            if (usersManage.getUsers().get(userName) != null) {
                usersManage.delete(username);
                break;
            }
        } while (true);
    }

    public void getSearchDashboard() {
        int choice;
        do {
            System.out.println(menuData.getSearchMenu());
            choice = input.inputInteger();
            if (choice < 0 || choice > 3) System.out.println("Nhap lai di");
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten");
                    String name = input.inputString();
                    List<Student> list = studentManage.searchByName(name);
                    for (Student s : list) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    System.out.println("Nhap id");
                    String id = input.inputString();
                    List<Student> list1 = studentManage.searchById(id);
                    for (Student s : list1) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    System.out.println("Nhap ten lop");
                    String classname = input.inputString();
                    if (classManage.isClassExist(classname)) {
                        List<Student> list2 = classManage.getClasses().get(classname).getClassMate();
                        for (Student s : list2) {
                            System.out.println(s);
                        }
                    } else System.out.println("Chua co lop nay");
                    break;
            }
        } while (choice != 0);
    }

    public void getUserDashboard() {
        int choice = -1;
        do {
            System.out.println(menuData.getUserMenu());
            choice = input.inputInteger();
            if (choice < 0 || choice > 4) System.out.println("Nhap lai di");
            switch (choice) {
                case 1:
                    createNewStudent();
                    break;
                case 2:
                    getUserEdit();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    getSearchDashboard();
                    break;
            }
        } while (choice != 0);
    }

    public void getUserEdit() {
        int choice;
        while (true) {
            System.out.println(menuData.getUserEdit());
            choice = input.inputInteger();
            if (choice < 0 || choice > 2) System.out.println("Nhap lai di");
            if (choice == 0) break;
            switch (choice) {
                case 1:
                    editStudentInfo();
                    break;
                case 2:
                    changePsw();
                    break;
            }
        }
    }

    public void deleteStudent() {
        while (true) {
            String id = input.inputId();
            if (studentManage.isIdExist(id)) {
                studentManage.delete(id);
                usersManage.delete(id);
                break;
            } else System.out.println("Id khong ton tai");
        }
    }

    public void getStudentDashboard() {
        while (true) {
            System.out.println(menuData.getStudentMenu());
            int choice = input.inputInteger();
            if (choice < 0 || choice > 2) System.out.println("nhap lai di");
            if (choice == 0) break;
            switch (choice) {
                case 1:
                    changePsw();
                    break;
                case 2:
                    String classname = studentManage.getClassnameById(userName);
                    Clazz clazz = classManage.getClasses().get(classname);
                    for (Student s : clazz.getClassMate()) {
                        System.out.println(s);
                    }
                    break;
            }
        }
    }
}