import java.sql.*;
public class FirstProgram {
    public static void main(String[] args) {
        try{
            //1. load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. create a connection
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String username="root";
            String password = "Muz@8867294668";
            Connection con = DriverManager.getConnection(url, username, password);

            if(con.isClosed()){
                System.out.println("Connection is closed.");
            }else{
                System.out.println("Connection is created...");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
