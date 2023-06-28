package b4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
    public static void main(String[] args) throws IOException {
        File file = new File("IOTextfile/src/b4/demoCSV.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            String[] dataLine = line.split(",");
            System.out.println(dataLine[0] + "," + dataLine[2]);
        }
    }
}
