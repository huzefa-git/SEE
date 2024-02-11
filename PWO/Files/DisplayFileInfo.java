import java.io.*;

public class DisplayFileInfo {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\JavaFiles", "create.txt");
        if(f.exists()){
            System.out.println("File name:"+f.getName());
            System.out.println("File location"+f.getAbsolutePath());
            System.out.println("File is readable?"+f.canRead());
            System.out.println("File is writable?"+f.canWrite());
            System.out.println("File size:"+f.length());
        }else{
            System.out.println("File doesn't exist");
        }
    }
}
