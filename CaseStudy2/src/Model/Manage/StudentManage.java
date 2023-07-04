package Model.Manage;

import Model.BaseClass.ReadWriteFile;
import Model.BaseClass.Student;
import Model.BaseClass.User;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements Manage<Student> {
    List<Student> students;
    ReadWriteFile readWriteFile = new ReadWriteFile();

    public StudentManage(List<Student> students) { this.students = readWriteFile.readDataStudent(); }

    @Override
    public void addNew(Student student) {
        students.add(student);
        readWriteFile.writeStudentData(this.students);
        UsersManage.users.put(student.getId(), new User(student.getId(),student.getName(),1));
    }

    @Override
    public void delete(String id) {
        if (findIndexById(id) != -1) {
            students.remove(findIndexById(id));
            readWriteFile.writeStudentData(this.students);
        }
    }

    @Override
    public void edit(Student student) {
        int index = findIndexById(student.getId());
        students.get(index).setName(student.getName());
        students.get(index).setName(student.getDateOfBirth());
        students.get(index).setName(student.getAddress());
        students.get(index).setName(student.getClassName());
        readWriteFile.writeStudentData(this.students);
    }

    public int findIndexById(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equalsIgnoreCase(id))
                return i;
        }
        return -1;
    }
    public List<Student> searchByName(String name){
        List<Student> searchResult = new ArrayList<>();
        for (Student s :
                students) {
            if (s.getName().toLowerCase().contains(name.toLowerCase()))
                searchResult.add(s);
        }
        return searchResult;
    }
    public List<Student> searchById(String id){
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
}
