package Model.BaseClass;

import Model.BaseClass.Student;
import Model.Manage.Manage;

import java.util.ArrayList;
import java.util.List;

public class Clazz {
    private String classname;
    private List<Student> classMate;

    public Clazz(String classname) {
        this.classname = classname;
        classMate = new ArrayList<>();
    }

    public void addNew(Student student) {
        classMate.add(student);
    }

    public void delete(String id) {
        classMate.remove(findIndexById(id));
    }

    public int findIndexById (String id){
        for (int i = 0; i < classMate.size(); i++) {
            if (classMate.get(i).getId().equals(id))
                return i;
        }
        return -1;
    }

    public String getClassname() {
        return classname;
    }

    public List<Student> getClassMate() {
        return classMate;
    }
}
