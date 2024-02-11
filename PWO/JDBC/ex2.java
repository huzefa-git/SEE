package PWO.JDBC;

import java.sql.*;

public class ex2 {
    public static void main(String args[]){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:localhost:3304", "root", "234");
            Statement stmt = conn.createStatement();
            ResultSet rsltset = stmt.executeQuery("SELECT * FROM emp");
            while(rsltset.next()){
                System.out.println("Emp id"+rsltset.getInt(1));
                System.out.println("Emp name:"+rsltset.getString("name"));
                System.out.println("Emp sal"+rsltset.getFloat("1"));
            }
            rsltset.close();
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
