import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d:/xyz.txt");
    }

    void saveFile() throws FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
    }
}

public class ThrowsTest {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.readFile();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try {
            rw.saveFile();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}
