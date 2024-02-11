import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String [] args) throws IOException{
        FileInputStream f1 = new FileInputStream("D:\\JavaFiles\\f1.txt");
        FileOutputStream f2 = new FileOutputStream("D:\\JavaFiles\\f2.txt");
        int i;
        while((i=f1.read())!=-1){
            f2.write((char)i);
        }
        System.out.println("Data copied successfully");
    }
}
