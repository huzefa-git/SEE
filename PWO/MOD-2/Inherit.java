class parent{
    public void display1(){
        System.out.println("This is parent class");
    }
}
class child extends parent{
    public void display(){
        System.out.println("This is child class");
    }
}

public class Inherit {
    public static void main(String[] args) {
        child obj = new child();
        obj.display();
        obj.display1();

    }
}
