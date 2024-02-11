package PWO.Threads;
public class ThreadsRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running! using runnable interface");
    }
    public static void main(String args[]){
        ThreadsRunnable obj = new ThreadsRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
    }   
}