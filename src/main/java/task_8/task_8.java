package task_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class task_8 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\temp\\io\\1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\temp\\io\\2.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1 ) {
                fileOutputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}