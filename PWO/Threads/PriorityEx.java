public class PriorityEx extends Thread {
    public void run() {
        System.out.println("Running thread is:" + Thread.currentThread().getName());
        System.out.println("Running thread is:" + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        PriorityEx obj1 = new PriorityEx();
        PriorityEx obj2 = new PriorityEx();
        PriorityEx obj3 = new PriorityEx();
        obj1.setPriority(NORM_PRIORITY);
        obj2.setPriority(MAX_PRIORITY);
        obj3.setPriority(MIN_PRIORITY);
        
        obj1.start();
        obj2.start();
        obj3.start();
    }
}