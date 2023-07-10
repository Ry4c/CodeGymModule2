package model.manage;

import model.base_class.ReadWriteFile;
import model.base_class.Student;
import model.base_class.User;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements Manage<Student> {
    static List<Student> students;
    ReadWriteFile readWriteFile = new ReadWriteFile();
    ClassManage classManage = new ClassManage();
    UsersManage usersManage = new UsersManage();

    public StudentManage() {
        this.students = readWriteFile.readDataStudent();
    }

    @Override
    public void addNew(Student student) {
        students.add(student);
        readWriteFile.writeStudentData(this.students);
        usersManage.addNew(new User(student.getId(), student.getId(), 1));
    }

    @Override
    public void delete(String id) {
        if (findIndexById(id) != -1) {
            students.remove(findIndexById(id));
            readWriteFile.writeStudentData(this.students);
            usersManage.delete(id);
        }
    }

    @Override
    public void edit(Student student) {
        int index = findIndexById(student.getId());
        students.get(index).setName(student.getName());
        students.get(index).setDateOfBirth(student.getDateOfBirth());
        students.get(index).setAddress(student.getAddress());
        students.get(index).setClassName(student.getClassName());
        readWriteFile.writeStudentData(this.students);
    }

    public int findIndexById(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equalsIgnoreCase(id))
                return i;
        }
        return -1;
    }

    public List<Student> searchByName(String name) {
        List<Student> searchResult = new ArrayList<>();
        for (Student s :
                students) {
            if (s.getName().toLowerCase().contains(name.toLowerCase()))
                searchResult.add(s);
        }
        return searchResult;
    }

    public List<Student> searchById(String id) {
        List<Student> searchResult = new ArrayList<>();
        for (Student s :
                students) {
            if (s.getName().toLowerCase().contains(id.toLowerCase()))
                searchResult.add(s);
        }
        return searchResult;
    }

    public boolean isIdExist(String id) {
        for (Student s :
                students) {
            if (s.getId().equals(id)) return true;
        }
        return false;
    }

    public String getClassnameById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) return s.getClassName();
        }
        return "";
    }
}
