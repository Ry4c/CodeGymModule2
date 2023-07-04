package Model.BaseClass;

import java.io.*;
import java.util.*;

public class ReadWriteFile {
    File dataStudent = new File("CaseStudy2/src/Model/BaseClass/data/Student.csv");
    File user = new File("CaseStudy2/src/Model/BaseClass/data/user.csv");
    BufferedReader readData;

    {
        try {
            readData = new BufferedReader(new FileReader(dataStudent));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    BufferedReader readUser;

    {
        try {
            readUser = new BufferedReader(new FileReader(user));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    BufferedWriter writeStudent;

    {
        try {
            writeStudent = new BufferedWriter(new FileWriter(dataStudent));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    BufferedWriter writeUser;

    {
        try {
            writeUser = new BufferedWriter(new FileWriter(user));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Student> readDataStudent(){
        List<Student> students = new ArrayList<>();
        String lineData;
        while (true) {
            try {
                if ((lineData = readData.readLine())!= null){
                    String[] data = lineData.split(",");
                    students.add( new Student(data[0], data[1], data[2], data[3], data[4]+data[5]+data[6]));
                }else break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return students;
    }
    public Map<String, User> readDataUser(){
        Map<String, User> users = new HashMap();
        String dataLine;
        while (true) {
            try {
                if ((dataLine = readUser.readLine()) != null){
                    String[] userData = dataLine.split(",");
                    User user = new User(userData[0], userData[1], Integer.parseInt(userData[2]));
                    users.put(userData[0], user);
                } else break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return users;
    }
    public void writeStudentData(List<Student> students){
        String data = "";
        for (Student s :
                students) {
            data += (s.getId()+","+s.getName()+","+
                    s.getDateOfBirth()+","+s.getAddress()+","+s.getClassName()+"\n");
        }
        try {
            writeStudent.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeUserData(Map<String, User> map){
        Set<String> set = map.keySet();
        String data = "";
        for (String key : set) {
            data += (key+","+map.get(key).getPsw()+","+map.get(key).getAccessLevel()+"\n");
        }
        try {
            writeUser.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
