class A{
    public void displayA(){
        System.out.println("This is A");
    }
}
class B extends A{
    public void displayB(){
        System.out.println("This is B");
    }
}
public class SingleInherit {
    public static void main(String[] args){
        B obj = new B();
        obj.displayA();
        obj.displayB();
    }
}
