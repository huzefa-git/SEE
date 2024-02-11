import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String args[]) throws IOException{
            FileReader f = new FileReader("D:\\JavaFiles\\create.txt");
            int i;
            while((i=f.read())!=-1){
                System.out.print((char)i);
        }
    }
}