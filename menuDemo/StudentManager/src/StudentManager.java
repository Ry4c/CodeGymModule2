import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> students;
    ReadWriteFile readWriteFile;
    public StudentManager(){
        readWriteFile = new ReadWriteFile();
        students = readWriteFile.readData();
    }
    private boolean isIdExist(String id){
        for (Student s:students) {
            if (s.getId().equals(id)) return true;
        }
        return false;
    }
    private int findIndexById(String id){
        for (int i = 0; i < students.size(); i++) {
            if(this.students.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    public void addStudent(Student student){
        if (!isIdExist(student.getId())) {
            students.add(student);
            readWriteFile.writeData(students);
            System.out.println("them thanh cong");
        } else System.out.println("Id da ton tai");
    }
    public void delStudent(String id){
        if (!isIdExist(id)) System.out.println("khong ton tai ID nay");
        else {
            students.remove(findIndexById(id));
            readWriteFile.writeData(students);
            System.out.println("xoa thanh cong");
        }
    }
    public void editStudent(String id, String name, int age, String address){
        if (!isIdExist(id)) System.out.println("khong ton tai ID nay");
        else {
            students.get(findIndexById(id)).setName(name);
            students.get(findIndexById(id)).setAge(age);
            students.get(findIndexById(id)).setAddress(address);
            readWriteFile.writeData(students);
            System.out.println("sua thanh cong");
        }
    }
    public List<Student> searchByName(String name){
        List<Student> result = new ArrayList<>();
        for (Student s:
             students) {
            if(s.getName().toLowerCase().contains(name.toLowerCase())) result.add(s);
        }
        return result;
    }
    public List<Student> searchById(String id){
        List<Student> result = new ArrayList<>();
        for (Student s :
                students) {
            if (s.getId().contains(id)) result.add(s);
        }
        return result;
    }
}
