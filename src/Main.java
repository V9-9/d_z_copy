import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* Д/з создать приложение побайтового копирования графического файла. Например, файл формата png */
public class Main {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("risunok.png");
             FileOutputStream fileOutputStream = new FileOutputStream("risunok_new.png")) {

            byte[] bytes = new byte[1024];
            int count;
            while ((count = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, count);
            }

            System.out.println("DONE");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}