import java.sql.*;
public class ex {
    public static void main(String [] args){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "123456");
            Statement stmt = connection.createStatement();
            ResultSet rsltset = stmt.executeQuery("SELECT * FROM mytable");
            while(rsltset.next()){
                int id = rsltset.getInt("1");
                String name = rsltset.getString("name");
                System.out.println("ID:"+id+"Name:"+name);
            }
            rsltset.close();
            stmt.close();
            connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}