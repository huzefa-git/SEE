import java.io.*;

public class RenameAFile {
    public static void main(String args[]) {
        File f1 = new File("D:\\JavaFiles\\f1.txt");
        File f2 = new File("D:\\JavaFiles\\f2.txt");
        if (f1.exists()) {
            f1.renameTo(f2);
            System.out.println("Renamed successfully");
        } else {
            System.out.println("File doesn't exist");
        }
    }
}
