package b3;

import java.io.*;

public class FileCopy {
    String pathIn;
    String pathOut;
    File fileIn = new File(pathIn);
    File fileOut = new File(pathOut);
    boolean checkInput (){
        return fileIn.exists();
    }
    boolean checkOutput (){
        return !fileOut.exists();
    }
    public void copy() throws IOException {
        int count = 0;
        if (checkInput() && checkOutput()){
            fileOut.createNewFile();
            FileReader fr = new FileReader(fileIn);
            int character;
            while ((character = fr.read()) != -1){
                count++;
            }
            BufferedReader br = new BufferedReader(fr);
            String data = "";
            String str ="";
            while ((str= br.readLine()) != null){
                data += str;
            }
            br.close();
            FileWriter fw = new FileWriter(fileOut);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
            System.out.println("success with:" + count + " characters");
        } else if (!checkInput()) {
            System.out.println("file nguon khong hop le");
        } else if (!checkOutput()) {
            System.out.println("file dich da duoc tao roi");
        }
    }
}
