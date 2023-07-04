package Model.Manage;

import Model.BaseClass.Clazz;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClassManage implements Manage<Clazz> {
    Map classes;

    public ClassManage() {
        classes = new LinkedHashMap<String, Clazz>();
    }

    @Override
    public void addNew(Clazz clazz) {
        classes.put(clazz.getClassname(), clazz.getClassMate());
    }

    @Override
    public void delete(String id) {
        classes.remove(id);
    }

    @Override
    public void edit(Clazz clazz) {
        classes.put(clazz.getClassname(), clazz.getClassMate());
    }

    public Map getClasses() {
        return classes;
    }
    public boolean isClassExist(String className){
        if (classes.get(className) != null) return true;
        return false;
    }
}
