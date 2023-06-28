package b1;

import java.io.*;

public class SumInFile {
    public static void main(String[] args) throws IOException {
        File file = new File("IOTextfile/src/b1/b1.txt");
        //file.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("5\n");
        bw.write("4\n");
        bw.write("55\n");
        bw.write("0\n");
        bw.write("9\n");
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader(file));
        int sum = 0;
        String line = "";
        while ((line = br.readLine()) != null){
            sum += Integer.parseInt(line);
        }
        System.out.println(sum);

    }
}
