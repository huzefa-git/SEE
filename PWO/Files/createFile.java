import java.io.*;

public class createFile {
    public static void main(String[] args) {
        File f = new File("D:\\JavaFile\\create2.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){

        }
    }
}
