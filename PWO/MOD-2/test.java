class superExample{
    void message(){
        System.out.println("This is super class");
    }
}
class normal extends superExample{
    void message(){
        System.out.println("This is normal class");
    }
    void display(){
        message();
        super.message();
    }
}
public class test{
    public static void main(String[] args){
    normal obj = new normal();
    obj.display();
    }
}
