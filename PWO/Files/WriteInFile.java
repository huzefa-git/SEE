import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String args[]) throws IOException {
        FileWriter f = new FileWriter("D:\\JavaFiles\\create.txt");
        f.write("hello");
        f.close();
        System.out.println("Succeess!");
        try{
            try{
                f.write("chello");
            }
            finally{
                f.close();
            }
            }catch(IOException e){
                System.out.println(e);
            }
        System.out.println("Data written successfully");
        // FileOutputStream f = new FileOutputStream("D:\\JavaFiles\\create.txt",true);
        // try {
        //     String str = "mohd";
        //     byte[] bytes = str.getBytes();
        //     f.write(bytes);
        // } catch (IOException e) {

        // }
        // System.out.println("Written");

    }
}
