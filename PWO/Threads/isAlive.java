import java.lang.Exception;

public class isAlive extends Thread {
    public void run(){
        try{
            Thread.sleep(300);
            System.out.println("Run method is alive:" + Thread.currentThread().isAlive());
        } 
        catch (Exception e) {
    
        }
    }
    public static void main(String args[]) {
        isAlive obj = new isAlive();
        System.out.println("Before starting thread:" + Thread.currentThread() + obj.isAlive());
        obj.start();
        System.out.println("After starting a thread:" + Thread.currentThread() + obj.isAlive());
    }
    
}
