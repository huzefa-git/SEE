// public class objCreation {
//     public static void main(String[] args) {
//         class apple{
//             String color="red";
//             int numOf = 20;
//         }
//         apple obj = new apple();
//         System.out.println(obj.color);
//         System.out.println(obj.numOf);
//     }
// }

// import java.io.IOException;

// public class objCreation{
//         class Apple{
//             String color = "red";
//             int numOf = 20;
//         }
//     public static void main(String[] args) {
//         
//         try{
//             Apple obj = apple.class.newInstance();
//             System.out.println(obj.color);
//             System.out.println(obj.numOf);
//         }catch(Exception e){
            
//         }
//     }
// }

import java.lang.reflect.Constructor;

public class objCreation {
    class apple {
        String color = "red";
        int numOf = 20;
    }
    public static void main(String[] args) {
        
        try {
            Constructor<apple> construct = apple.class.getConstructor();
            apple obj = construct.newInstance();
            System.out.println(obj.color);
            System.out.println(obj.numOf);
        } catch (Exception e) {
            // Handle exceptions
        }
    }
}
