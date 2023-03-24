package ss16_io_text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFIle {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            String line = "";
            fileReader = new FileReader("src/ss16_io_text/name.csv");
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
