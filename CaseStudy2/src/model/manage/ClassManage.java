package model.manage;

import model.base_class.Clazz;
import model.base_class.Student;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClassManage implements Manage<Clazz> {
    static Map<String, Clazz> classes = new LinkedHashMap<String, Clazz>();


    @Override
    public void addNew(Clazz clazz) {
        classes.put(clazz.getClassname(), clazz);
    }

    @Override
    public void delete(String id) {
        classes.remove(id);
    }

    @Override
    public void edit(Clazz clazz) {
        classes.put(clazz.getClassname(), clazz);
    }

    public Map<String, Clazz> getClasses() {
        return classes;
    }

    public boolean isClassExist(String className) {
        if (classes.get(className) != null) return true;
        return false;
    }

    public void addClass(Student student) {
        if (!isClassExist(student.getClassName())) {
            Clazz clazz = new Clazz(student.getClassName());
            addNew(clazz);
        }
        getClasses().get(student.getClassName()).addNew(student);
    }
}
