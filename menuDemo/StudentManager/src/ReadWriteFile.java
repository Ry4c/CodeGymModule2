import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public List<Student> readData() {
        BufferedReader br;
        try {
                br = new BufferedReader(new FileReader("menuDemo/StudentManager/src/data.csv"));
                List<Student> data = new ArrayList<>();
                String[] lineData;
                String line ="";
                while ((line = br.readLine()) != null){
                    lineData = line.split(",");
                    try {
                        Student student = new Student(lineData[0], lineData[1], Integer.parseInt(lineData[2]),
                                lineData[3] + "," + lineData[4] + "," + lineData[5] + "," + lineData[6]);
                        data.add(student);
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.print("");
                    }
                }
                br.close();
                return data;
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeData(List<Student> list){
        BufferedWriter bw;
            try {
                bw = new BufferedWriter(new FileWriter("menuDemo/StudentManager/src/data.csv"));
                for (Student s :
                        list) {
                    bw.write(s.getId() +","+s.getName()+","+s.getAge()+","+s.getAddress()+"\n");
                }
                bw.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        try {
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
