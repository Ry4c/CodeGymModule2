package excersice1.StudentMange;

import excersice1.model.Student;

import java.util.ArrayList;

public class StudentManage {
     private ArrayList<Student> studentManage;
    public StudentManage(){
        studentManage = new ArrayList<Student>();
    }
    public void addStudent(Student student){
        if(checkDouble(student)) {
            studentManage.add(studentManage.size(),student);
            System.out.println("Them thanh cong");
        }else {
            System.out.println("Trung so bao danh vui long kiem tra");
        }
    }
    public String findStudentByCandidateNum(String candidateNum){
        for (Student student :studentManage) {
            if (student.getCandidateNum().equalsIgnoreCase(candidateNum)){
                return student.toString();
            }
        }
        return "khong tim thay";
    }
    boolean checkDouble (Student student){
        for (Student stu : studentManage) {
            if (stu.getCandidateNum().equals(student.getCandidateNum()))
                return false;
        }
        return true;
    }
    public ArrayList<Student> getAll(){
        return studentManage;
    }

}
