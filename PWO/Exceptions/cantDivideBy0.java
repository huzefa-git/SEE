import java.util.Scanner;
import java.io.*;

public class cantDivideBy0 {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum is:" + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide with 0!");
        }
    }

}
