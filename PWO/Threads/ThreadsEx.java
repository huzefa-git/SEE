public class ThreadsEx extends Thread {
    public void run() {
        System.out.println("thread is running by extending thread class");
    }
    public static void main(String args[]) {
        ThreadsEx t1 = new ThreadsEx();
        t1.start();
    }
}